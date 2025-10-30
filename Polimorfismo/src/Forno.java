/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * classe criada para gerar o objeto polimorfico forno que irá preoarar todo e qualquer tipo de pizza
 * @author 2830482411044
 */
public class Forno {
    
    public void preparar(IPizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
}
