/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grace.dataa.eleicao.service;

import com.grace.dataa.eleicao.entities.Eleicao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author grace
 */
@Stateless
public class EleicaoFacade extends AbstractFacade<Eleicao> {
    @PersistenceContext(unitName = "eleicao")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EleicaoFacade() {
        super(Eleicao.class);
    }
    
}
