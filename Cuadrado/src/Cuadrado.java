import java.util.Scanner;
public class Cuadrado {
	private Scanner teclado;
	int lado;
	
	public void inicializar(){
		teclado = new Scanner (System.in);
		System.out.print("Ingrese valor de lado:");
		lado = teclado.nextInt();
	}
	public void imprimirPerimetro(){
		int perimetro;
		perimetro = lado*4;
		System.out.println("El perimetro es:"+perimetro);
	}
	public void imprimirSuperficie() {
		int superficie = lado*lado;
		System.out.print("La superficie es :"+superficie);
	}
	
	public static void main (String []ar ) {
		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.imprimirPerimetro();
		cuadrado1.imprimirSuperficie();
	}

}
