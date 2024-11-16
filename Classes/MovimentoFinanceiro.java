package Classes;
import java.time.LocalDateTime;

import Enum.Categoria;

public abstract class MovimentoFinanceiro {

    private String nome;
    private LocalDateTime data = LocalDateTime.now();
    private Categoria categoria;
    private Double valor;

    public MovimentoFinanceiro(Categoria categoria, LocalDateTime data) {

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
