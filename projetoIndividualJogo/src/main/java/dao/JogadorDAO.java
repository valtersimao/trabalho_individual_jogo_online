package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Jogador;
import tool.FactoryPostgres;

public class JogadorDAO {

    private Connection conexaoBanco;

    public JogadorDAO() {
        this.conexaoBanco = FactoryPostgres.getConexaoPostgres();
    }

    public boolean cadastraJogador(Jogador novoJogador) {

        String sql = "INSERT INTO valter_jogo_online.jogador(username, senha, email) VALUES(?,?,?)";

        try (PreparedStatement trans = this.conexaoBanco.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {

            trans.setString(1, novoJogador.getUsername());
            trans.setString(2, novoJogador.getSenha());
            trans.setString(3, novoJogador.getEmail());

            //executando a transacao no BANCO de dados
            trans.execute();

            //vamos acessar as CHAVES geradas pelo banco
            return trans.getGeneratedKeys().next();

        } catch (SQLException ex) {
            System.err.println("Erro ao cadastrar Avaliação no BD");
            return false;
        }
    }

    public ArrayList<Jogador> recuperaJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        String sql = "SELECT * FROM valter_jogo_online.jogador";

        try (PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {

            //aqui teremos acesso aos dados retornados pelo banco ao exec. a sql
            ResultSet resultadoBD = trans.executeQuery();

            //efetuando a leitura de TODAS as TUPLAS que foram retorn. pelo banco
            while (resultadoBD.next()) {
                Jogador temp = new Jogador(resultadoBD.getString("username"),
                        resultadoBD.getString("email"),
                        resultadoBD.getString("senha"),
                        resultadoBD.getInt("nivel_de_experiencia"),
                        resultadoBD.getString("conquistas")
                );

                jogadores.add(temp);
            }

            return jogadores;

        } catch (SQLException ex) {
            return null;
        }

    }

}
