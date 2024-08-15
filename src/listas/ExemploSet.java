package listas;

import models.Filme;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        Filme filmeA = new Filme();

        filmeA.setNome("Divertidamente 2");
        filmeA.setAnoDeLancamento(2024);
        filmeA.setDuracaoEmMinutos(101);

        Filme filmeB = new Filme();
        filmeB.setNome("Meu malvado favorito 4");
        filmeB.setAnoDeLancamento(2024);
        filmeB.setDuracaoEmMinutos(98);


        Set<Filme> filmes = new HashSet<>();
        filmes.add(filmeA);
        filmes.add(filmeB);

        filmes.forEach(filme ->{
            System.out.println(filme.getNome());
            System.out.println(filme.getAnoDeLancamento());
        });
    }
}
