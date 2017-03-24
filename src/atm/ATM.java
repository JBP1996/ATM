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
public class ATM {
    static Pessoa p;    
    static ArrayList <Pessoa> ap = new ArrayList<Pessoa>();
    static ContaBancaria cb;
    static ArrayList <ContaBancaria> acb = new ArrayList<ContaBancaria>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        do{
            System.out.println("Escolha uma opcao");
            System.out.println(" 1- Inserir Conta\n 2- Entrar em Conta\n 3- Sair");
            opc = new Scanner(System.in).nextInt();
            switch(opc){
                case 1:{
                    inserir(p,ap,cb,acb);
                    break;
                    }
                case 2:{
                    //entrar();
                    break;
                    }
                case 3:{
                    System.exit(0);
                    break;
                    }
                default:{
                    System.out.println("Opcao inexistente");
                    break;
                    }
            }
        }while(opc!=3);
        
        /*
        System.out.println("Insira o numero de conta");
        int id = new Scanner(System.in).nextInt(); 
        */
    }
    
    public static void inserir(Pessoa p,ArrayList <Pessoa> ap,ContaBancaria cb,ArrayList <ContaBancaria> acb){
        
        int opcao;
        Double preco = 0.0;

        System.out.println("CRIAR UMA CONTA");
        
        System.out.println("Insira o nome de um titular");
        String nome= new Scanner(System.in).nextLine();
        
        System.out.println("Deseja colocar saldo na conta?\n Sim - 1\n Não - outro valor");
        opcao = new Scanner(System.in).nextInt(); 
        if(opcao==1){
            System.out.println("Insira a quantidade que deseja inserir");
            preco= new Scanner(System.in).nextDouble();
        }        
        
        p = new Pessoa(nome);
        ap.add(p);
        
        cb = new ContaBancaria(acb.size(),p,preco);
        acb.add(cb);
        
    }
}
