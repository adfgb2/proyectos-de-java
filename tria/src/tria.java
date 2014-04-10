import java.util.Scanner;
public class tria {
	public static void  main(String []ar){
		Scanner teclado = new Scanner (System.in);
		int n, lado1 , lado2, lado3, cant1,cant2,cant3,f;
	    cant1 =0;
	    cant2=0;
	    cant3= 0;
	    		
		System.out.print("Ingrese la cantidad de triangulos");
		n = teclado.nextInt();
		for (f= 1 ;f<= n; f++){
			System.out.print("Ingrese el lado 1:");
			lado1= teclado.nextInt();
			System.out.print("Ingrese el lado2:");
			lado2 = teclado.nextInt();
			System.out.print("Ingrese el lado3:");
			lado3 = teclado.nextInt();
			if ( lado1==lado2 && lado1 == lado3){
				System.out.println("Es un triangulo equilatero.");
				cant1=cant1 +1;
						
			}
			else {
				if(lado1==lado2 || lado1 ==lado3 || lado2== lado3){
					System.out.println("Es una triangulos isoceles.");
					cant2=cant2 +1 ;
					
				}
				else {
					cant3 =cant3 +1;
					System.out.println("Es un triangulo escaleno");
							
				}
			}
					
		}
		System.out.print("Cantidad de triangulos equilateros:");
		System.out.println(cant1);
		System.out.print("Cantidad de triangulos isoceles");
		System.out.println(cant2);
		System.out.print("Cantidad de triangulos escalenos:");
		System.out.println(cant3);
		if (cant1<cant2 && cant1 < cant3){
			System.out.print("Hay menor cantidad de triangulos equilateros");
		
	}
	else{
		if(cant2<cant3){
			System.out.print("Hay menor  cantidad  de triangulos isoceles");
			
		}
		else {
			System.out.print("Hay menor cantidad de triangulos escalenos");
			
		}
	}

}
}