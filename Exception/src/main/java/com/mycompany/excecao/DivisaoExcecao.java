/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excecao;

/**
 * classe criada para tratamento específico do método realizarDivisao()
 * @author 2830482411044
 */

class DivisaoExcecao extends java.lang.Exception {
    
    public DivisaoExcecao(){
        super("O segundo número não pode ser maior que o primeiro");
    }

    public DivisaoExcecao(int i) {
       super("O primeiro número não pode ser superior a 100");
    }
    
    public DivisaoExcecao(String s){
        super("Os números não podem ser " + s);
    }
}
