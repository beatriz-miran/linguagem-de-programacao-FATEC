
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *classe criada para instanciar um objeto do tipo paoCaseiro para ser preparado pelo objeto polimorfico Forno
 * @author 2830482411044
 */
public class PaoCaseiro implements IPizza {
    
    @Override
    public void montar() {
     JOptionPane.showMessageDialog(null, "Pão Caseiro");
     JOptionPane.showMessageDialog(null, "Farinha, leite, ovos, fermento, sal, açúcar, óleo");
    }

    @Override
    public void assar() {
     JOptionPane.showMessageDialog(null, "Tempo de forno: 40 minutos");
        
    }

    @Override
    public void cobrar() {
     JOptionPane.showMessageDialog(null, "Preço: R$ 15,00");
    }
}
