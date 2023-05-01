package extras.extra04.entities;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Ingredient{" + "ingredientName=" + ingredientName + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return 59 * hash + Objects.hashCode(this.ingredientName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		final Ingredient other = (Ingredient) obj;
		return this.ingredientName.equals(other.ingredientName);
	}
}
