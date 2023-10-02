package model;

public class Jogador {
    private String username;
    private String email;
    private String senha;
    private Integer xpLevel;
    private String conquistas;

    public Jogador(String username, String email, String senha) {
        this.username = username;
        this.email = email;
        this.senha = senha;
    }

    public Jogador(String username, String email, String senha, Integer xpLevel, String conquistas) {
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.xpLevel = xpLevel;
        this.conquistas = conquistas;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getXpLevel() {
        return xpLevel;
    }

    public String getConquistas() {
        return conquistas;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setXpLevel(int xpLevel) {
        this.xpLevel = xpLevel;
    }

    public void setConquistas(String conquistas) {
        this.conquistas = conquistas;
    }
    
    
}
