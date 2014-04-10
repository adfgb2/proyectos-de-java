package sueldooperario;

import java.util.Scanner;

public class Sueldooperario {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		double horasTrabajadas;
		double costoHora;
		double sueldo;
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
		horasTrabajadas = teclado.nextDouble();
		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextDouble();
		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar:");
		System.out.print(sueldo);
	}

}
