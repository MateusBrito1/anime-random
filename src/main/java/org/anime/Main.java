package org.anime;

public class Main {
    public static void main(String[] args) {
        KitsuClient client = new KitsuClient();

        try {
            Anime animeAleatorio = client.getRandomAnime();
            System.out.println("Anime aleatório selecionado: " + animeAleatorio);
        } catch (Exception e) {
            System.err.println("Erro ao obter anime: " + e.getMessage());
        }
    }

}