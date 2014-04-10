import javax.swing.*;
public class formulario extends JFrame {
	formulario (){
		setLayout (null);
	}
	
	public static void main (String []ar){
		formulario formulario1=new formulario ();
		formulario1.setBounds(90,30,1024,800);	
		formulario1.setResizable(true);
		formulario1.setVisible(true);
	}
}