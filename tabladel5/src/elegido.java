import java.util.Scanner;
public class elegido {
	public static void main (String [] ar ) {
		Scanner teclado = new Scanner (System.in);
		int f, valor;
		System.out.print("Ingrese un valor entre 1 y 10 :");
		valor = teclado.nextInt();
		for (f= valor; f<= valor* 12; f = valor + f){ 
			System.out.print (f);
			System.out.print("-");
			
			
		}
		
	}

}
