package entity;

import entity.CadastroImovel;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-06-06T19:19:17")
@StaticMetamodel(CadastroComprador.class)
public class CadastroComprador_ { 

    public static volatile SingularAttribute<CadastroComprador, String> telefone;
    public static volatile SingularAttribute<CadastroComprador, String> cidade;
    public static volatile SingularAttribute<CadastroComprador, String> numero;
    public static volatile SingularAttribute<CadastroComprador, String> endereco;
    public static volatile ListAttribute<CadastroComprador, CadastroImovel> imoveis;
    public static volatile SingularAttribute<CadastroComprador, String> bairro;
    public static volatile SingularAttribute<CadastroComprador, String> profissao;
    public static volatile SingularAttribute<CadastroComprador, String> cpfConjuge;
    public static volatile SingularAttribute<CadastroComprador, String> nome;
    public static volatile SingularAttribute<CadastroComprador, String> estadoCivil;
    public static volatile SingularAttribute<CadastroComprador, String> renda;
    public static volatile SingularAttribute<CadastroComprador, String> rendaConjuge;
    public static volatile SingularAttribute<CadastroComprador, String> cep;
    public static volatile SingularAttribute<CadastroComprador, String> nomeConjuge;
    public static volatile SingularAttribute<CadastroComprador, String> uf;
    public static volatile SingularAttribute<CadastroComprador, String> dataNasc;
    public static volatile SingularAttribute<CadastroComprador, String> complemento;
    public static volatile SingularAttribute<CadastroComprador, String> dataNascConjuge;
    public static volatile SingularAttribute<CadastroComprador, String> profissaoConjuge;
    public static volatile SingularAttribute<CadastroComprador, String> logradouro;
    public static volatile SingularAttribute<CadastroComprador, String> cpf;
    public static volatile SingularAttribute<CadastroComprador, String> celular;
    public static volatile SingularAttribute<CadastroComprador, Integer> id;
    public static volatile SingularAttribute<CadastroComprador, String> email;

}