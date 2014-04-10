import java.util.Scanner;
public class triangulo {
	private Scanner teclado;
	private int lado1,lado2,lado3;
	
	public void inicializar (){
		teclado =new Scanner (System.in);
		System.out.print("Medida del primer lado:");
		lado1 = teclado.nextInt();
		System.out.print("Medida del segundo lado:");
		lado2 = teclado.nextInt();
		System.out.print("Medida del tercer lado:");
		lado3 = teclado.nextInt();
	}
	
	public void ladoMayor(){
		System.out.print("Lado mayor:");
		if (lado1>lado2 && lado1>lado3){
			System.out.println(lado1);
	}else {
		if (lado2>lado3){
			System.out.println(lado2);
		}else{
			System.out.println(lado3);
			
		}
	}

  }
	
	public void esEquilatero() {
		if (lado1==lado2 && lado1 == lado3){
			System.out.print("Es un triangulo equilatero");
	}else{
		System.out.print("No es un triangulo equilatero");
		
	}
 }
	public static void main (String [] ar) {
		triangulo triangulo1 = new triangulo();
		triangulo1.inicializar ();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();
		
			
		
		
	}
}

