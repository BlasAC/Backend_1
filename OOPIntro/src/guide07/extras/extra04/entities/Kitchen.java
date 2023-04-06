package guide07.extras.extra04.entities;

import java.util.ArrayList;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
	crea métodos para agregar nuevas recetas a la lista, para buscar una
	receta por nombre y para obtener la lista de recetas que se pueden
	preparar con los ingredientes disponibles en la cocina.
*/
public class Kitchen {
	
	private ArrayList<Ingredient> ingredientsInStock;
	private ArrayList<Recipe> recipes;

	public Kitchen() {}
	
	public ArrayList<Ingredient> getIngredientsInStock() {
		return ingredientsInStock;
	}

	public void setIngredientsInStock(ArrayList<Ingredient> ingredientsInStock) {
		this.ingredientsInStock = ingredientsInStock;
	}

	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<Recipe> recipes) {
		this.recipes = recipes;
	}
}
