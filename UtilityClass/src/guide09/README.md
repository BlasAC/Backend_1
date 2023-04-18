#### Fullstack - EGG
<a name="readme-top"></a>
<img src="https://user-images.githubusercontent.com/47120385/228570599-44a64b73-2eb9-423e-8396-9f2c49525dde.png" align="right" width="150px"/>

## [Volver al Inicio](https://github.com/BlasAC/Backend_1)

# Guía 09: Clases de Utilidad

<p>
	Breve repaso sobre los métodos disponibles en las clases Arrays, Integer y Date.
</p>
<br />

## Índice
<ul>
	<li>
    <a href="#ejercicios">Ejercicios</a>
  </li>
  <li>
    <a href="#extras">Extras</a>
  </li>
</ul>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Ejercicios](https://github.com/BlasAC/Backend_1/tree/master/UtilityClass/src/guide09/exercises)

<ol>
	<li>
    <p>
      Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
    </p>
    <p>
      Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método mostrarVocales(): deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
      </li>
      <li>
        Método invertirFrase(): deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
      </li>
      <li>
        Método vecesRepetido(): recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        <br />
          Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
      </li>
      <li>
        Método compararLongitud(): deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
      </li>
      <li>
        Método unirFrases(): deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
      </li>
      <li>
        Método reemplazar(): deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
      </li>
      <li>
        Método contiene(): deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
      </li>
    </ol>
	</li>
	<br />
  <li>
    <p>
    Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters. En el constructor vacío se usará el Math.random para generar los dos números.
    </p>
    <p>
      Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método mostrarValores que muestra cuáles son los dos números guardados.
      </li>
      <li>
        Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
      </li>
      <li>
        Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
      </li>
      <li>
        Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
      </li>
    </ol>
  </li>
	<br />
  <li>
    <p>
      Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
    </p>
    <p>
      Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
      </li>
      <li>
        Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
      </li>
      <li>    
        Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
      </li>
      <li>
        Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
      </li>
      <li>
        En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
      </li>
    </ol>
  </li>
	<br />
  <li>
    <p>
    Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
      </li>
      <li>
        Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar el objeto Date.
      </li>
      <li>
        Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
      </li>
    </ol>
    <p>
      Si necesiten acá tienen más información en clase Date: <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Date.html" target="_blank">Documentacion Oracle</a>
    </p>
  </li>
	<br />
  <li>
    <p>
      Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
    </p>
    <p>
      Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
      </li>
      <li>
        Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
      </li>
      <li>
        Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
      </li>
      <li>
        Método mostrarPersona que muestra la información de la persona deseada.
      </li>
    </ol>
  </li>
	<br />
  <li>
    <p>
      Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
    </p>
    <ol type="a">
      <li>
        Un constructor por defecto.
      </li>
      <li>
        Un constructor con todos los atributos como parámetro.
      </li>
      <li>
        Métodos getters y setters de cada atributo.
      </li>
    </ol>
    <p>Luego, en la clase CursoServicio:
    <ol type="a">
      <li>
        Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
      </li>
      <li>
        Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos.
      </li>
      <li>
        Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
      </li>
    </ol>
  </li>
</ol>

<p align="right">(<a href="#readme-top">Subir</a>)</p>

## [Extras](https://github.com/BlasAC/Backend_1/tree/master/UtilityClass/src/guide09/extras)

<ol>
  <li>
    <p>
      Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
    </p>
    <p>
      Un ejemplo de ejecución del programa podría ser este:
    <p>
    <ul>
      <li>
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
      </li>
      <li>
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
      </li>
      <li>
        ¡Ha acertado!
      </li>
    </ul>
  </li>
	<br />
  <li>
    <p>
      Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
    </p>
    <ul>
      <li>
        Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
      </li>
      <li>
        Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
      </li>
      <li>
        Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
      </li>
      <li>
        Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
      </li>
      <li>
        Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
      </li>
      <li>
        Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
      </li>
    </ul>
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
