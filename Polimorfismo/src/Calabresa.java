
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
public class Calabresa implements IPizza{
     
    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pizza de Calabresa");
     JOptionPane.showMessageDialog(null, "Calabresa, molho de tomate, cebola");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 15 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 40,00");
    }
}
