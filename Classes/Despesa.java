package Classes;

import java.time.LocalDate;

import Enum.Categoria;

public class Despesa extends MovimentoFinanceiro {
    private Categoria categoria;
    private LocalDate data;

    public Despesa(Categoria categoria, LocalDate data) {

    }

    public Categoria getCategoria() {
        return categoria;
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
