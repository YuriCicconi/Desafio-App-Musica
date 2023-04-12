package br.com.yuri.desafioappmusica.main;

import br.com.yuri.desafioappmusica.classificacao.Recomedacao;
import br.com.yuri.desafioappmusica.modelo.Episodio;
import br.com.yuri.desafioappmusica.produtos.Musica;
import br.com.yuri.desafioappmusica.produtos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica enterSandman = new Musica();
        Podcast podcast = new Podcast();
        Episodio ep = new Episodio();
        Recomedacao recomendacao = new Recomedacao();

        enterSandman.setTitulo("Enter Sandman");
        enterSandman.setGenero("Rock");
        enterSandman.setArtista("Metallica");
        enterSandman.setCompositor("James Hetfield + 2");
        enterSandman.setDuracao(331);
        enterSandman.setAlbum("Metallica");

        for (int i = 0; i < 1000; i++) {
            enterSandman.reproduzir();
        }

        for (int i = 0; i < 8; i++) {
            enterSandman.curtir();
        }

        podcast.setApresentador("João da Silva");
        podcast.setTema("Comédia");
        podcast.setDuracao(180);
        podcast.setTitulo("Comédia com João");

        for (int i = 0; i < 2500; i++) {
            podcast.reproduzir();
        }

        ep.setConvidado("José Ferreira");
        ep.setNumero(1);
        ep.setDuracao(185);
        ep.setPodcast(podcast);

        for (int i = 0; i < 1000; i++) {
            ep.reproduzir();
        }

        for (int i = 0; i < 3; i++) {
            ep.curtir();
        }

        recomendacao.recomendar(enterSandman);
        System.out.println("=================================");
        recomendacao.recomendar(podcast);
        System.out.println("=================================");
        recomendacao.recomendar(ep);




    }
}
