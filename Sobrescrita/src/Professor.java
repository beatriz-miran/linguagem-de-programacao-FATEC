
public class Professor extends Pessoa {
    int codigo;
    String materia;
    float salario;
    
    
    //construtor do objeto professor em memoria
    public Professor(String nome, int idade, float altura, int codigo, String materia, float salario){
        super(nome, idade, altura);
        
        this.codigo = codigo;
        this.materia = materia;
        this.salario = salario;
    }
    
    
    @Override
    public void exibirDados(){
        System.out.println("O professor " + nome + 
                " ministra a disciplina: " + materia + " e tem o salário de R$" + salario);
    }
    
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("Salário: " + salario);
        System.out.println("Matéria: " + materia);
        System.out.println("Código de funcionário: " + codigo);
    }
    
    public void exibirDados(int x){
        System.out.println("Professor: "+ nome);
        System.out.println("Salário: "+ salario);
    }
}
