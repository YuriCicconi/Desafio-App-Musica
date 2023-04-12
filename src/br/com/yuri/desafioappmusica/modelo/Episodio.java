package br.com.yuri.desafioappmusica.modelo;

import br.com.yuri.desafioappmusica.produtos.Podcast;

public class Episodio {

    private int duracao;
    private int numero;
    private String convidado;
    private Podcast podcast;
    private int reproducoes;

    public double getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int nota) {
        this.reproducoes = nota;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }
}
