package br.com.yuri.desafioappmusica.modelo;

public class Audio {

    private String titulo;
    private int duracao;
    private int reproducoes;
    private int curtidas;
    private double nota;

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

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducoes++;
    }
}
