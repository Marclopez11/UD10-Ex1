package ud10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleatorio;
		numeroAleatorio = (int) Math.floor(Math.random() * (0 - 500 + 1) + 500);
		System.out.println(numeroAleatorio);
		boolean acertar = false;
		int intentos = 0;

		for (int i = 1; !acertar; i++) {

			
			intentos++;
		
		try {

			System.out.println("Introduce un  numero");
			int numero = sc.nextInt();
			// resuelve codigo con excepcion
			
			

			if (numeroAleatorio > numero) {
				throw new MiException(111);
			} else if (numeroAleatorio < numero) {
				throw new MiException(222);
			} else if (numeroAleatorio == numero) {
				acertar = true;
				intentos--;
				throw new MiException(333);
				
			}

		} catch (MiException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		}
		
		System.out.println("");
		System.out.println("Fallos Totales "+intentos);
		

	}

}
