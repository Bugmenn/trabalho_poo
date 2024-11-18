package Classes;

import Enum.Categoria;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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
                arquivoEscrita.println(
                    movimento.getClass().getSimpleName().toLowerCase()+";"+
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

    public void lerArquivo(File arquivo) {
        try {
            Scanner arquivoScanner = new Scanner(arquivo, "UTF-8");
            
            // verifica se tem mais linhas do que só o cabeçalho
            if (arquivoScanner.hasNextLine()) {
                String cabecalho = arquivoScanner.nextLine(); // pula o cabeçalho
                if (!cabecalho.equals("tipo;nome;data;categoria;valor")) {
                    throw new IllegalArgumentException("Arquivo não é compativel");
                }

                while (arquivoScanner.hasNextLine()) {
                    String linha = arquivoScanner.nextLine(); // pega a proxima linha com informações
                    String[] informacoes = linha.split(";"); // separa a string onde tem ";" em uma lista
                    
                    String tipo = informacoes[0];
                    String nome = informacoes[1];
                    LocalDateTime data = LocalDateTime.parse(informacoes[2]);
                    Categoria categoria = Categoria.valueOf(informacoes[3]);
                    Double valor = Double.valueOf(informacoes[4]);
                    
                    MovimentoFinanceiro movimento;

                    if (tipo.equals("despesa")) {
                        movimento = new Despesa(nome, categoria, data, valor);
                    } else {
                        movimento = new Receita(nome, categoria, data, valor);
                    }
                    
                    if (!this.movimentoFinanceiro.contains(movimento)) {
                        this.incluir(movimento);
                    }
                }
                
                arquivoScanner.close();
            }
            
        } catch (FileNotFoundException  e) {
            System.out.println("Arquivo não encontrado");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
