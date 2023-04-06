package guide08.exercises.exercise02.service;

import guide08.exercises.exercise02.entities.Cafetera;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>
	
	Crear clase CafeteraServicio en	el paquete Servicios con lo siguiente:
*/
public class CafeteraService {
	
	private Cafetera cafetera = new Cafetera();
	
	//a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
	public void llenarCafetera() {
		this.cafetera.setCapacidadActual(this.cafetera.getCapacidadMaxima());
	}
	
	//b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la
	//taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le
	//informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
	public void servirTaza(int taza) {
		
		if (taza <= this.cafetera.getCapacidadActual()) {
			System.out.println("Taza llena.");
			this.cafetera.setCapacidadActual(this.cafetera.getCapacidadActual() - taza);
		} else {
			System.out.printf("Se llenó la taza con %d\n", this.cafetera.getCapacidadActual());
			vaciarCafetera();
		}
	}
	
	//c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
	public void vaciarCafetera() {
		this.cafetera.setCapacidadActual(0);
	}
	
	//d) Método agregarCafe(int): se le pide al usuario una cantidad de café el método lo recibe y se añade a la cafetera la cantidad de café
	//indicada.
	public void agregarCafe(int cantidad) {
		
		if (cantidad <= this.cafetera.getCapacidadMaxima() - this.cafetera.getCapacidadActual()) {
			this.cafetera.setCapacidadActual(this.cafetera.getCapacidadActual() + cantidad);
		} else {
			this.cafetera.setCapacidadActual(this.cafetera.getCapacidadMaxima());
		}
	}

	@Override
	public String toString() {
		return "CafeteraService{" + "cafetera=" + cafetera + '}';
	}
}
