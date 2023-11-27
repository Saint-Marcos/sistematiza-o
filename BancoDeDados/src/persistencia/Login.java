package persistencia;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame{

	Login(){
		
		getContentPane().setBackground(Color(251, 253, 250));
		setLayout(null);
		
		JLabel lblusuario = new JLabel("Usuário:");
		lblusuario.setForeground(Color.DARK_GRAY);
		lblusuario.setBounds(40, 20, 100, 30);
		add(lblusuario);
		
		JTextField tfusuario = new JTextField();
		tfusuario.setBounds(150, 20, 150, 30);
		tfusuario.setBackground(Color(251, 253, 250));
		tfusuario.setForeground(Color.DARK_GRAY);
		add(tfusuario);
		
		JLabel lblsenha = new JLabel("Senha:");
		lblsenha.setForeground(Color.DARK_GRAY);
		lblsenha.setBounds(40, 70, 100, 30);
		add(lblsenha);
		
		JTextField tfsenha = new JTextField();
		tfsenha.setBounds(150, 70, 150, 30);
		tfsenha.setBackground(Color(251, 253, 250));
		tfsenha.setForeground(Color.DARK_GRAY);
		add(tfsenha);
		
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(150, 140, 150, 30);
        btnLogin.setBackground(Color.DARK_GRAY);
        btnLogin.setForeground(Color.WHITE);
        add(btnLogin);
        
        ImageIcon imagemLogin = new ImageIcon(getClass().getResource("/imagens/LOGIN.jpg"));
        Image image = imagemLogin.getImage();
        Image newImage = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon newIcon = new ImageIcon(newImage);
        JLabel labelImagem = new JLabel(newIcon);
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

public static void main (String[] args) {
		new Login();
	}
}
	

