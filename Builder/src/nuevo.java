import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class nuevo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevo frame = new nuevo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public nuevo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ingrese primer valor");
		lblNewLabel.setBounds(17, 26, 154, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese segundo valor");
		lblNewLabel_1.setBounds(17, 71, 154, 14);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(411, 253, 46, 14);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1=Integer.parseInt(textField.getText());
				int v2=Integer.parseInt(textField_1.getText());
				int suma = v1+v2;
				lblNewLabel_3.setText(String.valueOf(suma));
			}
		});
		btnNewButton.setBounds(181, 137, 86, 23);
		
		textField = new JTextField();
		textField.setBounds(181, 23, 86, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 68, 86, 20);
		textField_1.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField_1);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("resultado");
		lblNewLabel_3.setBounds(290, 141, 63, 14);
		contentPane.add(lblNewLabel_3);
	}
}
