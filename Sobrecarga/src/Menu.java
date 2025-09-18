
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
public class Menu {
    int opc;
    String msg;
    Figura figura;

    
    public Menu(){
            boolean flag;
        msg = "1-Ponto\n2-Linha\n3-Triangulo\n4-Quadrado";
        msg = msg + "\n5- Sair do programa";
        
        while(true){
        
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ponto: "));
            figura = new Figura(a);
            break;
            case 2: int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da linha"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da linha"));
            figura = new Figura(x, y);
            break;
            case 3: int c, d, e;
            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial do triangulo"));
            d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do meio do triangulo"));
            e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do triangulo"));
            figura = new Figura(c,d,e);
            break;
            case 4: int f, g, h, j;
            f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial do retangulo"));
            g = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor do retangulo"));
            h = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor do retangulo"));
            j = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do retangulo"));
            figura = new Figura(f,g,h,j);
            break;
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog("Insira um valor valido");
                break;
        }//fim do switch   
        
        figura.exibirFigura();
        }//fim do while
    }//fim do construtor
}//fim do main
