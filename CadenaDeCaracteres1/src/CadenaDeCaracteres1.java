import java.util.Scanner;
public class CadenaDeCaracteres1 {
	public static void main (String []ar){
		Scanner teclado = new Scanner (System.in);
		String nombre1,nombre2;
		int edad1, edad2;
		System.out.print("Ingrese el nombre:");
		nombre1=teclado.next();
		System.out.print("Ingrese la edad:");
		edad1 = teclado.nextInt();
		System.out.print("Ingrese el nombre:");
		nombre2 = teclado.next();
		System.out.print ("Ingrese la edad:");
		edad2=teclado.nextInt();
		System.out.print("La edad de la persona mayor es:");
		if (edad1>edad2){
			System.out.print(nombre1);
			
		}else{
			System.out.print(nombre2);
		}
		
	}

}
