package Classes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ContaBancaria implements IGerenciamentoContaBancaria {

    ArrayList<MovimentoFinanceiro> movimentoFinanceiro = new ArrayList<>();
    Double saldo = 0.0;

    public ContaBancaria() {
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public ArrayList<MovimentoFinanceiro> listar() {
        return movimentoFinanceiro;
    }

    @Override
    public void incluir(MovimentoFinanceiro movimentoFinanceiro) {
        if (movimentoFinanceiro instanceof Despesa) {
            saldo -= ((Despesa) movimentoFinanceiro).getValor();
        }
        if (movimentoFinanceiro instanceof Receita) {
            saldo += ((Receita) movimentoFinanceiro).getValor();
        }
        this.movimentoFinanceiro.add(movimentoFinanceiro);
    }

    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public double consultarSaldoPeriodo(LocalDateTime date) {
        return 0;
    }

    public void criarArquivo() {
        try {            
            File arquivo = new File("arquivoContaBancaria.csv");
            PrintWriter arquivoEscrita = new PrintWriter(arquivo);

            // cabeçalho
            arquivoEscrita.println("tipo;nome;data;categoria;valor");

            // dados
            for (MovimentoFinanceiro movimento : movimentoFinanceiro) {
                String tipo = movimento instanceof Despesa ? "despesa" : "receita";
                arquivoEscrita.println(
                    tipo+";"+
                    movimento.getNome()+";"+
                    movimento.getData().toString()+";"+
                    movimento.getCategoria()+";"+
                    movimento.getValor()
                );
            }

            arquivoEscrita.close();
            
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }
}
