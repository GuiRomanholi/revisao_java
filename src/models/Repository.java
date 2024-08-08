package models;

import java.util.List;

public interface Repository {
    void inserir(Titulo titulo);
    Titulo consultarFilme(String nome);

    List<Filme> listarFilmes();
}
