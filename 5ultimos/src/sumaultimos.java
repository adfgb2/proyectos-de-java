import java.util.Scanner;
public class sumaultimos {
	public static void main(String [] ar){
		Scanner teclado= new Scanner(System.in);
		int num, suma,f	;
		suma = 0;
		for(f = 1; f<= 10 ;f++){
			System.out.print("Ingrese un valor");
			num= teclado.nextInt();
			if (f>5){ 
				suma = suma + num;
			}
				
		}
		System.out.print("La suma de los 5 ultimos valores es: ");
		System.out.println( suma);
		
	}

}
