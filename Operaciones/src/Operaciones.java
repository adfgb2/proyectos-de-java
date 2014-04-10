import java.util.Scanner;
public class Operaciones {
	private Scanner teclado;
	int valor1, valor2;
	public void inicializar (){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese primer valor:");
		valor1 = teclado.nextInt();
		System.out.print("ingrese segundo valor:");
		valor2= teclado.nextInt();
		
	}
	public void sumar(){
	int suma;
	suma=valor1+valor2;
	System.out.println
	("La suma es:"+suma);
	}
    public void restar(){
    	int restar;
    	restar = valor1-valor2;
    	System.out.println("La resta es :"+restar);
    }
    public void multiplicar(){
    	int mult;
    	
    mult=valor1*valor2;
    	System.out.println("La multiplicacion es:"+mult);
    
    }
    public void division(){
    	float div;
    	if (valor1 > valor2){
        div= valor1/valor2;}
    	else {
    		div= valor2/valor1;
    	}
        System.out.println("La division es:"+div);
    }
    public static void main (String []ar){
    	Operaciones opera;
    	opera=new Operaciones();
    	opera.inicializar();
    	opera.sumar();
    	opera.restar();
    	opera.multiplicar();
    	opera.division();
    }
    

}
