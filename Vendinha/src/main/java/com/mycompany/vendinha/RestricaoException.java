/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendinha;

/**
 *
 * @author 2830482411044
 */
public class RestricaoException extends Exception{
    
    public RestricaoException(){
        super("Para comprar bebidas é necessário possuir pelo menos 18 anos.");
    }
    
    public RestricaoException(int a){
        super("Voce precisa de receita para comprar o remedio");
    }
}
