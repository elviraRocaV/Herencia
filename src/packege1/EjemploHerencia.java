package packege1;
import miLibreria.Entrada;

public class EjemploHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entrada entrada = new Entrada();
		Cuadrado cuadrado;
		Triangulo triangulo;
		
		System.out.println("introduccion de los datos del Triangulo ");
		triangulo = new Triangulo(entrada.obtenerFloat("dame la base"), entrada.obtenerFloat("dame la altura"));
		
		System.out.println(triangulo.toString());
		
		System.out.println("introduccion de los datos del Cuadrado ");
		cuadrado = new Cuadrado(entrada.obtenerFloat("dame la longitud del lado"));
		
		System.out.println(cuadrado.toString());
		System.out.println();
		System.out.println(triangulo.toString());

	}

}
