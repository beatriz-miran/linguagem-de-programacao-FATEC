/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendinha;

import javax.swing.JOptionPane;

/**
 *
 * @author 2830482411044
 */
public class Produtos {
    int qtd, idade;
    boolean receita;
    String nome;
    float produto;
    float vinho = 18.99f;
    float cerveja = 07.50f;
    float vodka = 25.60f;
    
    public void exibirMenu() {

    try {
        int a = Integer.parseInt(JOptionPane.showInputDialog(
            "Bem-Vindo ao Nosso Mercadinho! 🛒\n\n"
            + "Informe qual produto você gostaria de comprar:\n"
            + "1- Bebidas 🍺\n"
            + "2- Medicamentos 💊\n"
            + "3- Produtos Comuns 🍞"
        ));

        switch (a) {
            case 1:
                idade = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe sua idade:")
                );

                if (idade < 18) {
                    throw new RestricaoException();
                }
                
                JOptionPane.showInputDialog("Escolha uma bebida: " +
                                            "1- Vinho\n"+
                                            "2- Cerveja\n"+
                                            "3- Vodka");
                
                qtd = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a quantidade de Bebidas")
                );

                break;

            case 2:
                
                idade = Integer.parseInt(
                  JOptionPane.showInputDialog("Informe sua idade:")
                );

                if (idade < 18) {
                    throw new RestricaoException();
                }
                
                receita = Boolean.parseBoolean(
                    JOptionPane.showInputDialog("Voce possui receita?"));
                
                if(receita == false){
                    throw new RestricaoException(10 );
                }
                
                qtd = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a quantidade de Medicamentos")
                );
                break;

            case 3:
                qtd = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a quantidade de Produtos comuns")
                );
                break;

            default:
                JOptionPane.showMessageDialog(null, "Selecione um produto válido");
                break;
        }

    } catch (RestricaoException exc) {
        JOptionPane.showMessageDialog(null,
            exc.getMessage()
        );

    } catch (NumberFormatException exc) {
        JOptionPane.showMessageDialog(null,
            "Digite apenas números!"
        );
    } 
    } // fim do exibirMenu()
    
    public void exibirTotal(){
        float total = qtd * produto;
    }
}
    

