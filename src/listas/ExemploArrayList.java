package listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void  exibirListaFor(ArrayList<String> nomes){
        //  i é igual a 0; enquanto i for menor que o tamanho da lista; adiciona mais um
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
    public static void main(String[] args) {
        //Criei o main só pra facilitar mas não pode em cada projeto so pode ter um main


        ArrayList<String> nomes = new ArrayList<>();
        //Adicionar um nome;
        nomes.add("Eliane");
        nomes.add("Ana");
        nomes.add("Guilherme");
        nomes.add("Felipe");
        nomes.add("Maria");
        nomes.add(2,"José");
        exibirListaFor(nomes);

        System.out.println("Primeiro nome da lista: " + nomes.get(1));

        System.out.println("Tamanho da lista: " + nomes.size());
        nomes.remove(4);
        exibirListaFor(nomes);

        System.out.println("\nClonar uma lista");
        ArrayList<String> nomeAlunos = new ArrayList<>();
        nomeAlunos = (ArrayList<String>) nomes.clone();
        exibirListaFor(nomeAlunos);


        if (nomes.contains("Ana")){
            System.out.println("\nExiste na Lista");
        }else {
            System.out.println("\nNão existe na lista");
        }


        //Ordenar lista
        System.out.println("\nOrdenação da lista de nomes");
        nomes.sort(null);
        exibirListaFor(nomes);


    }
}
