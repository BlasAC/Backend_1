package extras_extra.extra01.entities;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	Definir la clase Time, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
	constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
	además, los métodos getters y setters correspondientes.
*/
public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		//Una buena oportunidad para hacer "algo" con los setters
		if (minutes < 60) {
			this.minutes = minutes;
		} else {
			setHours(getHours() + minutes / 60);
			this.minutes = minutes % 60;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		//Idem comentario anterior
		if (seconds < 60) {
			this.seconds = seconds;
		} else {
			setMinutes(getMinutes() + seconds / 60);
			this.seconds = seconds % 60;
		}
	}

	@Override
	public String toString() {
		return "Tiempo{" + hours + ":" + minutes + ":" + seconds + '}';
	}
}
