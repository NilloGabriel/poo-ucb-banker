/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.EntidadeBase;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "cartao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartao.findAll", query = "SELECT c FROM Cartao c"),
    @NamedQuery(name = "Cartao.findById", query = "SELECT c FROM Cartao c WHERE c.id = :id"),
    @NamedQuery(name = "Cartao.findByNumero", query = "SELECT c FROM Cartao c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cartao.findByDebito", query = "SELECT c FROM Cartao c WHERE c.debito = :debito"),
    @NamedQuery(name = "Cartao.findByCredito", query = "SELECT c FROM Cartao c WHERE c.credito = :credito"),
    @NamedQuery(name = "Cartao.findByLimiteTotal", query = "SELECT c FROM Cartao c WHERE c.limiteTotal = :limiteTotal"),
    @NamedQuery(name = "Cartao.findByLimiteUsado", query = "SELECT c FROM Cartao c WHERE c.limiteUsado = :limiteUsado"),
    @NamedQuery(name = "Cartao.findByTitular", query = "SELECT c FROM Cartao c WHERE c.titular = :titular"),
    @NamedQuery(name = "Cartao.findByValidade", query = "SELECT c FROM Cartao c WHERE c.validade = :validade"),
    @NamedQuery(name = "Cartao.findByCvc", query = "SELECT c FROM Cartao c WHERE c.cvc = :cvc"),
    @NamedQuery(name = "Cartao.findBySenha", query = "SELECT c FROM Cartao c WHERE c.senha = :senha"),
    @NamedQuery(name = "Cartao.findBySituacao", query = "SELECT c FROM Cartao c WHERE c.situacao = :situacao")})
public class Cartao implements Serializable, EntidadeBase {

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
    @Column(name = "debito")
    private boolean debito;
    @Basic(optional = false)
    @Column(name = "credito")
    private boolean credito;
    @Basic(optional = false)
    @Column(name = "limiteTotal")
    private float limiteTotal;
    @Basic(optional = false)
    @Column(name = "limiteUsado")
    private float limiteUsado;
    @Basic(optional = false)
    @Column(name = "titular")
    private String titular;
    @Basic(optional = false)
    @Column(name = "validade")
    @Temporal(TemporalType.DATE)
    private LocalDate validade;
    @Basic(optional = false)
    @Column(name = "cvc")
    private short cvc;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "situacao")
    private boolean situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartaoId")
    private List<Corrente> correnteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartaoId")
    private List<Poupanca> poupancaList;

    public Cartao() {
    }

    public Cartao(Integer id) {
        this.id = id;
    }

    public Cartao(Integer id, String numero, boolean debito, boolean credito, float limiteTotal, float limiteUsado, String titular, LocalDate validade, short cvc, String senha, boolean situacao) {
        this.id = id;
        this.numero = numero;
        this.debito = debito;
        this.credito = credito;
        this.limiteTotal = limiteTotal;
        this.limiteUsado = limiteUsado;
        this.titular = titular;
        this.validade = validade;
        this.cvc = cvc;
        this.senha = senha;
        this.situacao = situacao;
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

    public boolean getDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean getCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public float getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(float limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public float getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(long limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public short getCvc() {
        return cvc;
    }

    public void setCvc(short cvc) {
        this.cvc = cvc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cartao[ id=" + id + " ]";
    }
    
    public boolean verificarCartao(){
        LocalDate hoje = LocalDate.now();
        return hoje != this.validade;
    }
    
    public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
    }
    
    public boolean utilizarCreditoOuDebito(int op, float valor) {//se for op=1 debito se op=2 credito
        this.situacao = verificarCartao();
        if(this.situacao == true){
            switch (op) {
                case 1:
                    return true; //valor sera cobrado e checado na conta
                case 2:
                    if (valor + this.limiteUsado <= this.limiteTotal) {
                        this.limiteUsado += valor;
                        return true;
                    }
                    System.out.println("Limite esgotado");
                    return false;
            }
        }
        return false;
    }
    public void renovarCartao() {
        this.situacao = verificarCartao();
        if(this.situacao == false)
            calcularValidade();
    }

    private LocalDate calcularValidade(){
        LocalDate hoje = LocalDate.now();
        return hoje.plusYears(4);
    }

    private String gerarNumeroCartao(){
        String number = "";
        int num;

        for(int i = 0; i < 4; i++) {
            num = (int) (Math.random() * 10);
            number += num;
        }

        return number;
    }

    private String gerarNumeroFormatado() {
        return this.numero = gerarNumeroCartao() + " " + gerarNumeroCartao() + " " + gerarNumeroCartao() + " " + gerarNumeroCartao();
    }

    private int gerarCvc(){
        int cvc;
        Random random = new Random();
        do {
            cvc = random.nextInt(999);
        }while(cvc < 100);
        return cvc;
    }
}
