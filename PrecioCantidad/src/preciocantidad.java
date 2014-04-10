import java.util.Scanner;

public class preciocantidad {
	public static void main(String [] ar ) {
		Scanner teclado=new Scanner (System.in);
		int cantidad;
		float precio;
		float total;
		System.out.print("ingrese el precio del producto: ");
		precio= teclado.nextFloat();
		System.out.print("ingrese la cantidad del productos: ");
		cantidad= teclado.nextInt();
		total= precio* cantidad;
		System.out.print("El total a pagar es: ");
		System.out.println(total);
		
	}

}
