package windowTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm {

	private JFrame frame;
	private JTextField textSumando1;
	private JTextField textSumando2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelUnNumero = new JLabel("Ingrese un numero");
		labelUnNumero.setBounds(46, 37, 123, 52);
		frame.getContentPane().add(labelUnNumero);
		
		textSumando1 = new JTextField();
		textSumando1.setBounds(197, 53, 86, 20);
		frame.getContentPane().add(textSumando1);
		textSumando1.setColumns(10);
		
		JLabel labelResultado = new JLabel("");
		labelResultado.setBounds(46, 212, 123, 14);
		frame.getContentPane().add(labelResultado);
		
		JButton botonActuar = new JButton("Sumar");
		botonActuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String nombre = textSumando1.getText();
				int valor1 = Integer.parseInt(textSumando1.getText());
				int valor2 = Integer.parseInt(textSumando2.getText());
				int suma = valor1 + valor2;
				labelResultado.setText("El resultado es " + suma);
			}
		});
		botonActuar.setBounds(168, 151, 141, 23);
		frame.getContentPane().add(botonActuar);
		
		JLabel labelOtroNumero = new JLabel("Ingrese otro numero");
		labelOtroNumero.setBounds(46, 88, 123, 52);
		frame.getContentPane().add(labelOtroNumero);
		
		textSumando2 = new JTextField();
		textSumando2.setColumns(10);
		textSumando2.setBounds(197, 104, 86, 20);
		frame.getContentPane().add(textSumando2);
		
	}
}
