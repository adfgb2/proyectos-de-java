import java.util.Scanner;
public class hierro {
	public static void main (String [] ar ) {
		Scanner teclado = new Scanner (System.in);
		int x, n , cantidad;
	
		float largo;
		x=1;
		cantidad = 0;
		System.out.print("Ingrese cuantas piezas procesará :");
		n = teclado.nextInt();
		while (x <= n){
			System.out.print("Ingrese la medida de la pieza");
			largo = teclado.nextFloat();
			if (largo >= 1.20 && largo <= 1.30 ){ 
				cantidad = cantidad + 1;
				
			}
			x=x+1;
			
		}
		System.out.print("La cantidad de piezas aptas son :");
		System.out.print (cantidad);
		
		
				
	
		
		
	}

}
