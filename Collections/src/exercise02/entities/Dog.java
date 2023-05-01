package exercise02.entities;

import java.util.Comparator;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
*/
public class Dog {

	private String name;
	
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog{" + "name=" + name + '}';
	}
	
	public static Comparator<Dog> compareNames = (Dog d1, Dog d2) -> (d1.getName().compareTo(d2.getName()));
}