/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grace.dataa.eleicao.controller;

import com.grace.dataa.eleicao.entities.ItemRelatorioContagemVotos;
import com.grace.dataa.eleicao.service.RelatorioFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author grace
 */
@Named("relatorioController")
@RequestScoped
public class RelatorioController implements Serializable{
    
    @Inject 
    private RelatorioFacade relatorioFacade;
    private List<ItemRelatorioContagemVotos> votosCandidatos;
    
    @PostConstruct
    public void init(){
        votosCandidatos = relatorioFacade.contarVotosDosCandidatos();
    }
    
    
    public List<ItemRelatorioContagemVotos> getVotosCandidatos () {
            return votosCandidatos;
    }
}
