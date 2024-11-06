package Classes;

import java.time.LocalDate;

import Enum.CategoriaReceita;

public class Receita {
    private CategoriaReceita categoria;
    private LocalDate data;

    public Receita(CategoriaReceita categoria, LocalDate data) {
        setCategoria(categoria);
    }

    public CategoriaReceita getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Receita deve possuir categoria");
        }
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("Receita deve possuir data");
        }
        this.data = data;
    }
}
