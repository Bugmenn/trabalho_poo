package Classes;

import Enum.Categoria;
import java.time.LocalDateTime;

public class Receita extends MovimentoFinanceiro {
    private String nome;
    private LocalDateTime data = LocalDateTime.now();
    private Categoria categoria;
    private Double valor;

    public Receita(String nome, Categoria categoria, LocalDateTime data, Double valor) {
        super(nome, categoria, data, valor);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    
}
