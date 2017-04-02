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
    
    public void inserir(Pessoa p,ArrayList <Pessoa> ap,ContaBancaria cb,ArrayList <ContaBancaria> acb){
        int opcao=0;

        while(opcao!=1 && opcao!=2){
        System.out.println("O que Deseja inserir:\n 1- Pessoa\n 2- Conta Bancaria\n");
        opcao = new Scanner(System.in).nextInt();
            if(opcao==1){
                System.out.println("ADICICIONAR UMA PESSOA");
                
                System.out.println("Insira o nome de um titular");
                String nome= new Scanner(System.in).nextLine();
                if(ap.size()!=0){

                    for(int i=0;i<ap.size();i++){
                        if(nome.equals(ap.get(i).getNome())){
                            System.out.println("Este nome ja possui conta");
                            
                            System.out.println("Deseja adicionar uma?\n 1- Sim\n Outro valor- Nao");
                            opcao = new Scanner(System.in).nextInt();
                            if(opcao==1){
                                inserirConta(ap.get(i).getNome(), cb, acb,ap);
                            }else{
                                break;
                            }
                        }else if(i==ap.size()-1 && !nome.equals(ap.get(i).getNome())){
                            System.out.println("Este nome nao possui conta");
                            System.out.println("Deseja criar uma?\n 1- Sim\n Outro valor- Nao");
                            opcao = new Scanner(System.in).nextInt();
                            if(opcao==1){
                                inserirPessoa(p, ap, nome);
                                inserirConta(ap.get(ap.size()-1).getNome(), cb, acb,ap);
                            }else{
                                break;
                            }
                        }   
                    }
                }else{
                    inserirPessoa(p, ap, nome);
                    inserirConta(ap.get(ap.size()-1).getNome(), cb, acb,ap);
                }   
            }else if(opcao==2){
            
            }else{
                System.out.println("Opcao inexistente\n Tente novamente"); 
            }
        } 
    }
    
    public void inserirPessoa(Pessoa p,ArrayList <Pessoa> ap,String nome){
        p = new Pessoa(nome);
        ap.add(p);
    }
    
    public void inserirConta(String nome,ContaBancaria cb,ArrayList <ContaBancaria> acb,ArrayList <Pessoa> ap){
        int opcao=0;
        Double preco = 0.0;
        System.out.println("ADICICIONAR CONTA BANCARIA");
        System.out.println("Deseja colocar saldo na conta?\n Sim - 1\n Não - outro valor");
        opcao = new Scanner(System.in).nextInt();
          
        if(opcao==1){
            System.out.println("Insira a quantidade que deseja inserir");
            preco= new Scanner(System.in).nextDouble();
        }        
        
        for(int i=0;i<ap.size();i++){
            if(nome.equals(ap.get(i).getNome())){
                System.out.println("Este nome ja possui conta");
                cb = new ContaBancaria(acb.size(),ap.get(i),preco);
                acb.add(cb);
                break;
            }   
        }        
    }
    
    public void listar(){
        int opcao=0;
        while(opcao!=1 && opcao!=2 && opcao!=3){
            System.out.println("O que deseja listar:\n 1- Pessoas\n 2- Contas\n 3- Tudo");
            opcao = new Scanner(System.in).nextInt();
            
            switch(opcao){
                case 1:
                    listarPessoas();
                    break;
                case 2:
                    listarContas();
                    break;
                case 3:
                    listarPessoas();
                    listarContas();
                    break;
                default:
                    System.out.println("Opcao Inexistente");
                    break;
            }
        }
    }
    
    public void listarPessoas(){
        for(int i=0;i<ap.size();i++){
           System.out.println("Nome: "+ap.get(i).getNome());
        }       
    }
    
    public void listarContas(){
        for(int i=0;i<acb.size();i++){
           System.out.println("Numero Conta: "+acb.get(i).getNumero()+
                "\n Nome Titular: "+acb.get(i).getTitular().getNome()+"\n Saldo: "+acb.get(i).getSaldo());
        }
    }
}
