package guide07.extras.extra04.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
	crea métodos para agregar nuevas recetas a la lista, para buscar una
	receta por nombre y para obtener la lista de recetas que se pueden
	preparar con los ingredientes disponibles en la cocina.
*/
public class Ingredient {
	
	private String ingredientName;

	public Ingredient(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}
