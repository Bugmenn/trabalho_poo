package Classes;

import java.time.LocalDate;

import Enum.CategoriaDespesa;

public class Despesa {
    private CategoriaDespesa categoria;
    private LocalDate data;

    public Despesa(CategoriaDespesa categoria, LocalDate data) {

    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
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
