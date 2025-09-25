
public class Aluno extends Pessoa{
    int ra;
    float media;
    int faltas;
    boolean dependencia;
    
    public Aluno(String nome, int idade, float altura, int ra, float media, int faltas, boolean dependencia){
        super(nome, idade, altura);
        
        this.ra = ra;
        this.media = media;
        this.faltas = faltas;
        this.dependencia = dependencia;
    }//fim do construtor
    
    @Override
    public void exibirDados(){
        System.out.println("DADOS DO ALUNO RA: " + ra +
                            "\n Nome: "+ nome +
                            "\n Media: " + media +
                            "\n Faltas: " + faltas + 
                            "\n DP: " + ((dependencia == true) ? "Sim" : "Não"));
    }
    
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("RA: " + ra);
        System.out.println("Média: " + media);
        System.out.println("Faltas: " + faltas);
    }
    
        public void exibirDados(int x){
        System.out.println("Aluno: "+ nome);
        System.out.println("DP: "+ ((dependencia == true) ? "Sim" : "Não"));
    }
}
