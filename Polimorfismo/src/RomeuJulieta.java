
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
public class RomeuJulieta implements IPizza{

    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pizza de Romeu e Julieta");
     JOptionPane.showMessageDialog(null, "Queijo, goiabada, leite condensado");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 7 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 30,00");
    }
    
    public void adicionarIngrediente(){
        JOptionPane.showInputDialog(null, "Informe o ingrediente que quer adicionar: ");
    }
}
