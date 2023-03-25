/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 23/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Calculo del area de    *
 * un triangulo rectangulo.
 ***************************************/


package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		double longitud, area;
		System.out.println("Ingrese la longitud de un lado del triangulo: ");
		longitud = cat.nextDouble();
		area = (Math.sqrt(3)/4)*longitud*longitud;
		System.out.println("El área del triangulo es: " + area);
		
		

	}

}
