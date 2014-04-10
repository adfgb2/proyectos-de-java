import java.util.Scanner;

public class multiplos {
	public static void main (String [] ar) {
		Scanner teclado= new Scanner (System.in);
		int mul3, mul5, f, valor;
		mul3 = 0;
		mul5 = 0;
		for (f=1; f<=10; f++) {
			System.out.print("Ingrese el valor");
			valor = teclado.nextInt();
			if (valor%3 == 0){
				mul3 = mul3+ 1;
					}
			if(valor%5 == 0){
				mul5 = mul5 + 1;
						
			}
			
			
		}
		System.out.print("La cantidad de numeros multiplos de 3 son:");
		System.out.println(mul3);
		System.out.print("La cantidade numeros multiplos de 5 son:");
		System.out.println(mul5);
				
			
		
	}

}
