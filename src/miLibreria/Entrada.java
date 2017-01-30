package miLibreria;

import java.util.Scanner;

public class Entrada {

	Scanner entrada = new Scanner(System.in);

	public int obtenerEntero(String msg) {
		String teclado;
		int numero = 0;
		boolean correcto = false;
		do {
			try {
				System.out.println(msg);
				teclado = entrada.nextLine();

				numero = Integer.parseInt(teclado);

				correcto = true;
			} catch (Exception e) {
				System.out.println("debes de introducir un numero");

			}
		} while (!correcto);
		return numero;
	}

	public float obtenerFloat(String msg) {
		float numero = 0;
		String teclado;
		boolean correcto = false;

		do {
			try {
				System.out.println(msg);
				teclado = entrada.nextLine();

				numero = Float.parseFloat(teclado);

				correcto = true;
			} catch (Exception e) {
				System.out.println("debes de introducir un numero con decimales pe. 0.0");
			}
		} while (!correcto);
		return numero;

	}

	public String obtenerString(String msg) {

		String teclado;
		System.out.println(msg);
		teclado = entrada.nextLine();

		return teclado;

	}
	public char obtenerChar(String msg) {
		String teclado;
		char letra='a';
		System.out.println(msg);
		teclado = entrada.nextLine();
		
		
		letra = teclado.charAt(0);

		return letra;
	}

}
