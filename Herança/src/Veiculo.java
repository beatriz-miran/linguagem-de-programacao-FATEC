
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
public class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;

    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
    
public void exibirDados(){
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano de fabricaçao: " + ano);
            System.out.println("Cor: " + cor);
            System.out.println("Valor em reais: " + valor);
}

    
    //construtor para entrada de dados com GUI
    public Veiculo(){
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricaçao: "));    
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
    }
}
