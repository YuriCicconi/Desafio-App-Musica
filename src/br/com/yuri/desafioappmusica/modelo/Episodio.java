package br.com.yuri.desafioappmusica.modelo;

import br.com.yuri.desafioappmusica.classificacao.Classificavel;
import br.com.yuri.desafioappmusica.produtos.Podcast;

public class Episodio implements Classificavel {

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

    @Override
    public double classifica() {
        if (this.reproducoes >= 1500) {
            return 3.5;
        } else if (this.reproducoes >= 1000) {
            return 2.5;
        } else {
            return 1;
        }
    }
}
