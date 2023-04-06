#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 03: Estructuras de control

<p>
	Cada ejercicio está en su correspondiente archivo. Ej.: Ejercicio 1 -> Exercise01.java
</p>
<p>
	En esta guía veremos la sintaxis y el funcionamiento de las <strong>estructuras de control</strong> vistas en PSeInt.
</p>
<p>
  <strong>Condicionales</strong>: Si/if, Si-SiNo/if-else, Segun/switch
</p>
<p>
  <strong>Bucles</strong>: Mientras/while, Repetir-Mientras Que/do-while y Para/for.
</p>

<br />

## Manos a la obra!
<ol start="6">
  <li>
    Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
  </li>
  <br />
  <li>
    Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
    <ul>
      <li>
        Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
      </li>
      <li>
        Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
      </li>
      <li>
        Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
      </li>
      <li>
        Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
      </li>
      <li>
        Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
      </li>
    </ul>
  </li>
  <br />
  <li>
    Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
  </li>
  <br />
  <li>
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
  </li>
  <br />
  <li>
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
    Por ejemplo:<br />
      5 *****<br />
      3 ***<br />
      11 ***********<br />
      2 **
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## Ejercicios
<ol>
	<li>
		Crear un programa que dado un número determine si es par o impar.
	</li>
	<br />
  <li>
		Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
	</li>
	<br />
  <li>
		Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
	</li>
	<br />
  <li>
		Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
	</li>
	<br />
  <li>
		Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
	</li>
	<br />
  <li>
		Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú:<br />
      > Menu<br />
      > 1. Sumar<br />
      > 2. Restar<br />
      > 3. Multiplicar<br />
      > 4. Dividir<br />
      > 5. Salir<br />
      > Elija una opción:<br />
	</li>
	<br />
  <li>
		Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O. Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
	</li>
	<br />
  <li>
		Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:<br />
    * * * *<br />
    *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br />
    *&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br />
    * * * *<br />
	</li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## Extras

<ol>
  <li>
		Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
	</li>
	<br />
  <li>
		Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
	</li>
	<br />
  <li>
		Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
	</li>
	<br />
  <li>
		Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
	</li>
	<br />
  <li>
		Una obra social tiene tres clases de socios:
    <ul>
      <li>
        Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
      </li>
      <li>
        Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
      </li>
      <li>
        Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
      </li>
    </ul>
    Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
	</li>
	<br />
  <li>
		Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
	</li>
	<br />
  <li>
		Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
	</li>
	<br />
  <li>
		Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
	</li>
	<br />
  <li>
		Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
  Por ejemplo: 50 / 13:<br />
  50 – 13 = 37 una resta realizada<br />
  37 – 13 = 24 dos restas realizadas<br />
  24 – 13 = 11 tres restas realizadas<br />
  Dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
	</li>
	<br />
  <li>
		Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
	</li>
	<br />
  <li>
		Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.
	</li>
	<br />
  <li>
		Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:<br />
    0-0-0<br />
    0-0-1<br />
    0-0-2<br />
    0-0-E<br />
    0-0-4<br />
    0-1-2<br />
    0-1-E<br />
    Nota: investigar función equals() y como convertir números a String.
	</li>
	<br />
  <li>
		Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:<br />
    1<br />
    12<br />
    123
	</li>
	<br />
  <li>
		Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
	</li>
	<br />
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
