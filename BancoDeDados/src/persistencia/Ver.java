package persistencia;

import java.awt.Color;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;


public class Ver extends JFrame{
	
	JTable table;
	
	Ver() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		table = new JTable();
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("SELECT nome, cpf, carga FROM public.controle;");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
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
