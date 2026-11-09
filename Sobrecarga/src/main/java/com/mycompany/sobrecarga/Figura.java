package com.mycompany.sobrecarga;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe criada para gerar objetos do tipo Figura e demonstrar o uso do recurso de sobrecarga de metodos contrutores e comuns
 * @author 2830482411044
 * @since classe criada em 09/11/2026
 */
public class Figura {
    Integer a, b, c, d;
    
    //construtor para entrada de dados por meio de GUI
    //GUI = Graphical User Interface
    public Figura(){
        while(true){
        a = b = c = d = null;
        int opc = 0;
        String msg;
        msg = "1 - PONTO\n 2 - LINHA\n 3 - TRIANGULO\n 4 - RETANGULO\n5 - SAIR ";
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,msg, "MENU DE OPÇÕES PARA A CRIAÇÃO DE UMA FIGURA", -1));
        
        switch(opc){
            case 1:
                this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                break;
            case 2:
                this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                break;
            case 3:
                this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                this.c = Integer.parseInt(JOptionPane.showInputDialog("C: "));
                break;
            case 4:
                this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                this.c = Integer.parseInt(JOptionPane.showInputDialog("C: "));
                this.d = Integer.parseInt(JOptionPane.showInputDialog("D: "));
                break;
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");
        }
        exibirFigura();
        }
    }
    
    //construtor para um ponto
    public Figura(int a){
        this.a = a;
    }
    
    //contrutor para uma linha
    public Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //contrutor para um triangulo
    public Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //contrutor para um retangulo
    public Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    //metodos comuns para exibir os dados das figuras
    
    //ponto
    public void exibirFigura(String x){
        JOptionPane.showMessageDialog(null, "É um ponto de valor: " + a);
    }
    
    //linha
    public void exibirFigura(float g){
        JOptionPane.showMessageDialog(null, "Linha de coordenadas " + a + " e " + b);
    }
    
    //triangulo
    public void exibirFigura(int e){
         JOptionPane.showMessageDialog(null, "Triangulo de coordenadas " + a + ", " + b + " e " + c);
    }
    
    //retangulo
    public void exibirFigura(boolean z){
         JOptionPane.showMessageDialog(null, "Retangulo de coordenadas " + a + ", " + b + ", " + c + " e " + d);  
    }
    
    //metodo para identificar automaticamente o tipo de figura
    public void exibirFigura(){
        if( a != null && b == null && c == null && d == null)
            exibirFigura("exemplo");
        else if(a != null && b != null && c == null && d == null)
            exibirFigura(1.0f);
        else if(a != null && b != null && c != null && d == null)
            exibirFigura(1);
        else
            exibirFigura(true);
    }
}
