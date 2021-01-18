package conexao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField TxtNome;
	private JTextField TxtMail;
	private JTextField TxtTel;
	private JPasswordField TxtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
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
	public TelaDeCadastro() {
		setTitle("Cadastro de Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 379);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(23, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(23, 60, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(23, 85, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(272, 88, 46, 14);
		contentPane.add(lblSenha);
		
		TxtNome = new JTextField();
		TxtNome.setEnabled(false);
		TxtNome.setBounds(75, 32, 355, 20);
		contentPane.add(TxtNome);
		TxtNome.setColumns(10);
		
		TxtMail = new JTextField();
		TxtMail.setEnabled(false);
		TxtMail.setColumns(10);
		TxtMail.setBounds(75, 57, 355, 20);
		contentPane.add(TxtMail);
		
		TxtTel = new JTextField();
		TxtTel.setEnabled(false);
		TxtTel.setForeground(Color.BLACK);
		TxtTel.setColumns(10);
		TxtTel.setBounds(75, 82, 142, 20);
		contentPane.add(TxtTel);
		
		TxtSenha = new JPasswordField();
		TxtSenha.setEnabled(false);
		TxtSenha.setBounds(311, 82, 119, 20);
		contentPane.add(TxtSenha);
		
		JList list = new JList();
		list.setBounds(23, 110, 408, 205);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(440, 43, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(440, 74, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(440, 106, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(441, 292, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtNome.enable(true);
				TxtMail.enable(true);
				TxtSenha.enable(true);
				TxtTel.enable(true);
			}
		});
		btnInserir.setBounds(440, 11, 89, 23);
		contentPane.add(btnInserir);
	}
}
