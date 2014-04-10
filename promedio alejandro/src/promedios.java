import java.util.Scanner;

public class promedios {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
	    int num1, num2 , num3 ;
	    System.out.print("Ingrese el primer numero:");
	    num1 = teclado.nextInt();
	    System.out.print("Ingrese el segundo numero:");
	    num2 = teclado.nextInt();
	    System.out.print("Ingrese el tercer numero:" );
	    num3 = teclado.nextInt();
	    int promedio;
	    promedio= (num1+ num2 + num3)/  3;
	    if (promedio>=7) {
	    	System.out.print("promocionado");
	    }
	    
	    		}

}
