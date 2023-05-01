package exercise06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
	productos que venderemos y el precio que tendrán. Además, se necesita que la 
	aplicación cuente con las funciones básicas. 
	Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
	eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
	Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
	Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
public class Exercise06 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
			Este ejercicio lo hice durante una clase particular en la que nos enfocamos en repasar Collections
			por lo que decidí no complicarla con entidades ni servicio (el enunciado tampoco ayuda demasiado...).
			Y mucho menos un menú. Todas las pruebas se pueden hacer acomodando el orden de los llamados.
		*/
		
		HashMap<String, Double> products = new HashMap<>();
		
		addProducts(products);
		changePrices(products);
		deleteProducts(products);
		showProducts(products);
	}
	
	public static void addProducts(HashMap<String, Double> products) {
		
		String option = "s";
		String productName;
		double value;
		
		while (option.equalsIgnoreCase("s")) {
			System.out.print("Indique el nombre del producto: ");
			productName = scan.nextLine();
			System.out.print("Indique el valor del mismo: ");
			value = scan.nextDouble(); scan.nextLine();
			
			products.put(productName, value);
			
			System.out.print("Desea agregar otro producto? (S/N): ");
			option = scan.nextLine().substring(0, 1);
		}
	}
	
	public static void changePrices(HashMap<String, Double> products) {
		
		String option = "s";
		String productName;
		double productPrice;
		
		while (option.equalsIgnoreCase("s")) {
			System.out.println("A qué producto desea cambiarle el importe?");
			showProducts(products);
			productName = scan.nextLine();
			System.out.print("Indique el nuevo precio: ");
			productPrice = scan.nextDouble(); scan.nextLine();

			if (products.containsKey(productName)) {
				products.put(productName, productPrice);
			} else {
				System.out.println("El producto elegido no existe.");
			}
			
			System.out.print("Desea cambiar el precio de otro producto? (S/N): ");
			option = scan.nextLine().substring(0, 1);
		}
	}
	
	public static void deleteProducts(HashMap<String, Double> products) {
		
		String option = "s";
		String productName;
		
		while (option.equalsIgnoreCase("s")) {
			System.out.println("Qué producto desea eliminar?");
			showProducts(products);
			productName = scan.nextLine();

			if (products.containsKey(productName)) {
				products.remove(productName);
			} else {
				System.out.println("El producto elegido no existe.");
			}
			
			System.out.print("Desea eliminar otro producto? (S/N): ");
			option = scan.nextLine().substring(0, 1);
		}
	}
	
	public static void showProducts(HashMap<String, Double> products) {
		//for-loop "mejorado".
//		for (Map.Entry<String, Double> entry : products.entrySet()) {
//			System.out.printf("%s -> $%.2f\n", entry.getKey(), entry.getValue());
//		}

		//Esta forma es, a mi parecer, muchísimo más clara.
		products.entrySet().forEach((entry) -> {
			System.out.printf("%s -> $%.2f\n", entry.getKey(), entry.getValue());
		});
	}
}
