package com.grace.dataa.eleicao.entities;

import com.grace.dataa.eleicao.entities.Candidato;
import com.grace.dataa.eleicao.entities.Cargo;
import com.grace.dataa.eleicao.entities.Eleicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-24T15:15:02")
@StaticMetamodel(Eleitor.class)
public class Eleitor_ { 

    public static volatile SingularAttribute<Eleitor, Eleicao> eleicao;
    public static volatile SingularAttribute<Eleitor, String> cpf;
    public static volatile SingularAttribute<Eleitor, String> nome;
    public static volatile SingularAttribute<Eleitor, Integer> id;
    public static volatile SingularAttribute<Eleitor, Candidato> candidato;
    public static volatile SingularAttribute<Eleitor, Cargo> cargo;

}