package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import custom.component.JButtonCustom;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		tabbedPane.setBounds(190, -25, 573, 435);
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
		
		//JButtonCustom btnCadastrar = new JButtonCustom();
		//btnCadastrar.setText("Cadastrar");
		//btnCadastrar.setBounds(24, 175, 141, 39);
		//panMenu.add(btnCadastrar);
		
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
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 42, 414, 213);
		//listar.getContentPane().add(panel);
		panel.setLayout(null);
		
	}
}
