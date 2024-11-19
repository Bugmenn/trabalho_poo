package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public TelaListar telaListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 449);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(190, 140, 414, 189);
		contentPane.add(tabbedPane);

		
		JPanel panCadastrar = new JPanel();
		tabbedPane.addTab("New tab", null, panCadastrar, null);
		
		JLabel lblNewLabel_2 = new JLabel("tab 2");
		panCadastrar.add(lblNewLabel_2);
		
		JPanel panImportar = new JPanel();
		tabbedPane.addTab("New tab", null, panImportar, "Importar arquivo");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panImportar.add(lblNewLabel_1);
		
		JPanel panListar = new JPanel();
		tabbedPane.addTab("New tab", null, panListar, null);
		
		JPanel panMenu = new JPanel();
		panMenu.setBackground(new Color(0, 128, 128));
		panMenu.setForeground(new Color(255, 128, 64));
		panMenu.setBounds(0, 0, 190, 410);
		contentPane.add(panMenu);
		panMenu.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.setBounds(24, 175, 141, 29);
		panMenu.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Importar Arquivo");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(24, 121, 141, 29);
		panMenu.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Listar");
		btnNewButton_2.setBounds(24, 228, 141, 29);
		panMenu.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Escolha uma opção do Menu");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(24, 40, 143, 23);
		panMenu.add(lblNewLabel);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListar telaListar2 = new TelaListar();
				telaListar2.setBounds(10, 108, 414, 241);
				contentPane.add(telaListar2);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 42, 414, 213);
		//listar.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(17, 7, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(17, 33, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(17, 59, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
	}
}
