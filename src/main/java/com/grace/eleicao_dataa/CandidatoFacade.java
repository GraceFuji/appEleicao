/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grace.eleicao_dataa;

import com.grace.eleicao_dataa_entities.Candidato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author grace
 */
@Stateless
public class CandidatoFacade extends AbstractFacade<Candidato> {
    @PersistenceContext(unitName = "eleicao")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CandidatoFacade() {
        super(Candidato.class);
    }
    
}