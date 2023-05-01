package exercise05.entities;

import java.util.Comparator;
import java.util.Objects;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
	usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
	conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
	si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
	los servicios en la clase correspondiente)
	Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
	cómo se ordena un conjunto.
	Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
	buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
	usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
	al usuario.
*/
public class Country {

	private String countryName;
	
	public Country(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country{" + "countryName=" + countryName + '}';
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 37 * hash + Objects.hashCode(this.countryName);
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
		final Country other = (Country) obj;
		return Objects.equals(this.countryName, other.countryName);
	}
	
	public static Comparator<Country> sortByCountryName = (Country c1, Country c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName());
}
