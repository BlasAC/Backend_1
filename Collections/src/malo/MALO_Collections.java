package malo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class MALO_Collections {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		// Ejemplo de Lista
		ArrayList<Integer> numerosA = new ArrayList<>();
		int x = 20;
		numerosA.add(x);
		
		//Ejemlplo de Conjunto
		HashSet<Integer> numerosB = new HashSet<>();
		Integer y = 20;
		numerosB.add(y);
		
		//Ejemplo de Mapa
		HashMap<Integer, String> alumnos = new HashMap<>();
		int dni = 12345678;
		String nombre = "MaLeVo";
		alumnos.put(dni, nombre);
		
		System.out.println("\nnumerosA:");
		System.out.println(numerosA);
		System.out.println("numerosB:");
		System.out.println(numerosB);
		System.out.println("alumnos:");
		System.out.println(alumnos);
		
		//Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
		numerosA.add(2);
		numerosA.add(3);
		numerosA.add(5);
		numerosA.add(7);
		numerosA.add(11);
		
		numerosB.add(13);
		numerosB.add(17);
		numerosB.add(19);
		numerosB.add(23);
		numerosB.add(29);
		
		alumnos.put(11222333, "Blas");
		alumnos.put(44555666, "A. C.");
		alumnos.put(77888999, "Pepe");
		alumnos.put(33222111, "Lola");
		alumnos.put(66555444, "EGG");
		
		System.out.println("\nnumerosA:");
		System.out.println(numerosA);
		System.out.println("numerosB:");
		System.out.println(numerosB);
		System.out.println("alumnos:");
		System.out.println(alumnos);
		
		//Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de cada forma que aprendiste arriba.
		numerosA.remove(y);
		numerosA.remove(0);
		
		numerosB.remove(y);
		
		alumnos.remove(77888999);
		
		System.out.println("\nnumerosA:");
		System.out.println(numerosA);
		System.out.println("numerosB:");
		System.out.println(numerosB);
		System.out.println("alumnos:");
		System.out.println(alumnos);
	}
}
