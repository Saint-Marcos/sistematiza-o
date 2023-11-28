package persistencia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Interface extends JFrame implements ActionListener{

	Interface() {
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel ("CONTROLE DE FUNCIONÁRIOS", SwingConstants.CENTER);
		heading.setBounds(0, 0, 720, 60);
		heading.setFont(new Font("serif", Font.BOLD, 30));
		heading.setForeground(Color.WHITE);
		add(heading);
		
		
		ImageIcon imagemFundo = new ImageIcon(getClass().getResource("/imagens/Tela-Inicial.jpg")); 
        JLabel labelImagem = new JLabel(imagemFundo);
        labelImagem.setBounds(0, 0, 720, 720); 
        add(labelImagem);
        
        JButton btnAcessar = new JButton("ACESSAR");
        btnAcessar.setBounds(285, 620, 150, 40);
        btnAcessar.setBackground(Color.DARK_GRAY);
        btnAcessar.setForeground(Color.WHITE);
        btnAcessar.addActionListener(this);
        add(btnAcessar);
        
		setSize(720, 720);
		setLocation(200, 50);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ae) {
			setVisible(false);
			new Login();
		}
	
		public static void main(String args[]) {
			new Interface();
		}
}
