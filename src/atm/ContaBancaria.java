/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author JBP1996 Atec
 */
public class ContaBancaria{
    private int numero;
    private Pessoa titular;
    private double saldo;
    

    public ContaBancaria(int numero, Pessoa titular, double saldo) {
        this.numero = numero;  
        this.titular = titular;
        this.saldo = saldo; 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
