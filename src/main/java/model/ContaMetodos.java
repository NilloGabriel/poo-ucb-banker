/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author mateu
 */
public interface ContaMetodos {
    public void sacar(float valor);
    public void depositar(float valor);
    public void transferir(float valor, String destino);
    public int randomNumber(int n);
    public String gerarNumerodaConta();
    public void fazerCompra();
} 

