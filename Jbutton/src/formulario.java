import javax.swing.*;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class formulario extends JFrame implements ActionListener {
	JButton boton1;
	public formulario (){
		setLayout(null);
		boton1=new JButton("Finalizar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener (this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()== boton1){
			System.exit(0);
		}
	}
	public static void main (String []ar){
		formulario formulario1 = new formulario ();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
	}
	

}
