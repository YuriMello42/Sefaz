package conexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaDeLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tUsers;
	private JPasswordField tSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
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
	public TelaDeLogin() {
		setResizable(false);
		setFont(new Font("Dotum", Font.ITALIC, 11));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(137, 80, 65, 20);
		contentPane.add(lblNewLabel);
		
		tUsers = new JTextField();
		tUsers.setBounds(193, 80, 106, 20);
		contentPane.add(tUsers);
		tUsers.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(137, 111, 65, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton bLogin = new JButton("Login");
		bLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					Connection cnx = conexao_JDBC.conexao();
			
					String sql = "select * from usuarios where nome=? and senha=?";
				
					PreparedStatement stnt = cnx.prepareStatement(sql);
					
					stnt.setString(1, tUsers.getText());
					stnt.setString(2, tSenha.getText());
				
					ResultSet resultado = stnt.executeQuery();
					
					if (resultado.next()) {
						
						//JOptionPane.showMessageDialog(null, "Bem vindo.");
						
						TelaDeCadastro tc = new TelaDeCadastro();
						tc.setVisible(true);
						setVisible(false);
					
					}else {
						
						JOptionPane.showMessageDialog(null, "Usuário inexistente, Tente novamente!");
					
					}
					
					stnt.close();
					cnx.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		bLogin.setBounds(137, 148, 162, 23);
		contentPane.add(bLogin);
		
		tSenha = new JPasswordField();
		tSenha.setBounds(193, 111, 106, 20);
		contentPane.add(tSenha);
	}
}
