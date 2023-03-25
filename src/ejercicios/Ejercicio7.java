/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Calculo de la          *
 * hipotenusa de un triangulo rectángulo*
 ***************************************/

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner pi = new Scanner(System.in);
		double cateto1,cateto2;
		double hipotenusa;
		System.out.println("Ingrese la longitud del primer cateto:");
		cateto1 = pi.nextDouble();
		System.out.println("Igrese la longitud del segundo cateto: ");
		cateto2 = pi.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
		System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
		

	}

}
