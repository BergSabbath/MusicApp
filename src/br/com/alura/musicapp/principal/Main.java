package br.com.alura.musicapp.principal;

import br.com.alura.musicapp.modelos.MinhasPreferidas;
import br.com.alura.musicapp.modelos.Musica;
import br.com.alura.musicapp.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Fear of the dark");
        musica1.setCantor("Iron Maiden");

        for (int i = 0; i < 1000; i++){
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Bolha Dev");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++){
            podcast1.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);

    }
}