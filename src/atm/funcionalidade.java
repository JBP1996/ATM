/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JBP1996 Atec
 */
public class funcionalidade {
    ArrayList <Pessoa> ap = Principal.ap;
    ArrayList <ContaBancaria> acb= Principal.acb;
       
    public void inserirPessoa(Pessoa p,ArrayList <Pessoa> ap,String nome){
        p = new Pessoa(nome);
        ap.add(p);
    }
}
