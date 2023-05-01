package extras.extra04.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
	crea métodos para agregar nuevas recetas a la lista, para buscar una
	receta por nombre y para obtener la lista de recetas que se pueden
	preparar con los ingredientes disponibles en la cocina.
*/
public class Kitchen {
	
	static Scanner scan = new Scanner(System.in);
	
	private final HashMap<Ingredient, Double> ingredientsInStock;
	private ArrayList<Recipe> recipes;

	public void addIngredientToKitchen() {
		
		Ingredient ingredient;
		double quantity;
		
		showIngredientsInStock();
		System.out.printf("\nIndique el nombre del ingrediente a agregar: ");
		ingredient = new Ingredient(scan.nextLine());
		
		System.out.print("Indique la cantidad a agregar: ");
		quantity = scan.nextDouble(); scan.nextLine();
		if (ingredientsInStock.containsKey(ingredient)) {
			ingredientsInStock.put(ingredient, ingredientsInStock.get(ingredient) + quantity);
		} else {
			ingredientsInStock.put(ingredient, quantity);
		}
	}
	
	public void addRecipe() {
		this.recipes.add(new Recipe());
	}
	
	public void showRecipes() {
		
		if (this.recipes != null) {
			for (Recipe recipe : recipes) {
				System.out.println(recipe);
			}
		} else {
			System.out.println("No hay recipes en la lista.");
		}
	}
	
	public void getAvailableRecipes() {
		
		boolean exist;
		
		for (int i = 0; i < this.recipes.size(); i++) {
			
			exist = this.ingredientsInStock.keySet().containsAll(this.recipes.get(i).getIngredients().keySet());
			
			if (exist) {
				System.out.println(this.recipes.get(i));
			}
		}
	}
	
	public Kitchen() {
		this.ingredientsInStock = new HashMap<>();
		this.recipes = new ArrayList<>();
		
		ingredientsInStock.put(new Ingredient("Fideos"), 6.0);
		ingredientsInStock.put(new Ingredient("Banana"), 10.0);
		ingredientsInStock.put(new Ingredient("Arroz"), 3.0);
	}
	
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}
	
	public void showIngredientsInStock() {
		if (ingredientsInStock.size() > 0) {
			for (Map.Entry<Ingredient, Double> pair : ingredientsInStock.entrySet()) {
				System.out.printf("Nombre: %-15s\tStock: %.2f\n", pair.getKey().getIngredientName(), pair.getValue());
			}
		} else {
			System.out.println("La cocina está vacía.");
		}
	}

	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}

	@Override
	public String toString() {
		return "Kitchen{" + "ingredientsInStock=" + ingredientsInStock + ", recipes=" + recipes + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 19 * hash + Objects.hashCode(this.ingredientsInStock);
		hash = 19 * hash + Objects.hashCode(this.recipes);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Kitchen other = (Kitchen) obj;
		if (!Objects.equals(this.ingredientsInStock, other.ingredientsInStock)) {
			return false;
		}
		return Objects.equals(this.recipes, other.recipes);
	}
}
