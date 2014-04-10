import java.util.Scanner;

public class promedioSuma {
	public static void main (String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,num4,suma,promedio;
		System.out.print("ingrese el primer numero: ");
		num1= teclado.nextInt();
		System.out.print("ingrese el segundo numero: ");
		num2= teclado.nextInt();
		System.out.print("ingrese el tercer numero: ");
		num3= teclado.nextInt();
		System.out.print("ingrese el cuarto numero: ");
		num4= teclado.nextInt();
		suma= num1 + num2 + num3 + num4;
		promedio= suma / 4;
		System.out.print("La suma de todos los valores es :");
		System.out.println(suma);
		System.out.print("El promedio de los valores es :");
		System.out.println(promedio);
		
	}
	

}
