import java.util.Scanner;
public class negaPosiNul {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int num;
		System.out.print("ingrese el valor");
		num = teclado.nextInt();
		if (num==0) {
			System.out.print("Se ha ingresado el cero");
		}
		else {
			if(num>0){
				System.out.print("Es un valor positivo");
			}
			else {
				System.out.print("Es un valor negativo");
			}
		}
			
		}

}
