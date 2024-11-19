package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IGerenciamentoContaBancaria {

    public ArrayList<MovimentoFinanceiro> listar();

    public void incluir(MovimentoFinanceiro movimentoFinanceiro);

    public double consultarSaldo();

    public double consultarSaldoPeriodo(LocalDateTime date);
}