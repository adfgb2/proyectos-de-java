import java.util.Scanner;
public class mayor1000 {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int cantidad, valor, n , f ;
		cantidad = 0;
		System.out.print("Cuantos valores ingresar: ");
		n = teclado.nextInt();
		for (f=1 ; f <=n; f++){
			System.out.print("Ingrese el valor");
			valor= teclado.nextInt();
			if (valor >= 1000){
				cantidad = cantidad+1;
			}
			
			
			
			
		}
		System.out.print("La cantidad de numeros ingresados mayores o iguales a 1000 +");
		System.out.println(cantidad);
		
		
				
	}

}
