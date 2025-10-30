
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * classe criada para apresentar um menu de opções com os diversos sabores de pizza e o pao
 * @author 2830482411044
 */
public class Menu {
    IPizza pizza; //nao pode instanciar pois é uma interface, é abstrata
    Forno forno = new Forno();
    String msg; 
    
    public Menu(){
        int opc = 0;
        msg = "1 - Frango com Catupiry"
            + "\n2 - Calabresa"
            + "\n3 - Cinco Queijos"
            + "\n4 - Milho"
            + "\n5 - Mussarela"
            + "\n6 - Brigadeiro com Sorvete"
            + "\n7 - Beijinho com Sorvete"
            + "\n8 - Romeu e Julieta"
            + "\n9 - Pão Caseiro"
            + "\n0 - Sair do menu";
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: 
                pizza = new FrangoCatupiry();
                break;
            case 2:
                pizza = new Calabresa();
                break;
            case 3:
                pizza = new CincoQueijos();
                break;
            case 4:
                pizza = new Milho();
                break;
            case 5:
                pizza = new Mussarela();
                break;
            case 6:
                pizza = new BrigadeiroSorvete();
                break;
            case 7:
                pizza = new BeijinhoSorvete();
                break;
            case 8:
                pizza = new RomeuJulieta();
                break;
            case 9:
                pizza = new PaoCaseiro();
                break;
            case 0:
                System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Sabor não existe!");
                
        }//fim do switch
        forno.preparar(pizza); // <-- objeto polimorfico
    }//fim do construtor
}
