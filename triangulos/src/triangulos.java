import java.util.Scanner;
public class triangulos {
	public static void main (String [] ar) {
		Scanner teclado = new Scanner (System.in);
		int base, altura,cantidad, n , f , superficie;
		cantidad= 0;
		System.out.print("Ingrese la cantidad de triangulos:");
		n = teclado.nextInt();
		for (f = 1 ; f<= n;f++){
			System.out.print("Ingrese la altura del triangulo:");
			altura =teclado.nextInt();
			System.out.print("Ingrese la base del triangulo:");
			base = teclado.nextInt();
			superficie= (base*altura)/2;
			System.out.print("La superficie del triangulo es: ");
			System.out.println(superficie);
			if (superficie >  12){
				cantidad = cantidad +1;
				
			}
			
			
					
		}
		System.out.print("La cantidad de triangulos con superficie mayor a 12 son :");
		System.out.println(cantidad);
		
		
		
	
		
	}

}
