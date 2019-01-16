package com.grace.eleicao_dataa_entities;

import com.grace.eleicao_dataa_entities.Cargo;
import com.grace.eleicao_dataa_entities.Eleitor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-16T16:14:24")
@StaticMetamodel(Candidato.class)
public class Candidato_ { 

    public static volatile SingularAttribute<Candidato, String> nome;
    public static volatile SingularAttribute<Candidato, Integer> id;
    public static volatile SingularAttribute<Candidato, Cargo> cargo;
    public static volatile SingularAttribute<Candidato, Eleitor> eleitor;

}