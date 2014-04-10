import java.util.Scanner;
public class iguales {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3,suma,producto ;
		System.out.print("Ingrese el primer numero");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo numer");
		num2 =teclado.nextInt();
		System.out.print("Ingrese el tercer numero");
		num3 = teclado.nextInt();
		suma = num1 + num2;
		producto = suma * num3;
		if (num1==num2 && num1==num3){
			System.out.print("La suma del primer con el segundo es:");
			System.out.println(suma);
			System.out.print("La suma multiplicado por el tercero es :");
			System.out.println(producto);
			
		}
				
	}

}
