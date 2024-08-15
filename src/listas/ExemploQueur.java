package listas;

import models.Filme;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueur {
    public static void main(String[] args) {

        Filme filmeA = new Filme();

        filmeA.setNome("Divertidamente 2");
        filmeA.setAnoDeLancamento(2024);
        filmeA.setDuracaoEmMinutos(101);

        Filme filmeB = new Filme();
        filmeB.setNome("Meu malvado favorito 4");
        filmeB.setAnoDeLancamento(2024);
        filmeB.setDuracaoEmMinutos(98);

        Filme filmeC = new Filme();
        filmeC.setNome("Wolverine");
        filmeC.setAnoDeLancamento(2024);
        filmeC.setDuracaoEmMinutos(111);

        Queue<Filme> filmes = new LinkedList<>();
        filmes.add(filmeB);
        filmes.add(filmeC);
        filmes.add(filmeA);

        //filmes.forEach(filme -> System.out.println(filme.getNome()));
        //isEmpty é pra ver se a lista é vazia
        while (!filmes.isEmpty()){
            Filme filme = filmes.poll();
            System.out.println(filme.getNome());
        }



    }
}
