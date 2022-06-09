/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author nicol
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "CadastroImovel.findAll", query = "Select c from CadastroImovel c"),
    @NamedQuery(name = "CadastroImovel.findById", query = "Select c from CadastroImovel  c where c.id = :codigo")
})
public class CadastroImovel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = ("lagradouro_imovel"), length = 20, nullable = false)
    private String logradouro;

    @Column(name = ("endereço_imovel"),length = 100, nullable = false, unique = false)
    private double endereco;

    @Column(name = ("numero_imovel"),length = 5, nullable = false)
    private int numero;

    @Column(name = ("complemento_imovel"),length = 20, nullable = false, unique = false)
    private double complemento;

    @Column(name = ("bairro_imovel"),length = 40, nullable = false, unique = false)
    private String bairro;

    @Column(name = ("cidade_imovel"),length = 40, nullable = false, unique = false)
    private String cidade;

    @Column(name = ("uf_imovel"),length = 2, nullable = false, unique = false)
    private String uf;

    @Column(name = ("cep_imovel"),length = 8, nullable = false)
    private String cep;
    
    
    @ManyToOne
    @JoinColumn(name = "id_comprador_imovel")
    private CadastroComprador cadastroComprador;
    
    //
    @ManyToOne
    @JoinColumn(name = "id_proprietario_imovel")
    private ProprietarioImovel proprietarioImovel;

    public CadastroImovel(int id, String logradouro, double endereco, int numero, double complemento, String bairro, String cidade, String uf, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }   
    

    public CadastroImovel() {
    }   

    public CadastroComprador getCadastroComprador() {
        return cadastroComprador;
    }

    public void setCadastroComprador(CadastroComprador cadastroComprador) {
        this.cadastroComprador = cadastroComprador;
    }
    
    
    

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getEndereco() {
        return endereco;
    }

    public void setEndereco(double endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
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
        if (!(object instanceof CadastroImovel)) {
            return false;
        }
        CadastroImovel other = (CadastroImovel) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CadastroImovel[ id=" + id + " ]";
    }

}
