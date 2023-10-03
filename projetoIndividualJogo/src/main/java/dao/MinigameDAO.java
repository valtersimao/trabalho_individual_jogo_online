package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Minigame;
import tool.FactoryPostgres;

public class MinigameDAO {

    private Connection conexaoBanco;

    public MinigameDAO() {
        this.conexaoBanco = FactoryPostgres.getConexaoPostgres();
    }

    public boolean cadastraMinigame(Minigame novoMinigame) {

        String sql = "INSERT INTO valter_jogo_online.minigame(nome_do_jogo, descricao, requisitos_minimos,recompensas) VALUES(?,?,?,?)";

        try (PreparedStatement trans = this.conexaoBanco.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {

            trans.setString(1, novoMinigame.getNome());
            trans.setString(2, novoMinigame.getDescricao());
            trans.setString(3, novoMinigame.getRequisitos_minimos());
            trans.setString(4, novoMinigame.getRecompensas());

            //executando a transacao no BANCO de dados
            trans.execute();

            //vamos acessar as CHAVES geradas pelo banco
            return trans.getGeneratedKeys().next();

        } catch (SQLException ex) {
            System.err.println("Erro ao cadastrar Avaliação no BD");
            return false;
        }
    }

    public ArrayList<Minigame> recuperaJogadores() {
        ArrayList<Minigame> minigames = new ArrayList<>();

        String sql = "SELECT * FROM valter_jogo_online.minigame";

        try (PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {

            //aqui teremos acesso aos dados retornados pelo banco ao exec. a sql
            ResultSet resultadoBD = trans.executeQuery();

            //efetuando a leitura de TODAS as TUPLAS que foram retorn. pelo banco
            while (resultadoBD.next()) {
                Minigame temp = new Minigame(resultadoBD.getString("nome_do_jogo"),
                        resultadoBD.getString("descricao"),
                        resultadoBD.getString("requisitos_minimos"),
                        resultadoBD.getString("recompensas"));

                minigames.add(temp);
            }

            return minigames;

        } catch (SQLException ex) {
            return null;
        }

    }

}
