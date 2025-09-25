
public class Pessoa {
    String nome;
    int idade;
    float altura;
    
    //contrutor do objeto pessoa em memória
    public Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //metodo para exibir dados da pessoa
    public void exibirDados(){
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Idade da Pessoa: " + idade);
        System.out.println("Altura da Pessoa: " + altura);
    }
}
