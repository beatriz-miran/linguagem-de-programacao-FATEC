package JavaComBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author 2830482411044
 */
public class PessoaDAO {

    private Conexao conexao;
    private Connection conn;

    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO Pessoa (nome, sexo, idioma) VALUES(?, ?, ?);";

        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());

            stmt.execute();

        }catch(SQLException ex){
        System.out.println("Erro ao insetir pessoa: " + ex.getMessage());
        }
    }
}
