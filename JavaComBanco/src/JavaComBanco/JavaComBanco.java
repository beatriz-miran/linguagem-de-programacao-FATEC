package JavaComBanco;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaComBanco extends Application {

    public static void main(String[] args) {
        //launch(args);
        
        Conexao c = new Conexao();
        c.getConexao();
        
        Pessoa p = new Pessoa();
        p.setNome("Ricardo");
        p.setSexo("M");
        p.setIdioma("Portugues");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
        
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
