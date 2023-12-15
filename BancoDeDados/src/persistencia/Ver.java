package persistencia;

import java.awt.Choice;
import java.awt.Color;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import net.proteanit.sql.DbUtils;


public class Ver extends JFrame {
	
	JTable table;
	Choice cfuncionarioid;
	
	Ver() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel searchlbl = new JLabel ("Procurar Funcionário por ID");
		searchlbl.setBounds(20, 20, 150, 20);
		add(searchlbl);
		
		cfuncionarioid = new Choice();
		cfuncionarioid.setBounds(180, 20, 150, 200);
		add(cfuncionarioid);		
		
		try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT nome, cpf, carga, id FROM public.controle;");
            while (rs.next()) {
            	cfuncionarioid.add(rs.getString("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		table = new JTable();
	
		
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(0, 100, 900, 600);
		add(jsp);
		
		setSize(900, 700);
		setLocation(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		
	}
	
}
