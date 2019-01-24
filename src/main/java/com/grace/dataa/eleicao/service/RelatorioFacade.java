/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grace.dataa.eleicao.service;

import com.grace.dataa.eleicao.entities.Candidato;
import com.grace.dataa.eleicao.entities.Cargo;
import com.grace.dataa.eleicao.entities.Eleicao;
import com.grace.dataa.eleicao.entities.ItemRelatorioContagemVotos;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author grace
 */
@Stateless
public class RelatorioFacade {
    
    @PersistenceContext(unitName = "eleicao")
    private EntityManager em;

    public List<ItemRelatorioContagemVotos> contarVotosDosCandidatos(){
        
        Query query = em.createQuery(
                "SELECT cargo, eleicao, candidato, Count(eleitor) \n" + 
                "FROM Eleitor eleitor \n" + 
                "LEFT JOIN FETCH eleitor.cargo cargo \n" + 
                "LEFT JOIN FETCH eleitor.candidato candidato \n" + 
                "LEFT JOIN FETCH eleitor.eleicao eleicao \n" + 
                "GROUP BY cargo, eleicao, candidato \n");
        
        List<Object[]> resultList = query.getResultList();
        return resultList
                .stream()
                .map(line -> criarItemRelatorioContagemVotos(line))
                .collect(Collectors.toList());
    }
    
    public ItemRelatorioContagemVotos criarItemRelatorioContagemVotos(Object[] elemento){
            return new ItemRelatorioContagemVotos(
                    (Cargo) elemento[0],
                    (Eleicao) elemento[1],
                    (Candidato) elemento[2],
                    (Long) elemento[3]
            );
    }
    
}
