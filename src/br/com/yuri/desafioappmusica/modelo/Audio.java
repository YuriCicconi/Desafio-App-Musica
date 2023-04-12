package br.com.yuri.desafioappmusica.modelo;

public class Audio {

    private String titulo;
    private int duracao;
    private double reproducoes;
    private double curtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getReproducoes() {
        return reproducoes;
    }

    public double getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducoes++;
    }
}
