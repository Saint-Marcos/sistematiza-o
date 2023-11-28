package persistencia;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	JTextField tfusuario, tfsenha; 
	
	Login(){
		
		getContentPane().setBackground(Color(251, 253, 250));
		setLayout(null);
		
		JLabel lblusuario = new JLabel("Usuário:");
		lblusuario.setForeground(Color.DARK_GRAY);
		lblusuario.setBounds(40, 20, 100, 30);
		add(lblusuario);
		
		tfusuario = new JTextField();
		tfusuario.setBounds(150, 20, 150, 30);
		tfusuario.setBackground(Color(251, 253, 250));
		tfusuario.setForeground(Color.DARK_GRAY);
		add(tfusuario);
		
		JLabel lblsenha = new JLabel("Senha:");
		lblsenha.setForeground(Color.DARK_GRAY);
		lblsenha.setBounds(40, 70, 100, 30);
		add(lblsenha);
		
		tfsenha = new JTextField();
		tfsenha.setBounds(150, 70, 150, 30);
		tfsenha.setBackground(Color(251, 253, 250));
		tfsenha.setForeground(Color.DARK_GRAY);
		add(tfsenha);
		
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(150, 140, 150, 30);
        btnLogin.setBackground(Color.DARK_GRAY);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.addActionListener(this);
        add(btnLogin);
        
        ImageIcon imagemLogin = new ImageIcon(getClass().getResource("/imagens/autenticação.png"));
        JLabel labelImagem = new JLabel(imagemLogin);
        labelImagem.setBounds(350, 0, 200, 200);
        add(labelImagem);
		
		setSize(600, 300);
		setLocation(450, 209);
		setVisible(true);
	}
	
private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

public void actionPerformed(ActionEvent ae) {
	try {
		String usuario = tfusuario.getText();
		String senha = tfsenha.getText();
		
		Conn c = new Conn();
		String query = "SELECT usuario, senha\r\n" + "FROM public.login\r\n";
		
		ResultSet rs = c.s.executeQuery(query);
		if (rs.next()) {
			setVisible(false);
			new Inicio ();
		} else {
			JOptionPane.showMessageDialog(null, "O usuário ou senha estão incorretos");
			setVisible(false);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void main (String[] args) {
		new Login();
	}
}