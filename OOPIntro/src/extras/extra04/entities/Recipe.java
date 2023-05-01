package extras.extra04.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
	crea métodos para agregar nuevas recetas a la lista, para buscar una
	receta por nombre y para obtener la lista de recetas que se pueden
	preparar con los ingredientes disponibles en la cocina.
*/
public class Recipe {
	
	private static final String LOOP_ENDER = "F";
	
	Scanner scan = new Scanner(System.in);
	
	private String recipeName;
	private HashMap<Ingredient, Double> ingredients;
	private ArrayList<Step> steps;
	
	public Recipe() {
		
		this.ingredients = new HashMap<>();
		this.steps = new ArrayList<>();
		
		String ingredientName;
		String description;
		double quantity;
		int index = 1;
		
		System.out.print("Indique el nombre de la recipe: ");
		this.recipeName = scan.nextLine();
		
		System.out.println("Indique, uno a uno, los ingredientes necesarios para su preparación.");
		System.out.println("Ingrese \"F\" para finalizar.");
		System.out.print("Primer ingrediente: ");
		ingredientName = scan.nextLine();
		
		while (!ingredientName.equalsIgnoreCase(Recipe.LOOP_ENDER)) {
			System.out.print("Indique la cantidad requerida: ");
			quantity = scan.nextDouble(); scan.nextLine();

			this.ingredients.put(new Ingredient(ingredientName), quantity);
			
			System.out.print("Siguiente ingrediente: ");
			ingredientName = scan.nextLine();
		}
		
		if (this.ingredients.size() > 0) {
			System.out.println("Indique los pasos a seguir para la preparación.");
			System.out.println("Ingrese \"F\" para finalizar.");
			description = scan.nextLine();
			
			while (!description.equalsIgnoreCase(Recipe.LOOP_ENDER)) {
				this.steps.add(new Step(index, description));
				index++;
				
				System.out.print("Siguiente paso: ");
				description = scan.nextLine();
			}
		}
	}

	public Recipe(String recipeName, HashMap<Ingredient, Double> ingredients, ArrayList<Step> steps) {
		this.recipeName = recipeName;
		this.ingredients = ingredients;
		this.steps = steps;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public ArrayList<Step> getSteps() {
		return steps;
	}

	public void setSteps(ArrayList<Step> steps) {
		this.steps = steps;
	}

	public HashMap<Ingredient, Double> getIngredients() {
		return ingredients;
	}

	public void setIngredients(HashMap<Ingredient, Double> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Recipe{" + "recipeName=" + recipeName + ", ingredients=" + ingredients + ", steps=" + steps + '}';
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 17 * hash + Objects.hashCode(this.ingredients);
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
		final Recipe other = (Recipe) obj;
		return Objects.equals(this.ingredients, other.ingredients);
	}
}
