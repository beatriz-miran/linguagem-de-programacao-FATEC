
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
public class BrigadeiroSorvete implements IPizza{
    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pizza de Brigadeiro com Sorvete");
     JOptionPane.showMessageDialog(null, "Brigadeiro, sorvete de flocos, nutella");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 12 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 36,00");
    }
}
