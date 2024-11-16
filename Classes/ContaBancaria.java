package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ContaBancaria implements GerenciamentoContaBancaria {

    MovimentoFinanceiro movimentoFinanceiro;
    Double saldo;

    @Override
    public ArrayList<MovimentoFinanceiro> listar() {
        return null;
    }

    @Override
    public void incluir(MovimentoFinanceiro movimentoFinanceiro) {

    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public double consultarSaldoPeriodo(LocalDateTime date) {
        return 0;
    }
}
