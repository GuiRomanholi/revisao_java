package models;

public abstract class Titulo {
    private  String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    protected double somaAvaliacao;

    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    //metodo abstrato -> Na super classe não tem implementação
    //porém as subclasses são OBRIGADAS a implementar o método
    public abstract void somarNotas(double nota);

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
