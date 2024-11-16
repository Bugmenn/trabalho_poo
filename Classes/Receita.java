package Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Enum.Categoria;

public class Receita extends MovimentoFinanceiro {
    private Categoria categoria;
    private LocalDateTime data;

    public Receita(Categoria categoria, LocalDateTime data) {
        super(categoria, data);
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

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        if (data == null) {
            throw new IllegalArgumentException("Receita deve possuir data");
        }
        this.data = data;
    }
}
