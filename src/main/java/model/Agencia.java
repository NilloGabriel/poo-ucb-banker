/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.EntidadeBase;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mateu
 */
@Entity
@Table(name = "agencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findById", query = "SELECT a FROM Agencia a WHERE a.id = :id"),
    @NamedQuery(name = "Agencia.findByNumero", query = "SELECT a FROM Agencia a WHERE a.numero = :numero"),
    @NamedQuery(name = "Agencia.findByNumeroBanco", query = "SELECT a FROM Agencia a WHERE a.numeroBanco = :numeroBanco")})
public class Agencia implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "numeroBanco")
    private int numeroBanco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agenciaId")
    private List<Corrente> correnteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agenciaId")
    private List<Poupanca> poupancaList;
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Endereco enderecoId;

    public Agencia() {
    }

    public Agencia(Integer id) {
        this.id = id;
    }

    public Agencia(String numero, int numeroBanco, Endereco enderecoId) {
        this.numero = numero;
        this.numeroBanco = numeroBanco;
        this.enderecoId = enderecoId;
    }
    
    

    public Agencia(Integer id, String numero, int numeroBanco) {
        this.id = id;
        this.numero = numero;
        this.numeroBanco = numeroBanco;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    @XmlTransient
    public List<Corrente> getCorrenteList() {
        return correnteList;
    }

    public void setCorrenteList(List<Corrente> correnteList) {
        this.correnteList = correnteList;
    }

    @XmlTransient
    public List<Poupanca> getPoupancaList() {
        return poupancaList;
    }

    public void setPoupancaList(List<Poupanca> poupancaList) {
        this.poupancaList = poupancaList;
    }

    public Endereco getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Endereco enderecoId) {
        this.enderecoId = enderecoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Agencia[ id=" + id + " ]";
    }
    
}
