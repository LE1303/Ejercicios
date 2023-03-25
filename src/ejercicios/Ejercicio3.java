/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 22/03/2023       *
 * Fecha de Actualización: 23/03/2023  *
 * Descripción: Recibe dos numeros y   *
 * 		saca su doble y su tripe       *
 ***************************************/

package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int numero;
		int doble;
		int triple;
		System.out.println("Ingrese un número: ");
		numero = num.nextInt();
		
		doble = numero * numero;
		triple = doble * numero;
		
		System.out.println("El doble del número es: " + doble);
		System.out.println("El tripe del número es: " + triple);
	}

}
