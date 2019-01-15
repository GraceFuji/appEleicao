# appEleicao
Aplicação para cadastro e gerenciamento de uma eleicao interna de uma empresa. O aplicativo tem como público alvo pessoas que trabalham dentro de entidades de previdência complementar e que desejam realizar eleições para preencher cargos de dentro da própria entidade.

-----------------------------------x----------------------------------x---------------
Ferramentas Utilizadas

NetBeans - Java Web - JSF - XHTML
Mysql - Banco de Dados - SQL
-----------------------------------x----------------------------------x---------------
Cronograma

Estimativa de tempo de trabalho 14 dias +- / 334horas

-----------------------------------x----------------------------------x---------------
Modelos de Dados

Tabela Eleicao
id int auto_increment not null Primary Key
nome varchar(50) not null
dt_inicio date not null
dt_fim date not null

Tabela Cargo
id int auto_increment not null Primary Key
nome varchar(50)not null

Tabela Candidato
id int auto_increment not null Primary Key
nome varchar(50) not null
cargo char(50) not null

Tabela Eleitor
id int auto_increment not null Primary Key
nome varchar(50) not null
CPF varchar(50) not null

Tabela Votar
id int auto_increment not null Primary Key
nome varchar(50) not null
Constraint 'candidato_FK' Foreign Key ('id') References 'candidato' ('id')
Constraint 'Eleicao_FK' Foreign Key ('id') References 'eleicao' ('id')

-----------------------------------x----------------------------------x---------------
Relatório de Conquistas - Funcionalidade do Sistema

            Cadastros Funcionando     
                  Eleicao       ✓      
                  Cargo         ✓
                  Candidato     ✓       
                  Eleitor       ✓
                  Voto          ✓

    -------------------------------------
             Funcionalidades Extras
             ----------------------
                Área do Candidato
 
        Cadastros exibidos em combo(select)  ✓
                Upload de foto               x
               Exibição da foto              x
       
       
                Área do Eleitor
         Votar somente se houver eleicao aberta         x
     Exibir os cargos com os respectivos candidatos     x
       Selecionar apenas uma candidato por cargo        ✓
             Botão de conclusão do voto                 ✓
               Protocolo do votante                     x
               
               
                   Relatórios
        Relatório dividido em parcial e final           x
        
        
          Requisições a parte do relatório
                -------------------
        - Quantidade de pessoas que já votaram          ✓
    - organização da quantidade de votos por candidato  x
                 
       

 --------------------------------------------------------------------------------------
 OBS: Linguagens aprendidados durante o desenvolvimento
      - XHTML
      - JAVA/JSF
      
 --------------------------------------------------------------------------------------
 Prazo do teste
 10 ias
