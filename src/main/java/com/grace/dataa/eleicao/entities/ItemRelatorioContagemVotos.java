/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grace.dataa.eleicao.entities;

/**
 *
 * @author grace
 */
public class ItemRelatorioContagemVotos {
    
    private Cargo cargo;
    private Eleicao eleicao;
    private Candidato candidato;
    private Long contagem;

    
    public ItemRelatorioContagemVotos () {}
    
    public ItemRelatorioContagemVotos (Cargo cargo, Eleicao eleicao, Candidato candidato, Long contagem){
        this.cargo = cargo;
        this.eleicao = eleicao;
        this.candidato = candidato;
        this.contagem = contagem;
    }
    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the eleicao
     */
    public Eleicao getEleicao() {
        return eleicao;
    }

    /**
     * @param eleicao the eleicao to set
     */
    public void setEleicao(Eleicao eleicao) {
        this.eleicao = eleicao;
    }

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    /**
     * @return the contagem
     */
    public Long getContagem() {
        return contagem;
    }

    /**
     * @param contagem the contagem to set
     */
    public void setContagem(Long contagem) {
        this.contagem = contagem;
    }
    
}
