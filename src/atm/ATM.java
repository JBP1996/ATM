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
        funcionalidade func = new funcionalidade();
        int opc=0;
        while(opc!=4){
            System.out.println("Escolha uma opcao");
            System.out.println(" 1- Inserir Conta\n 2- Listar contas\n 3- Entrar em Conta\n 4- Sair");
            opc = new Scanner(System.in).nextInt();
            switch(opc){
                case 1:{
                    func.inserir(p,ap,cb,acb);
                    break;
                    }
                case 2:{
                    func.listar();
                }
                case 3:{
                    //entrar();
                    break;
                    }
                case 4:{
                    System.exit(0);
                    break;
                    }
                default:{
                    System.out.println("Opcao inexistente");
                    break;
                    }
            }
        };
        
        /*
        System.out.println("Insira o numero de conta");
        int id = new Scanner(System.in).nextInt(); 
        */
    }
}
