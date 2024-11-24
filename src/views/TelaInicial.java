package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import custom.component.JButtonCustom;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 449);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(190, -25, 573, 435);
		contentPane.add(tabbedPane);
		
		MaskFormatter mascaraDinheiro = null;
		MaskFormatter mascaraData = null;

		try {
			mascaraDinheiro = new MaskFormatter("R$ ");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraDinheiro.setPlaceholderCharacter('_');
			mascaraData.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JPanel panImportar = new JPanel();
		panImportar.setBackground(new Color(212, 212, 212));
		tabbedPane.addTab("New tab", null, panImportar, "Importar arquivo");
		panImportar.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Importe o seu arquivo .csv com suas despesas e receitas");
		lblNewLabel_1.setForeground(new Color(64, 128, 128));
		lblNewLabel_1.setBackground(new Color(64, 128, 128));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setBounds(35, 27, 510, 60);
		panImportar.add(lblNewLabel_1);
		
		JPanel panListar = new JPanel();
		panListar.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("New tab", null, panListar, null);
		panListar.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Escolha uma opção de listagem");
		lblNewLabel_7.setForeground(new Color(64, 128, 128));
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_7.setBounds(120, 24, 398, 23);
		panListar.add(lblNewLabel_7);
		
		JRadioButton rdbtnDespesaListar = new JRadioButton("Despesa");
		rdbtnDespesaListar.setSelected(true);
		rdbtnDespesaListar.setBounds(38, 81, 81, 23);
		panListar.add(rdbtnDespesaListar);
		
		JRadioButton rdbtnAmbasListar = new JRadioButton("Ambas");
		rdbtnAmbasListar.setBounds(223, 81, 81, 23);
		panListar.add(rdbtnAmbasListar);
		
		JRadioButton rdbtnReceitaListar = new JRadioButton("Receita");
		rdbtnReceitaListar.setBounds(130, 81, 81, 23);
		panListar.add(rdbtnReceitaListar);
		
		ButtonGroup groupListar = new ButtonGroup();
		groupListar.add(rdbtnDespesaListar);
		groupListar.add(rdbtnReceitaListar);
		groupListar.add(rdbtnAmbasListar);
		
		JButton btnListar_1 = new JButton("Listar");
		btnListar_1.setBackground(new Color(128, 255, 0));
		btnListar_1.setBounds(329, 81, 189, 23);
		panListar.add(btnListar_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(384, 193, 17, 48);
		panListar.add(scrollBar);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(144, 182, 100, 100);
		panListar.add(scrollPane);
		
				
				JPanel panCadastrar = new JPanel();
				panCadastrar.setBackground(new Color(192, 192, 192));
				tabbedPane.addTab("New tab", null, panCadastrar, null);
				panCadastrar.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("Descrição:");
				lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				lblNewLabel_2.setBounds(25, 150, 120, 45);
				panCadastrar.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("Data:");
				lblNewLabel_3.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				lblNewLabel_3.setBounds(29, 206, 65, 32);
				panCadastrar.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("Categoria:");
				lblNewLabel_4.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				lblNewLabel_4.setBounds(29, 263, 96, 20);
				panCadastrar.add(lblNewLabel_4);
				
				JLabel lblNewLabel_5 = new JLabel("Valor:");
				lblNewLabel_5.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				lblNewLabel_5.setBounds(288, 210, 86, 25);
				panCadastrar.add(lblNewLabel_5);
				
				txtDescricao = new JTextField();
				txtDescricao.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				txtDescricao.setBounds(159, 157, 333, 32);
				panCadastrar.add(txtDescricao);
				txtDescricao.setColumns(10);
				
				JComboBox cmbCategoria = new JComboBox();
				cmbCategoria.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				cmbCategoria.setBounds(159, 262, 333, 22);
				panCadastrar.add(cmbCategoria);
				JFormattedTextField txtfValor = new JFormattedTextField(mascaraDinheiro);
				txtfValor.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				txtfValor.setBounds(372, 210, 120, 25);
				panCadastrar.add(txtfValor);
				
				JFormattedTextField txtfData = new JFormattedTextField(mascaraData);
				txtfData.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				txtfData.setBounds(158, 209, 120, 27);
				panCadastrar.add(txtfData);
				
				JLabel lblNewLabel_6 = new JLabel("Cadastre uma despesa ou receita");
				lblNewLabel_6.setForeground(new Color(64, 128, 128));
				lblNewLabel_6.setBackground(new Color(64, 128, 128));
				lblNewLabel_6.setFont(new Font("Sitka Small", Font.BOLD, 22));
				lblNewLabel_6.setBounds(106, 22, 404, 34);
				panCadastrar.add(lblNewLabel_6);
				
				JRadioButton rdBtnDespesa = new JRadioButton("Despesa");
				rdBtnDespesa.setSelected(true);
				rdBtnDespesa.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				rdBtnDespesa.setBounds(158, 105, 130, 32);
				panCadastrar.add(rdBtnDespesa);
				
				JRadioButton rdBtnReceita = new JRadioButton("Receita");
				rdBtnReceita.setFont(new Font("Sitka Small", Font.PLAIN, 18));
				rdBtnReceita.setBounds(353, 105, 139, 32);
				panCadastrar.add(rdBtnReceita);
				
				ButtonGroup groupCadastrar = new ButtonGroup();
				groupCadastrar.add(rdBtnDespesa);
				groupCadastrar.add(rdBtnReceita);
				
				JLabel lblNewLabel_2_1 = new JLabel("Tipo:");
				lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 18));
				lblNewLabel_2_1.setBounds(25, 99, 120, 45);
				panCadastrar.add(lblNewLabel_2_1);
				
				JButton btnSalvarMovimentoFinanceiro = new JButton("Salvar");
				btnSalvarMovimentoFinanceiro.setBackground(new Color(128, 255, 0));
				btnSalvarMovimentoFinanceiro.setBounds(119, 330, 120, 23);
				panCadastrar.add(btnSalvarMovimentoFinanceiro);
				
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setBackground(new Color(255, 0, 0));
				btnCancelar.setBounds(319, 330, 130, 23);
				panCadastrar.add(btnCancelar);
		
		JPanel panMenu = new JPanel();
		panMenu.setBackground(new Color(68, 149, 157));
		panMenu.setForeground(new Color(255, 128, 64));
		panMenu.setBounds(0, 0, 190, 410);
		contentPane.add(panMenu);
		panMenu.setLayout(null);
		
		JButton btnCadastrar = new JButton();
		btnCadastrar.setText("Cadastrar");
		btnCadastrar.setBounds(24, 175, 141, 39);
		panMenu.add(btnCadastrar);
		
		JButton btnImportar = new JButton("Importar Arquivo");
		btnImportar.setForeground(new Color(0, 0, 0));
		btnImportar.setBackground(new Color(255, 255, 255));
		btnImportar.setBounds(24, 121, 141, 29);
		panMenu.add(btnImportar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(24, 228, 141, 29);
		panMenu.add(btnListar);
		
		JLabel lblNewLabel = new JLabel("Escolha uma opção do Menu");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(24, 40, 143, 23);
		panMenu.add(lblNewLabel);
		
 

		btnImportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDescricao.setText("");
				txtfData.setText("");
				txtfValor.setText("");
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 42, 414, 213);
		//listar.getContentPane().add(panel);
		panel.setLayout(null);
		
	}
}
