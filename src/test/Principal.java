package test;

import models.Filme;
import models.Serie;
import models.Titulo;

public class Principal {
    public static void main(String[] args) {

        Serie minhaSerie = new Serie();

        minhaSerie.setNome("Naruto");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setDuracaoEmMinutos(50000);
        minhaSerie.setAtiva(false);
        minhaSerie.setTemporada(18);
        minhaSerie.setEpisodiosPorTemporada(25);
        minhaSerie.setMinutosPorEpisodio(20);
        minhaSerie.exibirFichaTecnica();

        System.out.println("----------------------------------");

        Filme filme = new Filme();

        filme.setNome("Deadpool");
        filme.setAnoDeLancamento(2018);
        filme.setDiretor("James Gunn");
        filme.exibirFichaTecnica();




    }
}
