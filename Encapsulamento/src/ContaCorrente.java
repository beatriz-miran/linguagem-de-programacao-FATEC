
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
public class ContaCorrente {

    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueado;

    //construir um objeto em memoria
    public ContaCorrente(String cliente, float saldo, int senha, boolean bloqueado) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueado = bloqueado;
    }

    //metodo comum para exibir os dados da conta do cliente
    public void exibirDadosContaCliente() {
       JOptionPane.showMessageDialog(null,"-- BANCO DO BRASIL--\n\n" + "Nome do cliente: " + getCliente() + "\nSaldo do cliente: R$" + getSaldo());
    }

    //metodo para modificar o saldo da conta do cliente - ASSESSORES -> 
    //SET - setSenha(float saldo)
    //GET - getSenha
    //metodo para modificar o saldo da conta do cliente
    public void realizarSaque() {

        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar saque");
        }
        else{
        float vlrSaque;
        vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
        setSaldo(getSaldo() - vlrSaque);
        JOptionPane.showMessageDialog(null, "Saque concluido com sucesso!");
    }
}
    
    public void exibirMenu(){
        
        int a = Integer.parseInt(JOptionPane.showInputDialog( "-- BANCO DO BRASIL--\n\n" + "Deseja realizar qual operação?\n\n" + "1 - Sacar\n" + "2 - Realizar depósito\n" + "3 - Exibir saldo\n" + "4 - Sair"));
        
        switch(a){
        case 1:
            verificarSenha();
            realizarSaque();
            exibirDadosContaCliente();
            exibirMenu();
            break;
        case 2:
            realizarDeposito();
            exibirDadosContaCliente();
            exibirMenu();
            break;
        case 3:
            exibirDadosContaCliente();
            exibirMenu();
            break;
        case 4:
            System.exit(0);
        default:
            JOptionPane.showMessageDialog(null, "Valor incorreto. Digite novamente");
            exibirMenu();
    }
    }

    private boolean verificarSenha(){
        int pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha:"));
        
        if(pwd != getSenha()){
            for(int i = 1; i <= 3; i++){
              Integer.parseInt(JOptionPane.showInputDialog("Senha inválida! Voce usou " + i + "/3 tentativas. \n" + "Digite a senha novamente:"));
            }
            setBloqueado(true);
            JOptionPane.showMessageDialog(null, "Conta bloqueada.");
            
            return false;
        }
            return true;
    }
    
    private void realizarDeposito(){
        float vlrDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja depositar"));
        setSaldo(getSaldo() + vlrDeposito);
    }
    
    // guarda a informação no atributo
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    //retorna o conteudo do atributo
    private float getSaldo(){
        return this.saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    
}
