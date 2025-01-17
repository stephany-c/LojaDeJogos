package Entidades;

public class Jogo {
    private int idJogo;
    private String nomeJogo;
    private String plataforma;
    private String anoLançamento;
    private Double preco;

    public Jogo(int idJogo, String nomeJogo, String plataforma, String anoLançamento, Double preco) {
        this.idJogo = idJogo;
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.anoLançamento = anoLançamento;
        this.preco = preco;
    }

    public int getIdJogo() {
        return this.idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNomeJogo() {
        return this.nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getAnoLançamento() {
        return this.anoLançamento;
    }

    public void setAnoLançamento(String anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean igual(Jogo jogo) {
        return this.idJogo == jogo.idJogo;
    }

}