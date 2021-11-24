/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mateu
 */
@Entity
@Table(name = "corrente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corrente.findAll", query = "SELECT c FROM Corrente c"),
    @NamedQuery(name = "Corrente.findById", query = "SELECT c FROM Corrente c WHERE c.id = :id"),
    @NamedQuery(name = "Corrente.findByNumero", query = "SELECT c FROM Corrente c WHERE c.numero = :numero"),
    @NamedQuery(name = "Corrente.findByStatus", query = "SELECT c FROM Corrente c WHERE c.status = :status"),
    @NamedQuery(name = "Corrente.findByDataCriacao", query = "SELECT c FROM Corrente c WHERE c.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Corrente.findBySaldo", query = "SELECT c FROM Corrente c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Corrente.findByGanhoMensal", query = "SELECT c FROM Corrente c WHERE c.ganhoMensal = :ganhoMensal")})
public class Corrente implements Serializable {

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
    @Column(name = "status")
    private short status;
    @Basic(optional = false)
    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Basic(optional = false)
    @Column(name = "saldo")
    private long saldo;
    @Basic(optional = false)
    @Column(name = "ganhoMensal")
    private long ganhoMensal;
    @JoinColumn(name = "agencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agencia agenciaId;
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cartao cartaoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "correnteId")
    private List<Cliente> clienteList;

    public Corrente() {
    }

    public Corrente(Integer id) {
        this.id = id;
    }

    public Corrente(Integer id, String numero, short status, Date dataCriacao, long saldo, long ganhoMensal) {
        this.id = id;
        this.numero = numero;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
        this.ganhoMensal = ganhoMensal;
    }

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

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getGanhoMensal() {
        return ganhoMensal;
    }

    public void setGanhoMensal(long ganhoMensal) {
        this.ganhoMensal = ganhoMensal;
    }

    public Agencia getAgenciaId() {
        return agenciaId;
    }

    public void setAgenciaId(Agencia agenciaId) {
        this.agenciaId = agenciaId;
    }

    public Cartao getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(Cartao cartaoId) {
        this.cartaoId = cartaoId;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
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
        if (!(object instanceof Corrente)) {
            return false;
        }
        Corrente other = (Corrente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Corrente[ id=" + id + " ]";
    }
    
}