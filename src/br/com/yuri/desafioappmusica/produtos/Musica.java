package br.com.yuri.desafioappmusica.produtos;

import br.com.yuri.desafioappmusica.classificacao.Classificavel;
import br.com.yuri.desafioappmusica.modelo.Audio;

public class Musica extends Audio implements Classificavel {

    private String compositor;
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
