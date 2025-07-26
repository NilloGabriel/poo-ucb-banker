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
import java.util.Scanner;
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
@Table(name = "poupanca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poupanca.findAll", query = "SELECT p FROM Poupanca p"),
    @NamedQuery(name = "Poupanca.findById", query = "SELECT p FROM Poupanca p WHERE p.id = :id"),
    @NamedQuery(name = "Poupanca.findByNumero", query = "SELECT p FROM Poupanca p WHERE p.numero = :numero"),
    @NamedQuery(name = "Poupanca.findByStatus", query = "SELECT p FROM Poupanca p WHERE p.status = :status"),
    @NamedQuery(name = "Poupanca.findByDataCriacao", query = "SELECT p FROM Poupanca p WHERE p.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Poupanca.findBySaldo", query = "SELECT p FROM Poupanca p WHERE p.saldo = :saldo"),
    @NamedQuery(name = "Poupanca.findByGanhoMensal", query = "SELECT p FROM Poupanca p WHERE p.ganhoMensal = :ganhoMensal")})
public class Poupanca implements Serializable, EntidadeBase, ContaMetodos {

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
    private boolean status;
    @Basic(optional = false)
    @Column(name = "dataCriacao")
    @Temporal(TemporalType.DATE)
    private LocalDate dataCriacao;
    @Basic(optional = false)
    @Column(name = "saldo")
    private float saldo;
    @Basic(optional = false)
    @Column(name = "ganhoMensal")
    private float ganhoMensal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "poupancaId")
    private List<Cliente> clienteList;
    @JoinColumn(name = "agencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agencia agenciaId;
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cartao cartaoId;

    public Poupanca() {
    }

    public Poupanca(Integer id) {
        this.id = id;
    }

    public Poupanca(Integer id, String numero, boolean status, LocalDate dataCriacao, float saldo, float ganhoMensal) {
        this.id = id;
        this.numero = numero;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
        this.ganhoMensal = ganhoMensal;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getGanhoMensal() {
        return ganhoMensal;
    }

    public void setGanhoMensal(float ganhoMensal) {
        this.ganhoMensal = ganhoMensal;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poupanca)) {
            return false;
        }
        Poupanca other = (Poupanca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Poupanca[ id=" + id + " ]";
    }

    @Override
    public void sacar(float valor) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuados saques com valor igual ou inferior a 0.\n");
            return;
        }
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("\tSaque de R$" + valor + " efetuado com sucesso!" + "\n\tSaldo atual: R$" + getSaldo() + '\n');
        } else {
            System.out.println("\t\nSaldo insuficiente");
        }
    } 

    @Override
    public void depositar(float valor) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuados depósitos com valor igual ou inferior a 0.\n");
            return;
        }

        this.saldo = this.saldo + valor;
        System.out.println("\t\nDeposito de R$" + valor + " efetuado com sucesso!" + "\t\nSaldo atual: R$" + getSaldo() + '\n');
    }

    @Override
    public void transferir(float valor, String destino) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuadas transferências com valor igual ou inferior a 0.\n");
            return;
        }

        if(valor <= getSaldo()) {
            this.sacar(valor);
            System.out.println("\t\nTransferência realizada com sucesso!" + "\t\nSaldo atual: R$:" + getSaldo() + '\n');
        } else {
            System.out.println("\t\nSaldo insuficiente.");
        }
    }

    @Override
    public int randomNumber(int n) {
        int randNum = (int) (Math.random() * n);
        return randNum;
    }

    @Override
    public String gerarNumerodaConta() {
        int n = 9;

        int num[] = new int[9];

        for (int i = 0; i < 9; i++) {
            num[i] = randomNumber(n);
        }

        return this.numero = "" + num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + '-' + num[8];
    }

    @Override
    public void fazerCompra() { //Hadaptar para as telas
        Scanner scanner = new Scanner(System.in);
        float valor;
        int operacao;
//        cartao.verificarCartao();
//        System.out.println("Qual o valor da compra que ira ser realizada?");
//        valor = scanner.nextFloat();
//        System.out.println("Digite a operação de compra");
//        System.out.println("1 - Debito");
//        System.out.println("2 - Credito");
//        operacao = scanner.nextInt();
//        boolean situacao = cartao.utilizarCreditoOuDebito(operacao, valor);
//        if(situacao){
//            if(operacao == 1){
//                if(valor <= saldo)
//                    saldo -= valor;
//                else {
//                    System.out.println("Não foi possivel realizar a compra com o saldo atual");
//                    return;
//                }
//            }
//            System.out.println("Compra Realizada");
//            return;
//        }else {
//            System.out.println("Não foi possivel realizar a compra");
//        }
    }
    
}
