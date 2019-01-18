package com.grace.eleicao_dataa_entities;

import com.grace.eleicao_dataa_entities.Candidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-17T23:28:46")
@StaticMetamodel(Votar.class)
public class Votar_ { 

    public static volatile SingularAttribute<Votar, String> cpf;
    public static volatile SingularAttribute<Votar, String> nome;
    public static volatile SingularAttribute<Votar, Integer> id;
    public static volatile SingularAttribute<Votar, Candidato> candidato;

}