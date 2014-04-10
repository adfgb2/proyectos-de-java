import java.util.Scanner;

public class digitos {
	public static void main (String [] ar ){
		Scanner teclado = new Scanner (System.in);
		int num;
		System.out.print("ingresar el numero");
		num = teclado.nextInt();
        if ( num<10) {
        	System.out.println("tiene un digito");
        	}
       
        else {
        	System.out.println("tiene dos digitos");
        	
        }
	}

}
