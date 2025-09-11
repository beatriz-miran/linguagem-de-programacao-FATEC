/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482411044
 */
public class Concessionaria {
    
    public static void main(String[] args){
        //Carro carro = new Carro("Mercedes", "CLA250", "Verde",2026, (float)345000, 250, true);
       
        Carro car = new Carro();
        car.exibirDadosVeiculoGui();
        
        Caminhao caminhao = new Caminhao("Volksvagem", "SLA200", "Preto", 2004, 20000f, "sei la", 245f, 6);
        caminhao.exibirDadosCaminhao();
    }
}
