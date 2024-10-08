package models;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        if (ativa)
            System.out.println("A série está em andamento.");
        else
            System.out.println("A série já foi finalizada.");
        System.out.println("Número de Temporadas: " + temporada);
        System.out.println("Episodios Por Temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por Episodio: " + minutosPorEpisodio);
    }

    @Override
    public void somarNotas(double nota) {
        somaAvaliacao = somaAvaliacao + nota;
    }

    //getter e setters
    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
