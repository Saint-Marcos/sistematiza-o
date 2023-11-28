package persistencia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Inicio extends JFrame implements ActionListener {

	JButton adicionar, ver, atualizar, remover;
	
	Inicio() {
		setLayout(null);
			
		ImageIcon imagemFundo = new ImageIcon(getClass().getResource("/imagens/inicio.jpg")); 
		Image imagem = imagemFundo.getImage();
		int novaLargura = 720;
		int novaAltura = 720;
		ImageIcon imagemRedimensionada = new ImageIcon(imagem.getScaledInstance(novaLargura, novaAltura, Image.SCALE_SMOOTH));
		JLabel labelImagem = new JLabel(imagemRedimensionada);
		labelImagem.setBounds(0, 0, novaLargura, novaAltura);
		add(labelImagem);
		
		JLabel heading = new JLabel ("CONTROLE DE FUNCIONÁRIOS", SwingConstants.CENTER);
		heading.setBounds(0, 0, 720, 60);
		heading.setFont(new Font("serif", Font.BOLD, 30));
		labelImagem.add(heading);

		adicionar = new JButton("Adicionar Funcionário");
		adicionar.setBounds (245, 150, 180, 40);
		adicionar.addActionListener(this);
		labelImagem.add(adicionar);
		
		ver = new JButton("Ver Funcionário");
		ver.setBounds (245, 250, 180, 40);	
		ver.addActionListener(this);
		labelImagem.add(ver);
		
		atualizar = new JButton("Atualizar Funcionário");
		atualizar.setBounds (245, 350, 180, 40);
		atualizar.addActionListener(this);
		labelImagem.add(atualizar);
		
		remover = new JButton("Remover Funcionário");
		remover.setBounds (245, 450, 180, 40);	
		remover.addActionListener(this);
		labelImagem.add(remover);
		
		setSize(720, 720);
		setLocation(200, 50);
		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent ae) {
		if (ae.getSource() == adicionar) {
		}
		
		else if (ae.getSource() == ver) {
		}
		
		else if (ae.getSource() == atualizar) {
		}
		
		else {
			
		}
	}
	
	
	public static void main(String[] args) {
		new Inicio();
	}

}
