package com.grace.dataa.eleicao.entities;

import com.grace.dataa.eleicao.entities.Eleitor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-24T15:15:02")
@StaticMetamodel(Eleicao.class)
public class Eleicao_ { 

    public static volatile SingularAttribute<Eleicao, Date> dataFim;
    public static volatile SingularAttribute<Eleicao, String> nome;
    public static volatile SingularAttribute<Eleicao, Integer> id;
    public static volatile SingularAttribute<Eleicao, Date> dataInicio;
    public static volatile SingularAttribute<Eleicao, Eleitor> eleitor;

}