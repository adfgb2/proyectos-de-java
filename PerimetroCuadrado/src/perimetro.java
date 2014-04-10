import java.util.Scanner;

public class perimetro {
	public static void main(String [] ar) {
		Scanner teclado=new Scanner(System.in);
		int lado,perimetro;
		System.out.print("ingrese el lado del cuadrado:");
		lado=teclado.nextInt();
		perimetro=lado * 4;
		System.out.print("el perimetro del cuadrado es:");
		System.out.print(perimetro);
		
			
	}
	

}
