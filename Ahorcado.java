import java.util.Scanner;
import java.lang.Math;	

public class Ahorcado {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		do{
			System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir/n 5 para potencia, de a elevado a la b /n 6 para raiz /n");
			opcion = teclado.next();
		}while(opcion < 1 && opcion > 5);
		System.out.println("Ingrese el primer numero");
			a = teclado.next();
		System.out.println("Ingrese el segundo numero");
			b = teclado.next();

		switch (opcion){
		case 3: 
			resultado = a + b;
		break;
		case 2: 
			resultado = a - b;
		break;
		case 1:
			resultado = a * b;
		break;
		case 4: 
			resultado = a / b;
		break;
		case 5: 		//agrego potencia y raiz
			resultado = Math.pow(a, b); 
		break;
		case 6: 
			resultado = Math.sqrt(x));

	              default: 
		System.out.println("OPCION INVALIDA");
				break;
		
		}

}