package br.com.yuri.desafioappmusica.modelo;

public class Audio {

    private String titulo;
    private int duracao;
    private int reproducoes;
    private int curtidas;
    private double nota;
    private double somaNotas;
    private int totalDeNotas;
    private int media;

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
        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
            this.somaNotas += nota;
            totalDeNotas++;
        } else {
            System.out.println("Adicione uma nota válida");
        }
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducoes++;
    }

    public double getMedia() {
        return this.somaNotas / this.totalDeNotas;
    }
}
