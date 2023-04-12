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
        return this.getMedia() / 2;
    }
}
