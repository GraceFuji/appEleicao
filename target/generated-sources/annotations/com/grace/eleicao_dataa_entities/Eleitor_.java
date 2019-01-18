package com.grace.eleicao_dataa_entities;

import com.grace.eleicao_dataa_entities.Candidato;
import com.grace.eleicao_dataa_entities.Eleicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-17T23:28:46")
@StaticMetamodel(Eleitor.class)
public class Eleitor_ { 

    public static volatile SingularAttribute<Eleitor, Eleicao> eleicao;
    public static volatile SingularAttribute<Eleitor, String> cpf;
    public static volatile SingularAttribute<Eleitor, String> nome;
    public static volatile SingularAttribute<Eleitor, Integer> id;
    public static volatile SingularAttribute<Eleitor, Candidato> candidato;

}