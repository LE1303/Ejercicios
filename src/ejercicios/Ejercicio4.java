/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Convierte grados C° a F*
 ***************************************/


package ejercicios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio4 extends JFrame implements ActionListener {
	//Atributos de la clase
			private JLabel titulo;
			private JButton Click;
			private JPanel pantalla;
			private JTextField valX;
			
			//constructor de la clase
			public Ejercicio4(){
				pantalla = new JPanel();
				pantalla.setBounds(10, 10, 530, 530);
				pantalla.setBackground(new Color(0,200,85));
				pantalla.setLayout(null);
				add(pantalla);
				
				//Font sirve para cambiarle el formato a las letras, en este caso se probo con el titulo de Método Burbuja
				 Font fuente=new Font("Times New Roman", Font.PLAIN, 20);
				
				titulo = new JLabel("Grados");//es el titlo que contendra nuestra pantalla
				titulo.setBounds(190, 20, 250, 30);
				titulo.setFont(fuente);
				pantalla.add(titulo);
				
				titulo = new JLabel("Ingrese los grados centígrados: ");//Imprime sobre la pantalla la palabra arreglo
				titulo.setBounds(20, 50, 200, 20);
				pantalla.add(titulo);
				
				valX = new JTextField();//Sirve para hacer un cuadro de texto donde podamos escribir
				valX.setBounds(250, 50, 200, 20);
				pantalla.add(valX);
				
				
				
				Click = new JButton("Convertir");
				Click.setBounds(150, 150, 200, 40);
				Click.addActionListener(this);
				pantalla.add(Click);
				
				
				
				setResizable(false);
				setLayout(null);
				setSize(550, 250);//tamaño de la pantalla
				setVisible(true);
				//instrucción para centrar la pantalla
				Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
				int x = getWidth()/2;
				int y =  getHeight()/2;
				setLocation(x, y);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}
	
	public static void main(String[] args) {
		
		new Ejercicio4();
		
		/*Scanner c = new Scanner(System.in);
		float GradosC;
		float GradosF;
		System.out.println("Ingrece los grados centígrados: ");
		GradosC = c.nextFloat();
		GradosF = 32 + (9*GradosC/5);
		System.out.println("Los grados convertidos a Fahrenheit: " + GradosF);*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == Click) {
		        String val = valX.getText(); 
		        float GradosF = 0;
		            float x = Float.parseFloat(val); // convierte el texto a un valor numérico
		            GradosF = 32 + ((9 * x) / 5);
		            System.out.println("Los grados convertidos a Fahrenheit: " + GradosF);
		            JOptionPane.showMessageDialog(null, "Los grados convertidos a Fahrenheit: " + GradosF, "Los grados convertidos a Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
		        
		    }
	}
}
