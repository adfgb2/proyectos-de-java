import javax.swing.*;
public class formulario extends JFrame {
	private JLabel label1,label2,label3;
	public formulario (){
		setLayout (null);
		label1=new JLabel ("Azul");
		label1.setBounds(10,10,300,30);
		add (label1);
		label2=new JLabel ("Negro");
		label2.setBounds(10,30,300,30);
		add (label2);
		label3 =new JLabel ("rojo");
		label3.setBounds(10,50,300,30);
		add (label3);
		
	}
	public static void main (String []ar){
		formulario formulario1 = new formulario ();
		formulario1.setBounds(0,0,300,200);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
	}
	

}
