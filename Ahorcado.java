import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner (System.in);
		
		do{
			System.out.println("Ingrese su operaci�n /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();
		}while(opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch (opcion){
		case 3: 
			resultado = a + b;
			System.out.println("La suma es "+ resultado);
		break;
		case 2: 
			resultado = a - b;
			System.out.println("La resta es "+ resultado);
		break;

		case 1:
			resultado = a * b;
                        System.out.println("La Multiplicacion es "+ resultado);
		break;
		case 4: resultado = a / b;
		System.out.println("La Division es "+ resultado);
		break;
                default: 
		System.out.println("OPCION INVALIDA");
				break;
		
		}

   }
}