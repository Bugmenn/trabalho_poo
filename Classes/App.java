package Classes;

import Enum.Categoria;
import java.time.LocalDateTime;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        MovimentoFinanceiro des1 = new Despesa("despesa1", Categoria.ALIMENTACAO, LocalDateTime.now(), 12.0);
        conta.incluir(des1);
        MovimentoFinanceiro rec1 = new Receita("receita1", Categoria.DECIMO_TERCEIRO, LocalDateTime.now(), 100.0);
        conta.incluir(rec1);
        conta.criarArquivo();

        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("selecione o arquivo csv", "csv");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(fileFilter);
        
        int retorno = chooser.showOpenDialog(chooser);
        
        if (retorno == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile().getName().toLowerCase().endsWith(".csv")) {
            conta.lerArquivo(chooser.getSelectedFile());
        }
    }
}
