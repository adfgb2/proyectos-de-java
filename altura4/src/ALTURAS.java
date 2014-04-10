import java.util.Scanner;

public class ALTURAS {
	public static void main( String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int x,n;
		float altura , suma, promedio;
		System.out.print("Cuantas personas hay :");
		n = teclado.nextInt();
		x = 1; 
	    suma = 0;
	    while (x <= n){
	    	System.out.print("Ingrese la altura:");
	    	altura = teclado.nextFloat();
	    	suma = suma + altura;
	    	x = x + 1 ;
	    			
	    }
	    promedio = suma / n;
	    System.out.print("altura promedio:");
	    System.out.print (promedio);
				
				
		
	}
	

}
