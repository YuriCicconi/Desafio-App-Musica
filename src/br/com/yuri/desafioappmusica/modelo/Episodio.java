package br.com.yuri.desafioappmusica.modelo;

import br.com.yuri.desafioappmusica.classificacao.Classificavel;
import br.com.yuri.desafioappmusica.produtos.Podcast;

public class Episodio implements Classificavel {

    private int duracao;
    private int numero;
    private String convidado;
    private Podcast podcast;
    private int reproducoes;
    private int curtidas;

    public int getCurtidas() {
        return curtidas;
    }

    public double getReproducoes() {
        return reproducoes;
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

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducoes++;
    }

    @Override
    public double classifica() {
        if(this.getCurtidas() / this.getReproducoes() == 0.01) {
            return 5;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.009) {
            return 4.5;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.008) {
            return 4;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.007) {
            return 3.5;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.006) {
            return 3;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.005) {
            return 2.5;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.004) {
            return 2;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.003) {
            return 1.5;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.002) {
            return 1;
        } else if (this.getCurtidas() / this.getReproducoes() == 0.001) {
            return 0.5;
        } else {
            return 0;
        }
    }
}
