package Classes;

import Enum.Categoria;
import java.time.LocalDateTime;

public class Despesa extends MovimentoFinanceiro {
    private String nome;
    private LocalDateTime data = LocalDateTime.now();
    private Categoria categoria;
    private Double valor;

    public Despesa(String nome, Categoria categoria, LocalDateTime data, Double valor) {
        super(nome, categoria, data, valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
