package persistencia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.html.ImageView;

public class Interface extends JFrame {

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
        
        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(300, 620, 150, 40);
        btnContinuar.setBackground(Color.BLACK);
        btnContinuar.setForeground(Color.WHITE);
        add(btnContinuar);
        
		setSize(720, 720);
		setLocation(200, 50);
		setVisible(true);
	}
	
		public static void main(String args[]) {
			new Interface();
		}
}
