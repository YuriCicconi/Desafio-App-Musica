package br.com.yuri.desafioappmusica.produtos;

import br.com.yuri.desafioappmusica.modelo.Audio;

public class Musica extends Audio {

    private String compositor;
    private String artista;
    private String genero;

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
}
