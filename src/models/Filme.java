package models;

public class Filme extends Titulo{

    private String diretor;

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("O Diretor é: " + diretor);
    }

    @Override
    public void somarNotas(double nota) {
        somaAvaliacao = somaAvaliacao + nota;
    }


    //getters e setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
