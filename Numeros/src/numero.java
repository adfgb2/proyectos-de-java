import java.util.Scanner;

public class numero {
	public static void main (String [] ar) {
		Scanner teclado =new Scanner (System.in);
		int num1,num2,producto,suma;
		System.out.print("ingrese primer valor:");
		num1=teclado.nextInt();
		System.out.print("ingrese segundo valor:");
		num2=teclado.nextInt();
		suma=num1 + num2;
		producto= num1 * num2;
		System.out.print("la suma de los valores es:");
		System.out.println(suma);
		System.out.print("el producto de los valores es:");
		System.out.println(producto);
		
				
		
	}
	

}
