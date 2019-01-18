package com.grace.dataa.eleicao.entities;

import com.grace.dataa.eleicao.entities.Candidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-18T00:44:50")
@StaticMetamodel(Votar.class)
public class Votar_ { 

    public static volatile SingularAttribute<Votar, String> cpf;
    public static volatile SingularAttribute<Votar, String> nome;
    public static volatile SingularAttribute<Votar, Integer> id;
    public static volatile SingularAttribute<Votar, Candidato> candidato;

}