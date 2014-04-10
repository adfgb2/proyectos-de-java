import java.util.Scanner;

public class anidadas {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int not1, not2, not3 ;
		System.out.print("Ingrese la primera nota:");
		not1 = teclado.nextInt();
		System.out.print("Ingrese la segunda nota:");
		not2 = teclado.nextInt();
		System.out.print("Ingrese la tercera nota:");
		not3 = teclado.nextInt();
		float promedio;
		promedio= (not1+ not2 + not3 )/3;
		if (promedio >= 7){
			System.out.print("promocionado");
			}
		else {
			if (promedio >= 4){
				System.out.print("regular");
				}
			else{
				System.out.print("desaprobado");
			}
		}
		
				
	}

}
