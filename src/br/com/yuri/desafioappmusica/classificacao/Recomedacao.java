package br.com.yuri.desafioappmusica.classificacao;

public class Recomedacao {

    public void recomendar(Classificavel c) {

        if (c.classifica() >= 3.5) {
            System.out.println("Está entre os mais bem avaliados");
        } else if (c.classifica() >= 2.5) {
            System.out.println("Galera está curtindo");
        } else {
            System.out.println("Adicione para ouvir mais tarde");
        }
    }
}
