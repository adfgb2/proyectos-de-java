import java.util.Scanner;
public class lol {
	public static void main(String [] ar) {
		Scanner teclado=new Scanner(System.in);
		float num1, num2 ;
		System.out.print("Ingrese el primer numero");
		num1 = teclado.nextFloat();
		System.out.print ("Ingrese el segundo numero");
		num2 = teclado.nextFloat();
		if (num1>num2) {
			float suma, diferencia;
			suma = num1 + num2;
			diferencia = num1 - num2;
			System.out.print("La suma de los numeros es:");
			System.out.println(suma);
			System.out.print("la diferencia de los numeros es:");
			System.out.println(diferencia);
		}
		else {
			float producto, division;
			producto= num1 * num2 ;
			division = num1 / num2 ;
			System.out.print("El producto de los numeros es :");
			System.out.println(producto);
			System.out.print("La division de los numeros es:");
			System.out.println(division);
			
		}
		
	}

}
