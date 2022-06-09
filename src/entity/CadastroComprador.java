/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nicol
 */
@Entity
@Table(name = "tb_comprador")
@NamedQueries({
    @NamedQuery(name = "CadastroComprador.findAll", query = "Select c from CadastroComprador c"),
    @NamedQuery(name = "CadastroComprador.findById", query = "Select c from CadastroComprador c where c.id = :codigo"),
    @NamedQuery(name = "CadastroComprador.findById", query = "Select c from CadastroComprador c where c.id = :codigo")
     
})
public class CadastroComprador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = ("data_nascimento"), length = 8, nullable = false)
    private String dataNasc;

    @Column(length = 40, nullable = false)
    private String profissao;

    @Column(length = 10, nullable = false)
    private String renda;

    @Column(length = 12, nullable = false)
    private String celular;

    @Column(length = 12, nullable = false)
    private String telefone;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String logradouro;

    @Column(length = 100, nullable = false)
    private String endereco;

    @Column(length = 5, nullable = false)
    private String numero;

    @Column(length = 20, nullable = false)
    private String complemento;

    @Column(length = 40, nullable = false)
    private String bairro;

    @Column(length = 40, nullable = false)
    private String cidade;

    @Column(length = 2, nullable = false)
    private String uf;

    @Column(length = 8, nullable = false)
    private String cep;

    @Column(name = ("estado_civil"), length = 15, nullable = false)
    private String estadoCivil;

    @Column(name = ("nome_conjuge"), length = 200, nullable = true)
    private String nomeConjuge;

    @Column(name = ("cpf_conjuge"),length = 11, nullable = true)
    private String cpfConjuge;

    @Column(name = ("dt_nasc_conjuge"),length = 8, nullable = true)
    private String dataNascConjuge;

    @Column(name = ("profissao_conjuge"),length = 40, nullable = true)
    private String profissaoConjuge;

    @Column(name = ("renda_conjuge"),length = 10, nullable = true)
    private String rendaConjuge;
    
    @OneToMany(mappedBy = "cadastroComprador")
    private ArrayList<CadastroImovel> imoveis;

    public CadastroComprador(int id, String nome, String cpf, String dataNasc, String profissao, String renda, String celular, String telefone, String email, String logradouro, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String estadoCivil, String nomeConjuge, String cpfConjuge, String dataNascConjuge, String profissaoConjuge, String rendaConjuge) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.profissao = profissao;
        this.renda = renda;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
        this.nomeConjuge = nomeConjuge;
        this.cpfConjuge = cpfConjuge;
        this.dataNascConjuge = dataNascConjuge;
        this.profissaoConjuge = profissaoConjuge;
        this.rendaConjuge = rendaConjuge;
    }

    public CadastroComprador(int id, String nome, String cpf, String dataNasc, String profissao, String renda, String celular, String telefone, String email, String logradouro, String endereco, String numero, String complemento, String bairro, String cidade, String uf, String cep, String estadoCivil) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.profissao = profissao;
        this.renda = renda;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.estadoCivil = estadoCivil;
    }
    
    

    public CadastroComprador() {
        
    }

    public ArrayList<CadastroImovel> getImoveis() {
        return imoveis;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public String getCpfConjuge() {
        return cpfConjuge;
    }

    public void setCpfConjuge(String cpfConjuge) {
        this.cpfConjuge = cpfConjuge;
    }

    public String getDataNascConjuge() {
        return dataNascConjuge;
    }

    public void setDataNascConjuge(String dataNascConjuge) {
        this.dataNascConjuge = dataNascConjuge;
    }

    public String getProfissaoConjuge() {
        return profissaoConjuge;
    }

    public void setProfissaoConjuge(String profissaoConjuge) {
        this.profissaoConjuge = profissaoConjuge;
    }

    public String getRendaConjuge() {
        return rendaConjuge;
    }

    public void setRendaConjuge(String rendaConjuge) {
        this.rendaConjuge = rendaConjuge;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroComprador)) {
            return false;
        }
        CadastroComprador other = (CadastroComprador) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CadastroComprador[ id=" + id + " ]";
    }

}
