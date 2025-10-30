
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
public class CincoQueijos implements IPizza{
    
    
    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pizza de Cinco Queijos");
     JOptionPane.showMessageDialog(null, "Mussarela, provolone, gorgonzola, chedar, parmesão, tomate, orégano");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 9 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 70,00");
    }
}
