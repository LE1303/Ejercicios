/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Imprime en pantalla    *
 * 	Buenos días, sefuido de un nombre  *
 ***************************************/

package ejercicios;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2  extends JFrame implements ActionListener{
	//Atributos de la clase
		private JLabel titulo;
		private JButton Click;
		private JPanel panel;
		private JTextField valX;
		
		//constructor de la clase
		public Ejercicio2(){
			panel = new JPanel();
			panel.setBounds(10, 10, 480, 480);
			panel.setBackground(new Color(0,255,204));
			panel.setLayout(null);
			add(panel);
			
			//Font sirve para cambiarle el formato a las letras, en este caso se probo con el titulo de Método Burbuja
			 Font fuente=new Font("Times New Roman", Font.PLAIN, 20);
			
			titulo = new JLabel("Buenos Dias");//es el titlo que contendra nuestra pantalla
			titulo.setBounds(190, 20, 250, 30);
			titulo.setFont(fuente);
			panel.add(titulo);
			
			titulo = new JLabel("Nombre ");//Imprime sobre la pantalla la palabra arreglo
			titulo.setBounds(20, 50, 200, 20);
			panel.add(titulo);
			
			valX = new JTextField();//Sirve para hacer un cuadro de texto donde podamos escribir
			valX.setBounds(80, 50, 200, 20);
			panel.add(valX);
			
			
			
			Click = new JButton("Nombre");
			Click.setBounds(150, 150, 200, 40);
			Click.addActionListener(this);
			panel.add(Click);
			
			
			
			setResizable(false);
			setLayout(null);
			setSize(500, 250);//tamaño de la pantalla
			setVisible(true);
			//instrucción para centrar la pantalla
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			int x = getWidth()/2;
			int y =  getHeight()/2;
			setLocation(x, y);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		}
	
	public static void main(String[] args) {
		new Ejercicio2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Click) {
		
			titulo.setText("Buenos Días ");
			titulo.setBounds(20, 200,120, 20);
			
			String x = (valX.getText());
			System.out.println("Buenos Días: " + x);
			JOptionPane.showMessageDialog(null, "Buenos Días: " + x, " Buenos Días" + x, JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	

}
