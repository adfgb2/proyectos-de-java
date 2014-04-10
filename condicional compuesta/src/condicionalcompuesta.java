import java.util.Scanner;

public class condicionalcompuesta {
	public static void main (String [] ar ) {
		Scanner teclado=new Scanner (System.in);
		int num1,num2;
		System.out.print("ingrese primer valor:");
		num1=teclado.nextInt();
		System.out.print("ingrese segundo valor:");
		num2=teclado.nextInt();
		if (num1>num2){
			System.out.print(num1);
		}
			else { 
				System.out.print(num2);
				
			}
		}
		
		
		
	}


