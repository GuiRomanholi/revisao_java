package test;

import java.util.Scanner;

public class ManipulacaoBD {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Menu" +
                "\n1- Cadastrar" +
                "\n2- Listar" +
                "\n3- Consultar por codigo" +
                "\n4- Consultar por xxx" +
                "\n5- Alterar" +
                "\n6- Excluir" +
                "\n0 - Sair" +
                "\nDigite a operação desejada: ");
        int op = leitor.nextInt();
    }
}
