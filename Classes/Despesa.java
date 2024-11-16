package Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import Enum.Categoria;

import Enum.Categoria;

public class Despesa extends MovimentoFinanceiro {
    private Categoria categoria;
    private LocalDate data;

    public Despesa(Categoria categoria, LocalDateTime data) {
        super(categoria, data);
    }
}
