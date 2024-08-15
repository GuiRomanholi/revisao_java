package test;

import models.Filme;
import models.Serie;
import models.Titulo;

import java.util.ArrayList;

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

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(minhaSerie);

        System.out.println("\nExibindo a lista usando foreach");
        for (Titulo t : listaDeFilmes){
            System.out.println("Titulo" + t.getNome());
            System.out.println("Ano de lançamento: " + t.getAnoDeLancamento());
        }


        System.out.println("\nExibindo a lista usando o metodo forEach");
        listaDeFilmes.forEach(f ->{
            System.out.println(f.getNome());
            System.out.println("Ano de Lançamento" + f.getAnoDeLancamento());
        });






    }
}
