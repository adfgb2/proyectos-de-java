import java.util.Scanner;

public class sumaProducto {
	public static void main ( String [] ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,num4,suma,producto;
		System.out.print("ingrese primer valor:");
		num1= teclado.nextInt();
		System.out.print("ingrese segundo valor:");
		num2 = teclado.nextInt();
		System.out.print("ingrese tercer valor:");
		num3 = teclado.nextInt();
		System.out.print("ingrese cuarto valor:");
		num4= teclado.nextInt();
		suma= num1 + num2;
		producto= num3 * num4;
		System.out.print("La suma del primer y segundo valor es:");
		System.out.println(suma);
		System.out.print("El producto del tercer y cuarto valor es:");
		System.out.println(producto);
	}
	

}
