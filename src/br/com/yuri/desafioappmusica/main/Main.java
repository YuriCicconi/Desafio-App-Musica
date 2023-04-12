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

        enterSandman.setGenero("Rock");
        enterSandman.setArtista("Metallica");
        enterSandman.setCompositor("James Hetfield + 2");
        enterSandman.setDuracao(331);
        enterSandman.setAlbum("Metallica");
        enterSandman.setNota(10);
        enterSandman.setNota(8.4);
        enterSandman.setNota(6.5);

        podcast.setApresentador("João da Silva");
        podcast.setTema("Comédia");
        podcast.setDuracao(180);
        podcast.setTitulo("Comédia com João");
        podcast.setNota(10);
        podcast.setNota(8);
        podcast.setNota(3);

        ep.setConvidado("José Ferreira");
        ep.setNumero(1);
        ep.setDuracao(185);
        ep.setPodcast(podcast);
        ep.setReproducoes(1000);

        recomendacao.recomendar(enterSandman);
        System.out.println("=================================");
        recomendacao.recomendar(podcast);
        System.out.println("=================================");
        recomendacao.recomendar(ep);




    }
}
