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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByNascimento", query = "SELECT c FROM Cliente c WHERE c.nascimento = :nascimento"),
    @NamedQuery(name = "Cliente.findByComprovanteResidencia", query = "SELECT c FROM Cliente c WHERE c.comprovanteResidencia = :comprovanteResidencia"),
    @NamedQuery(name = "Cliente.findByRg", query = "SELECT c FROM Cliente c WHERE c.rg = :rg"),
    @NamedQuery(name = "Cliente.findByEmailLogin", query = "SELECT c FROM Cliente c WHERE c.emailLogin = :emailLogin"),
    @NamedQuery(name = "Cliente.findBySenhaLogin", query = "SELECT c FROM Cliente c WHERE c.senhaLogin = :senhaLogin"),
    @NamedQuery(name = "Cliente.findByLogStatuslogin", query = "SELECT c FROM Cliente c WHERE c.logStatuslogin = :logStatuslogin")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "nascimento")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    @Basic(optional = false)
    @Column(name = "comprovanteResidencia")
    private short comprovanteResidencia;
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "email_login")
    private String emailLogin;
    @Basic(optional = false)
    @Column(name = "senha_login")
    private String senhaLogin;
    @Basic(optional = false)
    @Column(name = "logStatus_login")
    private short logStatuslogin;
    @JoinColumn(name = "corrente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Corrente correnteId;
    @JoinColumn(name = "poupanca_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Poupanca poupancaId;
    @OneToMany(mappedBy = "clienteId")
    private List<Endereco> enderecoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteId")
    private List<Contato> contatoList;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente(Integer id, String cpf, String nome, Date nascimento, short comprovanteResidencia, String rg, String emailLogin, String senhaLogin, short logStatuslogin) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.comprovanteResidencia = comprovanteResidencia;
        this.rg = rg;
        this.emailLogin = emailLogin;
        this.senhaLogin = senhaLogin;
        this.logStatuslogin = logStatuslogin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public short getComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(short comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public short getLogStatuslogin() {
        return logStatuslogin;
    }

    public void setLogStatuslogin(short logStatuslogin) {
        this.logStatuslogin = logStatuslogin;
    }

    public Corrente getCorrenteId() {
        return correnteId;
    }

    public void setCorrenteId(Corrente correnteId) {
        this.correnteId = correnteId;
    }

    public Poupanca getPoupancaId() {
        return poupancaId;
    }

    public void setPoupancaId(Poupanca poupancaId) {
        this.poupancaId = poupancaId;
    }

    @XmlTransient
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    @XmlTransient
    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cliente[ id=" + id + " ]";
    }
    
}
