package Classes;
import Enum.Categoria;
import java.time.LocalDateTime;

public abstract class MovimentoFinanceiro {

    private String nome;
    private LocalDateTime data = LocalDateTime.now();
    private Categoria categoria;
    private Double valor;

    public MovimentoFinanceiro(String nome, Categoria categoria, LocalDateTime data, Double valor) {
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setData(data);
        this.setValor(valor);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Receita deve possuir categoria");
        }
        this.categoria = categoria;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("valor invalido");
        }
        this.valor = valor;
    }

}
