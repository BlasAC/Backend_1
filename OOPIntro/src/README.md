#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 07: Introducción a Objetos

<p>
	Primeros pasos en el mundo del paradigma de la Programación Orientada a Objetos: definición y beneficios de su uso, definición de Clase y Objeto.
</p>
<p>
  Además, ahondando en el concepto de Clase, se verá: comportamiento, estado, elementos de la misma, abstracción (concepto) y encapsulamiento (getters y setters).
</p>
<br />

## Índice
<ul>
	<li>
    <a href="#manos-a-la-obra">Manos a la obra!</a>
  </li>
	<li>
    <a href="#ejercicios">Ejercicios</a>
  </li>
  <li>
    <a href="#extras">Extras</a>
  </li>
	<li>
    <a href="#clonar">Clonar</a>
  </li>
</ul>
<br />

## [Manos a la obra!](https://github.com/BlasAC/Backend_1/tree/master/OOPIntro/src/malo)

<ul>
  <li>
    Es tu turno, crea tu propio proyecto con la clase Persona.
  </li>
  <br />
  <li>
		Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos que creas pertinentes.
	</li>
	<br />
  <li>
		Volveremos a usar la clase Persona y vamos a crear objetos en tu Main utilizando los constructores.
	</li>
	<br />
  <li>
		Continuaremos con nuestra clase Persona y vamos a primero crear los getter y setter y después invocarlos desde el Main con alguno de los objetos que instanciaste.
	</li>
</ul>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Ejercicios](https://github.com/BlasAC/Backend_1/tree/master/OOPIntro/src/exercises)

<ol>
	<li>
    <p>
      Crear una clase llamada Libro que contenga los siguientes atributos:
    </p>
    <p>
      ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
    </p>
	</li>
	<br />
  <li>
    <p>
      Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método constructor que inicialice el radio pasado como parámetro.
      </li>
      <li>
        Métodos get y set para el atributo radio de la clase Circunferencia.
      </li>
      <li>
        Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
      </li>
      <li>
        Método area(): para calcular el área de la circunferencia (Area = π * radio^2).
      </li>
      <li>
        Método perimetro(): para calcular el perímetro (Perimetro = 2 * π * radio).
      </li>
    </ol>
  </li>
	<br />
  <li>
    <p>
      Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método constructor con todos los atributos pasados por parámetro.
      </li>
      <li>
        Método constructor sin los atributos pasados por parámetro.
      </li>
      <li>
        Métodos get y set.
      </li>
      <li>
        Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
      </li>
      <li>
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
      </li>
      <li>
        Método restar(): calcular la resta de los números y devolver el resultado al main
      </li>
      <li>
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main.
      </li>  
      <li>
        Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
      </li>
    </ol>
  </li>
  <br />
  <li>
    <p>
      Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
    </p>
    <p>
      Superficie = base * altura / Perímetro = (base + altura) * 2.
    </p>
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Extras](https://github.com/BlasAC/Backend_1/tree/master/OOPIntro/src/extras)

<ol>
  <li>
      Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
  </li>
	<br />
  <li>
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link: http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
  </li>
	<br />
  <li>
    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
  </li>
	<br />
  <li>
    Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina.
  </li>
	<br />
  <li>
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
  </li>
	<br />
  <li>
    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
  </li>
	<br />
  <li>
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## Clonar

- Ejecutando este comando desde el bash se creará, en el directorio en que estemos ubicados, una carpeta llamada "Backend_1" y dentro de la misma se descargará todo el contenido del repositorio.
```git
	git clone https://github.com/BlasAC/Backend_1.git
```
- Alternativamente, se puede especificar un nombre para la carpeta incluyendo "nuevoNombre" luego del link
```git
	git clone https://github.com/BlasAC/Backend_1.git <nuevoNombre>
```

<p align="right">(<a href="#readme-top">Subir</a>)</p>

WIP
