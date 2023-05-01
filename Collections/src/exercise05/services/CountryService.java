package exercise05.services;

import exercise05.entities.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

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
public class CountryService {

	public HashSet<Country> loadCountries() {
		Scanner scan = new Scanner(System.in);
		
		HashSet<Country> countries = new HashSet<>();
		
		String countryName;
		String option = "s";
		
		while (option.equalsIgnoreCase("s")) {
			System.out.print("Nombre del país: ");
			countryName = scan.nextLine();
			
			countries.add(new Country(countryName));
			
			System.out.print("Desea ingresar otro país? S/N: ");
			option = scan.nextLine();
		}
		
		showCountries(countries);
		
		return countries;
	}
	
	public void showCountries(HashSet<Country> countries) {
		System.out.println("\nPaíses guardados: ");
		countries.forEach(System.out::println);
	}
	
	public void sortCountries(HashSet<Country> countries) {
		ArrayList<Country> countriesList = new ArrayList<>(countries);
		countriesList.sort(Country.sortByCountryName);
		countriesList.forEach(System.out::println);
	}
	
	public void removeCountry(HashSet<Country> countries) {
		Scanner scan = new Scanner(System.in);
		Iterator<Country> it = countries.iterator();
		String countryName;
		boolean found = false;
		
		System.out.print("Qué país desea eliminar (Putin un poroto)?: ");
		countryName = scan.nextLine();
		
		while (it.hasNext()) {
			if (it.next().getCountryName().equalsIgnoreCase(countryName)) {
				found = true;
				it.remove();
			}
		}
		
		if (!found) {
			System.out.println("El país elegido no se encontraba en la lista.\n");
		}
		
		showCountries(countries);
	}
}
