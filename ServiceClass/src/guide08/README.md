#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 08: Clases de Servicio

<p>
	En esta guía comenzamos a implementar una arquitectura en capas, separando el estado de los objetos de la lógica de negocios necesarias para la realidad que se esté modelando.
</p>
<br />

## [Ejercicios](https://github.com/BlasAC/Backend_1/tree/master/ServiceClass/src/guide08/exercises)

<ol>
	<li>
    <p>
		  Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
    </p>
    <p>
      Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    </p>
    <ol type="a">
      <li>
        Método para crear cuenta pidiéndole los datos al usuario.
      </li>
      <li>
        Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
      </li>
      <li>
        Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
      </li>
      <li>
        Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
      </li>
      <li>
        Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
      </li>
      <li>
        Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
      </li>
    </ol>
	</li>
	<br />
  <li>
    <p>
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    </p>
    <ol type="a">
      <li>
        Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
      </li>
      <li> Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
      </li>
      <li>
        Método vaciarCafetera(): pone la cantidad de café actual en cero.
      </li>
      <li>
        Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
      </li>
    </ol>
  </li>
	<br />
  <li>
    <p>
      Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters. En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    </p>
    <ol type="a">
      <li>
        Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
      </li>
      <li>
        Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M u O. Si no es correcto se deberá mostrar un mensaje.
      </li>
      <li>
        Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
      </li>
    </ol>
    <p>
      A continuación, en la clase main hacer lo siguiente:
    </p>
    <ul>
      <li>
        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
      </li>
      <li>
        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
      </li>
    </ul>
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Extras](https://github.com/BlasAC/Backend_1/tree/master/ServiceClass/src/guide08/extras)

<ol>
  <li>
    <p>
      Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para instanciar el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
    </p>
    <ol type="a">
      <li>
        Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2) - 4 * a * c
      </li>
      <li>
        Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones reales distintas. Para que esto ocurra, el discriminante debe ser mayor que 0.
      </li>
      <li>
        Método tieneRaiz(): devuelve un booleano indicando si ambas soluciones son iguales. Para que esto ocurra, el discriminante debe ser igual que 0.
      </li>
      <li>
        Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones.
      </li>
      <li>
        Método obtenerRaiz(): llama a tieneRaiz(). Si este retorna true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
      </li>
      <li>
        Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
      </li>
      <p>
        Nota: Fórmula ecuación 2o grado: (-b ± √((b^2) - (4 * a * c))) / (2 * a) Solo varía el signo luego de -b
      </p>
    </ol>
  </li>
	<br />
  <li>
    <p>
      Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. En NIFService se dispondrá de los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Métodos getters y setters para el número de DNI y la letra.
      </li>
      <li>
        Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponda.
      </li>
      <li>
				Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula. Por ejemplo: 00395469-F). La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado será ser un número entre 0 y 22). El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:<br />
        <img src="https://user-images.githubusercontent.com/47120385/230516624-ed114771-df31-433b-a1da-7f07061d8d07.jpeg">
				<img src="https://user-images.githubusercontent.com/47120385/230516684-14106c45-e266-407b-846e-bc67e06c502a.jpeg">
			</li>
  	</li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## Clonar

- Opción 1: ejecutando el comando desde una carpeta vacía
```git
	git clone https://github.com/BlasAC/Backend_1.git
```
- Opción 2: especificando a qué carpeta enviar lo descargado
```git
	git clone https://github.com/BlasAC/Backend_1.git <ruta_directorio_destino>
```

<p align="right">(<a href="#readme-top">Subir</a>)</p>

WIP
