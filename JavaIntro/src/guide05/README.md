#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 05: Vectores y Matrices

<p>
	En esta guía aprenderemos a declarar, instanciar, inicializar y recorrer (ya sea para llenar, mostrar, buscar, ordenar, etc.) vectores y matrices en Java.
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

## [Manos a la obra!](https://github.com/BlasAC/Backend_1/tree/master/JavaIntro/src/guide05/malo)

<ol start="13">
  <li>
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
  </li>
  <br />
  <li>
    Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo.
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Ejercicios](https://github.com/BlasAC/Backend_1/tree/master/JavaIntro/src/guide05/exercises)

<ol>
	<li>
		Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
	</li>
	<br />
  <li>
    Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido.
  </li>
	<br />
  <li>
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
  </li>
	<br />
  <li>
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).<br />
    <img src="https://user-images.githubusercontent.com/47120385/230464099-7c0d802f-818a-48a2-92c6-0f4ff7eb3c57.jpeg"/>
  </li>
	<br />
  <li>
    Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).<br />
    <img src="https://user-images.githubusercontent.com/47120385/230465319-4724d726-4300-4c4c-8110-27470ad0dc42.jpeg"/>
  </li>
	<br />
  <li>
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.<br />
    <img src="https://th.bing.com/th/id/R.62faf15a1c0fe30e1a64b8530811214f?rik=LRG%2f3I8VJoi9vg&riu=http%3a%2f%2fwww.101computing.net%2fwp%2fwp-content%2fuploads%2fmagic-square-3x3.png&ehk=EjyK9XJIic6Pj2E5HkO5vW7drfQ%2fjZnuU4cvI%2b9tltM%3d&risl=&pid=ImgRaw&r=0" width="200px"/>
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Extras](https://github.com/BlasAC/Backend_1/tree/master/JavaIntro/src/guide05/extras)

<ol>
  <li>
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
  </li>
	<br />
  <li>
    Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
  </li>
	<br />
  <li>
    Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
  </li>
	<br />
  <li>
    Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:<br />
Primer trabajo práctico evaluativo 10%<br />
Segundo trabajo práctico evaluativo 15%<br />
Primer Integrador 25%<br />
Segundo integrador 50%<br />
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
  </li>
	<br />
  <li>
    Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
  </li>
	<br />
  <li>
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.<br />
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
  </li>
	<br />
  <li>
    Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...<br />
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo: La sucesión del número 2 se calcula sumando (1+1). Análogamente, la sucesión del número 3 es (1+2), Y la del 5 es (2+3), y así sucesivamente.<br />
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:<br />
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1<br />
Fibonaccin = 1 para todo n<=1<br />
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.<br />
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/
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
