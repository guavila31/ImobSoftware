package entity;

import entity.CadastroComprador;
import entity.ProprietarioImovel;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-06-06T19:19:17")
@StaticMetamodel(CadastroImovel.class)
public class CadastroImovel_ { 

    public static volatile SingularAttribute<CadastroImovel, String> uf;
    public static volatile SingularAttribute<CadastroImovel, String> cidade;
    public static volatile SingularAttribute<CadastroImovel, ProprietarioImovel> proprietarioImovel;
    public static volatile SingularAttribute<CadastroImovel, Double> complemento;
    public static volatile SingularAttribute<CadastroImovel, Double> endereco;
    public static volatile SingularAttribute<CadastroImovel, Integer> numero;
    public static volatile SingularAttribute<CadastroImovel, CadastroComprador> cadastroComprador;
    public static volatile SingularAttribute<CadastroImovel, String> logradouro;
    public static volatile SingularAttribute<CadastroImovel, String> bairro;
    public static volatile SingularAttribute<CadastroImovel, Integer> id;
    public static volatile SingularAttribute<CadastroImovel, String> cep;

}