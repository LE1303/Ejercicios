/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Calcula la longitud y  *
 * el área de una circunferencia       *
 ***************************************/

package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner lg = new Scanner (System.in);
		float PI = (float) 3.14;
		float radio;
		float area,longitud;
		
		System.out.println("Ingresa el valor del radio de la circunferencia: ");
		radio = lg.nextFloat();
		 longitud = 2*PI*radio;
		 area = PI*radio*radio;
		 System.out.println("La longitud de la circunferencia es: " + longitud);
		 System.out.println("EL área de la circunferencia es: " + area);

	}

}
