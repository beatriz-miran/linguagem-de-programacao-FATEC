
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482411044
 */
public class Caminhao extends Veiculo {
    String carroceria;
    float tara;
    int eixos;
    
    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos){
       super(marca, modelo, cor, ano, valor);
       this.carroceria = carroceria;
       this.tara = tara;
       this.eixos = eixos;
    }
    
    public void exibirDadosCaminhao(){
        super.exibirDados();
        System.out.println("Carroceria: " + carroceria);
        System.out.println("Tara: " + tara);
        System.out.println("Eixos: " + eixos);
    }
    
     public Caminhao(){
          this.carroceria = JOptionPane.showInputDialog("Carroceria: ");    
          this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara: "));   
          this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Eixos: "));
    }
}
