/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Lee un numero y los    *
 * separa por cada digito
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

public class Ejercicio10 extends JFrame implements ActionListener {
	//Atributos de la clase
			private JLabel titulo;
			private JButton Click;
			private JPanel panel;
			private JTextField valX;
			
			//constructor de la clase
			public Ejercicio10(){
				panel = new JPanel();
				panel.setBounds(10, 10, 527, 527);
				panel.setBackground(new Color(198,255,0));
				panel.setLayout(null);
				add(panel);
				
				//Font sirve para cambiarle el formato a las letras, en este caso se probo con el titulo de Método Burbuja
				 Font fuente1=new Font("Tahoma", Font.BOLD, 25);
				
				titulo = new JLabel("Cifras");//es el titlo que contendra nuestra pantalla
				titulo.setBounds(220, 20, 250, 30);
				titulo.setFont(fuente1);
				panel.add(titulo);
				
				titulo = new JLabel("Ingresa un numero de tres cifras: ");//Imprime sobre la pantalla la palabra arreglo
				titulo.setBounds(20, 50, 250, 20);
				panel.add(titulo);
				
				valX = new JTextField();//Sirve para hacer un cuadro de texto donde podamos escribir
				valX.setBounds(260, 50, 200, 20);
				panel.add(valX);
				
				
				
				Click = new JButton("Resultado");
				Click.setBounds(150, 150, 200, 40);
				Click.addActionListener(this);
				panel.add(Click);
				
				
				
				setResizable(false);
				setLayout(null);
				setSize(550, 300);//tamaño de la pantalla
				setVisible(true);
				//instrucción para centrar la pantalla
				Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
				int x = getWidth()/2;
				int y =  getHeight()/2;
				setLocation(x, y);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}
			public static void main(String[] args) {
				new Ejercicio10();
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Click) {
					int num1,num2,num3;
			        String val = valX.getText(); // Aquí obtenemos lo que tenemos en el texto
			          int x = Integer.parseInt(val); // convierte el texto a un valor numérico
			           num1 = x/100;
			           num2 = (x/10)%10;
			           num3 = x % 10;
			            System.out.println("Numero: " + num1  + num2 + num3);
			            JOptionPane.showMessageDialog(null, "Numero: " +  num1 + num2 + num3, "Numero", JOptionPane.INFORMATION_MESSAGE);
			        
			    }
				
			}


}
