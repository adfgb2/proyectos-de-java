import java.util.Scanner;
public class CadenaDeCaracteres4 {
	public static void main (String []ar){
		Scanner teclado = new Scanner (System.in);
		String apellido1, apellido2;
		System.out.print("Ingrese el primer apellido:");
		apellido1 = teclado.next();
		System.out.print("Ingrese el segundo apellido");
		apellido2 = teclado.next();
		if (apellido1.equalsIgnoreCase(apellido2)){
			System.out.print ("Los apellido son iguales.");
		}else {
			System.out.print("Los apellido son diferentes.");;
		}
	}

}
