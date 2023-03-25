/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Calculo de el volumen  *
 * de una esfera.
 ***************************************/

package ejercicios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio8 extends JFrame implements ActionListener {
	//Atributos de la clase
		private JLabel titulo;
		private JButton Click;
		private JPanel pantalla;
		private JTextField valX;
		
		//constructor de la clase
		public Ejercicio8(){
			pantalla = new JPanel();
			pantalla.setBounds(10, 10, 530, 530);
			pantalla.setBackground(new Color(130,177,255));
			pantalla.setLayout(null);
			add(pantalla);
			
			//Font sirve para cambiarle el formato a las letras, en este caso se probo con el titulo de Método Burbuja
			 Font fuente=new Font("Times New Roman", Font.PLAIN, 20);
			
			titulo = new JLabel("Esfera");//es el titlo que contendra nuestra pantalla
			titulo.setBounds(190, 20, 250, 30);
			titulo.setFont(fuente);
			pantalla.add(titulo);
			
			titulo = new JLabel("Ingrese el radio de la esféra: ");//Imprime sobre la pantalla la palabra arreglo
			titulo.setBounds(20, 50, 200, 20);
			pantalla.add(titulo);
			
			valX = new JTextField();//Sirve para hacer un cuadro de texto donde podamos escribir
			valX.setBounds(250, 50, 200, 20);
			pantalla.add(valX);
			
			
			
			Click = new JButton("Resultado:");
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
			new Ejercicio8();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Click) {
		        String val = valX.getText(); // Aquí obtenemos lo que tenemos en el texto
		        float longitud;
		        float PI = (float) 3.14;
		            float radio = Float.parseFloat(val); // convierte el texto a un valor numérico
		            longitud = 4/3*PI*radio*radio*radio;
		            System.out.println("Longitud de la esfera: " + longitud);
		            JOptionPane.showMessageDialog(null, "Longitud de la esfera: " + longitud, "Longitud de la esfera", JOptionPane.INFORMATION_MESSAGE);
		        
		    }
			
		}
		


}
