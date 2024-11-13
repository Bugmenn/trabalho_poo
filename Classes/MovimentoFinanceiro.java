package Classes;
import java.time.LocalDate;
import Enum.Categoria;

public abstract class MovimentoFinanceiro {

    private String nome;
    private LocalDate data;
    private Categoria categoria;
    private Double valor;
}
