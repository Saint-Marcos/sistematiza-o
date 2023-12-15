package persistencia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Adicionar extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);
	
	JTextField tfnome, tfcpf;
	JComboBox cbcarga;
	JButton adicionarfun, voltar;
	JLabel lblfunId;
	
	Adicionar() {
		
		getContentPane().setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JLabel heading = new JLabel("ADICIONAR FUNCIONÁRIO", SwingConstants.CENTER);
		heading.setBounds(0, 0, 720, 60);
		heading.setFont(new Font("serif", Font.BOLD, 40));
		add(heading);
		
		JLabel labelnome = new JLabel ("Nome: ");
		labelnome.setBounds(50, 150, 150, 30);
		labelnome.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelnome);
		
		tfnome = new JTextField();
		tfnome.setBounds(200, 150, 150, 30);
		add(tfnome);
		
		JLabel labelcpf = new JLabel ("CPF: ");
		labelcpf.setBounds(50, 200, 150, 30);
		labelcpf.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelcpf);
		
		tfcpf = new JTextField();
		tfcpf.setBounds(200, 200, 150, 30);
		add(tfcpf);
		
		JLabel labelcarga = new JLabel ("Carga 'ton.': ");
		labelcarga.setBounds(50, 250, 150, 30);
		labelcarga.setFont(new Font("serif", Font.PLAIN, 20));
		add(labelcarga);
		
		String cargas[] = {"16t", "23t", "33t", "36t", "41,5t", "43t", "46t", "48,5t", "50t", "53t", "59,85t", "66,15t", "68,77t", "74t", "77,t"};
		cbcarga = new JComboBox(cargas);
		cbcarga.setBackground(Color.WHITE);
		cbcarga.setBounds(200, 250, 150, 30);
		add(cbcarga);
		
		JLabel labelfunId = new JLabel("id Funcionário");
	    labelfunId.setBounds(50, 400, 150, 30);
		labelfunId.setFont(new Font("serif", Font.PLAIN, 20));
	    add(labelfunId);
	        
	     lblfunId = new JLabel("" + number);
	     lblfunId.setBounds(200, 400, 150, 30);
	     lblfunId.setFont(new Font("serif", Font.PLAIN, 20));
	     add(lblfunId);
		
		adicionarfun = new JButton ("Adicionar Funcionário");
		adicionarfun.setBounds(150, 600, 160, 40);
		adicionarfun.addActionListener(this);
		adicionarfun.setBackground(Color.DARK_GRAY);
		adicionarfun.setForeground(Color.WHITE);
		add(adicionarfun);
		
		voltar = new JButton ("Voltar");
		voltar.setBounds(400, 600, 160, 40);
		voltar.addActionListener(this);
		voltar.setBackground(Color.DARK_GRAY);
		voltar.setForeground(Color.WHITE);
		add(voltar);
		
		setSize(720, 720);
		setLocation(250, 50);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == adicionarfun) {
			String nome = tfnome.getText();
			String cpf = tfcpf.getText();
			String carga = (String) cbcarga.getSelectedItem();
			String id = lblfunId.getText();
			
			try {
				Conn conn = new Conn();
				String query = "INSERT INTO public.controle (nome, cpf, carga, id) VALUES('"+nome+"', '"+cpf+"', '"+carga+"', '"+id+"');";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso");
				setVisible(false);
				new Inicio();
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Erro ao adicionar o funcionário, verifique se os dados estão corretos. Nome tem sua extensão máxima de 20 characteres");

			}
		} else {
			setVisible(false);
			new Inicio();
		}
		
	}
	
	public static void main (String [] args) {
		new Adicionar();
	}
}
