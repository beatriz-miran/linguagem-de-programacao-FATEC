
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
public class FrangoCatupiry implements IPizza{

    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pizza de Frango com Catupiry");
     JOptionPane.showMessageDialog(null, "Molho de tomate, frango, catupiry");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 12 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 55,00");
    }
    
}
