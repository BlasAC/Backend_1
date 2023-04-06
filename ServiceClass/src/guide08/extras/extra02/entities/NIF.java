package guide08.extras.extra02.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
	Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.
*/
public class NIF {
	
	private long dni;
	private char key;

	public NIF(long dni, char key) {
		this.dni = dni;
		this.key = key;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getKey() {
		return key;
	}

	public void setKey(char key) {
		this.key = key;
	}
}
