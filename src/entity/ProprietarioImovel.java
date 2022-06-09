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
import javax.persistence.OneToMany;

/**
 *
 * @author nicol
 */
@Entity
public class ProprietarioImovel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = ("nome_proprietario"), length = 200, nullable = false)
    private String nome;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(length = 40, nullable = false)
    private String profissao;

    @Column(length = 12, nullable = false)
    private String celular;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String logradouro;

    @Column(length = 100, nullable = false)
    private double endereco;

    @Column(length = 5, nullable = false)
    private int numero;

    @Column(length = 20, nullable = false)
    private double complemento;

    @Column(length = 40, nullable = false)
    private String bairro;

    @Column(length = 40, nullable = false)
    private String cidade;

    @Column(length = 2, nullable = false)
    private String uf;

    @Column(length = 8, nullable = false)
    private String cep;

    @Column(name = ("estado_civil"), length = 15, nullable = false)
    private double estadoCivil;

    @Column(name = ("nome_conjuge"), length = 200, nullable = true)
    private String nomeConjuge;

    @Column(name = ("cpf_conjuge"), length = 11, nullable = true)
    private String cpfConjuge;

    @Column(name = ("profissao_conjuge"), length = 40, nullable = true)
    private String profissaoConjuge;

    @OneToMany(mappedBy = "proprietarioImovel")
    private ArrayList<CadastroImovel> imoveis;

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
        if (!(object instanceof ProprietarioImovel)) {
            return false;
        }
        ProprietarioImovel other = (ProprietarioImovel) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ProprietarioImovel[ id=" + id + " ]";
    }

}
