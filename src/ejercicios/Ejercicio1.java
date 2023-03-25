/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de Creación: 22/03/2023       *
 * Fecha de Actualización: 22/03/2023  *
 * Descripción: Recibe dos numeros y   *
 *             los muestra en pantalla *
 ***************************************/

package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Ingrese el primer número: ");
		numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo número: ");
		numero2 = sc.nextInt();
		
		System.out.println("Números Ingresados: \n"+ numero1 );
		System.out.println(""+numero2);
		
	}

}
