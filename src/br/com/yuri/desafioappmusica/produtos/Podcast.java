package br.com.yuri.desafioappmusica.produtos;

import br.com.yuri.desafioappmusica.classificacao.Classificavel;
import br.com.yuri.desafioappmusica.modelo.Audio;

public class Podcast extends Audio implements Classificavel {

    private String apresentador;
    private String tema;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public double classifica() {
        if (this.getReproducoes() >= 5000) {
            return 5;
        } else if (this.getReproducoes() >= 4500) {
            return 4.5;
        } else if (this.getReproducoes() >= 4000) {
            return 4;
        } else if (this.getReproducoes() >= 3500) {
            return 3.5;
        } else if (this.getReproducoes() >= 3000) {
            return 3;
        } else if (this.getReproducoes() >= 2500) {
            return 2.5;
        } else if (this.getReproducoes() >= 2000) {
            return 2;
        } else if (this.getReproducoes() >= 1500) {
            return 1.5;
        } else if (this.getReproducoes() >= 1000) {
            return 1;
        } else if (this.getReproducoes() >= 500) {
            return 0.5;
        } else {
            return 0;
        }
    }
}
