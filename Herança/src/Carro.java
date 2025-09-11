
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482411044
 * herdar todos atributos e metodos da super classe veiculo
 */
public class Carro extends Veiculo{
    int volPortaMalas;
    boolean conversivel;
    
    //construtor para objeto do tipo carro em memoria
    public Carro(String marca, String modelo, String cor, int ano, float valor, int volPortaMalas, boolean conversivel){
        super(marca, modelo, cor, ano, valor);
        this.volPortaMalas = volPortaMalas;
        this.conversivel = conversivel;
    }

    public Carro(){
          this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do porta malas: "));    
          this.conversivel = Boolean.parseBoolean(JOptionPane.showInputDialog("Conversível: "));   
          String resp = JOptionPane.showInputDialog("Conversível: ");
          
          if("Sim".equals(resp) || "sim".equals(resp))
              this.conversivel = true;
          else
              this.conversivel = false;
    }
    
    public void exibirDadosVeiculoGui(){
        String msg = "Marca" + marca +
                     "\nModelo" + modelo +
                     "\nAno" + ano +
                     "\nCor" + cor + 
                     "\nValor" + valor +
                     "\n Volume porta malas" + volPortaMalas +
                     "\n Conversivel" + (conversivel?"Sim":"Não");
        JOptionPane.showMessageDialog(null, msg,"Dados", -1);
    }
    
    //metodo comum para exibir os dados de carro
    public void exibirDadosCarro(){
        super.exibirDados();
        System.out.println("Volume do porta malas: " + volPortaMalas);
        System.out.println("É conversível: " + (conversivel?"Sim":"Não"));
        System.out.println("-------");
    }
}
