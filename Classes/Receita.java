package Classes;

import java.time.LocalDate;

import Enum.Categoria;

public class Receita extends MovimentoFinanceiro {
    private Categoria categoria;
    private LocalDate data;

    public Receita(Categoria categoria, LocalDate data) {
        setCategoria(categoria);
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
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
