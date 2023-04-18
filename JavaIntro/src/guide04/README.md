#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 04: Subprogramas en Java

<p>
  En esta guía aprenderemos a implementar funciones y subprocesos en Java (métodos), a realizar llamados a los mismos y a definir y manejar los distintos tipos de retorno.
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
    <a href="#clonar">Clonar</a>
  </li>
</ul>
<br />

## [Manos a la obra!](https://github.com/BlasAC/Backend_1/tree/master/JavaIntro/src/guide04/malo)
<ol start="11">
  <li>
    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.<br />
    <tt>a  e  i  o  u</tt><br />
    <tt>@  #  $  %  *</tt><br />
    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación.<br />
    Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.<br />
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
  </li>
  <br />
  <li>
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Ejercicios](https://github.com/BlasAC/Backend_1/tree/master/JavaIntro/src/guide04/exercises)
<ol>
	<li>
		Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
	</li>
	<br />
  <li>
		Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
	</li>
	<br />
  <li>
		Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas es:<br />
      i. * 0.86 libras es un 1 €<br />
     ii. * 1.28611 $ es un 1 €<br />
    iii. * 129.852 yenes es un 1 €
	</li>
	<br />
  <li>
		Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.<br />
    ¿Qué son los números primos?<br />
    Básicamente, un número primo es un número natural que tiene solo dos divisores o factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por uno y por el mismo número.<br />
    El primer número primo es 2, y hay 25 números primos entre 1 y 100. Ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
	</li>
	<br />
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
