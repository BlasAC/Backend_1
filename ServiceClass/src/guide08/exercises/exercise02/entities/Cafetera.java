package guide08.exercises.exercise02.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de
	café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con
	parámetros así como setters y getters.
*/
public class Cafetera {
	
	private int
			capacidadMaxima,
			capacidadActual;

	public Cafetera() {
		this.capacidadActual = 0;
		this.capacidadMaxima = 100;
	}

	public Cafetera(int capacidadMaxima, int capacidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
	}
}
