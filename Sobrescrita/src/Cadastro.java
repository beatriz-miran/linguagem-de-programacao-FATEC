
public class Cadastro {
    public static void main (String []args){
        Pessoa p = new Pessoa("Manuela", 32, 1.65f);
       // p.exibirDados();
        
        Aluno a1 = new Aluno("Beatriz", 20, 1.54f, 283048, 10f, 0, false);
        a1.exibirDados(1);
    }//fim do main
}
