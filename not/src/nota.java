import java.util.Scanner;
public class nota {
	public static void main (String [] ar ) {
		Scanner teclado = new Scanner ( System.in);
		int aprobados, reprobados, f , nota;
		aprobados = 0;
		reprobados= 0;
		for (f = 1; f <=10 ; f++){
			System.out.print("Ingrese la nota:");
			nota = teclado.nextInt();
			if ( nota >= 7){
				aprobados = aprobados + 1;
				
			}
			else {
				reprobados = reprobados +1;
			}
		}
		System.out.print("cantidad de aprobados: ");
		System.out.println(aprobados );
		System.out.print("cantidad de reprobados: ");
		System.out.print(reprobados);
		
				
				
	}

}
