package ud10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerarNumero generarNumero = new GenerarNumero();
		System.out.println(generarNumero.generarNumero());

		while (true) {

			try {
				System.out.println("Introduce un  numero");
				int numero = sc.nextInt();
				// resuelve codigo con excepcion
				numero = generarNumero.comprobarNumero(numero);
				break;
			} catch (MiException e) {
				System.out.println(e.getMessage());

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				generarNumero.setIntentos(1);
				sc.next();

			}
		}

		System.out.println("");
		System.out.println("Fallos Totales " + generarNumero.getIntentos());

	}

}
