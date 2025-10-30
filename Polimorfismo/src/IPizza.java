/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * interface para servir de padrao para todo e qualquer tipo de pizza
 * possui as funcionalidades "montar, assar e cobrar"
 * @author Beatriz Miranda
 * @since classe criada em 30/10/2025
 */
public interface IPizza {
    //metodo para montar a pizza com os ingredientes
    public void montar();
    
    //metodo para o tempo que a pizza ficará no forno
    public void assar();
    
    //metodo para cobrar o valor de acordo com o sabor da pizza
    public void cobrar();
}
