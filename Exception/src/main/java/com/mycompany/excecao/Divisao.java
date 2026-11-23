/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excecao;

import javax.swing.JOptionPane;

/**
 * Classer criada para demonstrar tratamento de exceçoa feito com as
 * clausulas try - catch - throws
 * @author 2830482411044
 */
public class Divisao {

    public void realizarDivisao(){

       String numA, numB;
       numA = JOptionPane.showInputDialog("Digite o primeiro número: ");
       numB = JOptionPane.showInputDialog("Digite o segundo número: ");

     
       try{
        int a, b, divi;
        a = Integer.parseInt(numA);
        b = Integer.parseInt(numB);
        divi = realizarDivisao(a,b);
        System.out.println("Resultado da divisão: " + divi);
       } 
       catch(ArithmeticException exc){
           System.out.println("Ocorreu uma exceção do tipo: " + exc.toString());
           System.out.println("\nNão existe divisão por zero.");
       } 
       catch(NumberFormatException exc){
           System.out.println("Digite apenas números.");
       }
       catch(DivisaoExcecao erro){
           System.out.println("Ocorreu um erro: " + erro.toString());
       }
       catch(java.lang.Exception exc){
           System.out.println("Ocorreu um erro do tipo " + exc.toString());
       }
    }
    
    //metodo para realizar a divisao de 2 numeros
    public int realizarDivisao(int x, int y) throws DivisaoExcecao{
        if(x < y)
            throw new DivisaoExcecao();
        
        if(x < 100)
            throw new DivisaoExcecao(100);
       
        if(x < 0 || y < 0)
            throw new DivisaoExcecao("Negativos");
            
        return x / y;
        
    }
}

