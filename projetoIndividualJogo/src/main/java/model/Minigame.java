package model;

public class Minigame {
    private String nome;
    private String descricao;
    private String requisitos_minimos;
    private String recompensas;

    public Minigame(String nome, String descricao, String requisitos_minimos, String recompensas) {
        this.nome = nome;
        this.descricao = descricao;
        this.requisitos_minimos = requisitos_minimos;
        this.recompensas = recompensas;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRequisitos_minimos() {
        return requisitos_minimos;
    }

    public String getRecompensas() {
        return recompensas;
    }
    
    
}
