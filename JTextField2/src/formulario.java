import javax.swing.*;

import java.awt.event.*;
public class formulario extends JFrame implements ActionListener {
	private JTextField textfield1, textfield2;
	private JButton boton1;
	private JLabel label1,label2;
	public formulario(){
		
		setLayout (null);
		label1 = new JLabel("Usuario");
		label1.setBounds(10,10,100,30);
		add (label1);
		label2 = new JLabel("Contraseña");
		label2.setBounds(10,100,100,30);
		add (label2);
		
		textfield1=new JTextField();
		textfield1.setBounds(10,50,150,30);
		add(textfield1);
		textfield2=new JTextField();
		textfield2.setBounds(10,150,150,30);
		add (textfield2);
		boton1=new JButton ("Ingresar");
		boton1.setBounds(10,200,300,30);
		add (boton1);
		boton1.addActionListener(this);
		
	}
	public void actionPerformed (ActionEvent e){
		final JPanel panel = new JPanel();
		if (e.getSource()==boton1){
			String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("juan")==true && cad2.equals("abc123")==true) {
            	JOptionPane.showMessageDialog(panel, "Bienvenido JUAN!");
            } else {
            	JOptionPane.showMessageDialog(panel, "Usted va a ser denunciado y su computadora "
            			+ "va explotar en los proximos segundos CORRA!","Inane error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] ar) {
        formulario formulario1=new formulario();
        formulario1.setBounds(0,0,500,500);
        formulario1.setVisible(true);
    }    
}