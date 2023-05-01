package extras.extra04;

import extras.extra04.entities.Kitchen;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
	crea métodos para agregar nuevas recetas a la lista, para buscar una
	receta por nombre y para obtener la lista de recetas que se pueden
	preparar con los ingredientes disponibles en la cocina.
*/
public class KitchenApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean stay = true;
		Kitchen k1 = new Kitchen();
		
		while (stay) {
			switch (menu()) {
				case 1: k1.showIngredientsInStock();
					break;
				case 2: k1.addIngredientToKitchen();
					break;
				case 3: k1.getAvailableRecipes();
					break;
				case 4: k1.showRecipes();
					break;
				case 5: k1.addRecipe();
					break;
				case 6: System.out.println("Saliendo.");
					stay = false;
					break;
				default:
					System.out.println("Opción incorrecta. Intente nuevamente.");
			}
		}
	}
	
	public static int menu() {
		System.out.printf("Elija una opción:\n"
				+ "1.- Ver ingredientes disponibles.\n"
				+ "2.- Agregar ingrediente.\n"
				+ "3.- Ver recetas que se puedan preparar con los ingredientes disponibles.\n"
				+ "4.- Ver todas las recetas.\n"
				+ "5.- Agregar receta.\n"
				+ "6.- Salir.\n");
		return scan.nextInt();
	}
}
