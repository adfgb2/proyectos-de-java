import javax.swing.*;
public class formulario extends JFrame {
	private JLabel label1, label2;
	public formulario (){
		setLayout (null);
		label1=new JLabel ("Sistema de Facturacion.");
		label1.setBounds(10,20,300,30);
		add(label1);
		label2=new JLabel ("version 1.0");
		label2.setBounds(10,100,300,30);
		add(label2);
		
	}
	public static void main (String []ar){
		formulario formulario1=new formulario();
		formulario1.setBounds (0,0,300,200);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
	
	

}
