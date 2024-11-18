package Classes;

import Enum.Categoria;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        MovimentoFinanceiro des1 = new Despesa("despesa1", Categoria.ALIMENTACAO, LocalDateTime.now(), 12.0);
        conta.incluir(des1);
        MovimentoFinanceiro rec1 = new Receita("receita1", Categoria.DECIMO_TERCEIRO, LocalDateTime.now(), 100.0);
        conta.incluir(rec1);
        conta.criarArquivo();
    }
}
