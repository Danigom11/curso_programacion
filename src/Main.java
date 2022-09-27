public class Main {
    public static void main(String[] args) {
        Condicionales();
        Funciones();
        Bucles();
        Errores();
        Depuracion();
        Objetos();
        Privacidad();
        Herencia();
        MetodosClase();
    }

    // FUNCIONES
    public static void Funciones() {
        // Ejercicio 1
        int resultadoSuma;
        resultadoSuma = sumaTresNumeros(10, 20, 30);
        System.out.println("Suma de los tres numeros: " + resultadoSuma);

        // Ejercicio 2
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        System.out.println("Número de puertas de mi coche: " + miCoche.puertas);
    }

    // Ejercicio 1. Función con tres parámetros.
    public static int sumaTresNumeros(int a, int b, int c) {
        return a + b + c;
    }

    // Ejercicio 2. Crear clase coche
    static class Coche {
        public int puertas = 4;

        public void AnadirPuerta() {
            this.puertas++;
        }
    }

    // CONDICIONALES
    public static void Condicionales() {
        String estacion = "verano";

        if (estacion == "primavera") {
            System.out.println("Es primavera");
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación");
        }
    }

    // BUCLES
    // Hacer algo un número determinado de veces.
    // Un fragmento de mi código se va a ejercitar mientras se cumpla una condición
    public static void Bucles() {

        // WHILE (MIENTRAS)

        // El lenguaje GO no tiene while, ya que no lo necesita
        int contadorWhile = 10;
        // While o mientras: Se ejecuta hasta que la condición se cumpla, se rompe y se sale
        // Iteración es cada vuelta que dá antes de salirse
        while (contadorWhile > 0) {
            System.out.println("Contador while es: " + contadorWhile);
            contadorWhile--;
        }

        // DO WHILE (HAZ, MIENTRAS)

        // While primero evalua y luego ejecuta
        // Do While ejecuta (Como poco una vez) y luego evalua la condición
        // Muchos lenguajes no lo tienen. Muy poco usado.
        var contadorDoWhile = 12;
        do {
            System.out.println("Contador do while es: " + contadorDoWhile);
            contadorDoWhile--;
        } while (contadorDoWhile > 10);

        // FOR (PARA)

        // Tiene tres partes en los paréntesis y después el cuerpo.
        // 1. Iniciación o declaración de variables solo para el for. No existe previamente.
        // 2. Condición. Lo que queremos que se cumpla
        // 3. Acción. IMPORTANTE. Se ejecuta después de ejecutar el cuerpo del for.
        // Es el más utilizado.
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("For: " + contador);
        }

        // Ejemplo
        // Creamos un array vacío con 5 posiciones
        int valores[] = new int[5];
        // Creamos un array con 5 números dentro.
        int valoresSegundo[] = {10, 20, 30, 40, 50};


        // Declara una variable que es la posición en el array.
        // Después comprueba si es menor a la longitud máxima.
        // Ejecuta cuerpo. Imprime la posición.
        // Acción. Suma uno a la variable creada dentro.
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        // Imprime lo que hay en cada posción
        // En java esta es la forma simplificada de hacer lo anterior.
        // Una variable para controlar las posiciones hasta el final de la variable
        for (int j : valoresSegundo) {
            System.out.println(j);
        }

        // SWITCH (INTERRUPTORES O DISCIERNE)
        // Tiene casos en los que si se cumple hace lo que diga dentro.
        // Se le puede poner un break y se sale.
        // Default es opcional
        var estacionAno = "Verano";

        switch (estacionAno) {
            case "Verano":
                System.out.println("es verano");
                break;
            case "Invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("Estoy en el default");
                break;
        }

        var hoy_es = "Martes";

        switch (hoy_es) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("es laborable");
                break;
            case "Sábado":
            case "Domingo":
                System.out.println("Es fin de semana");
                break;
        }
    }

    // ERRORES Programadores noveles o senior
    // Como denominar las variables.
    // El código debe de poder entenderse incluso sin comentarios.
    // Nombres de variables facilmente identificables
    // No llamar una variable temp.
    // Única excepción es for dónde se acepta poner "i"; "j"; "k"
    // I viene de la palabra "index" por eso está permitido.
    // Para recorrer arrays bidimensionales o tridimensionales.
    public static void Errores() {
        // Hacer comentarios explicativos pero no demasiado.
        // No comentar demasiado.
        // Los comentarios no son solo para otros programadores
        // Son principalmente para nosotros.
        // Por ejemplo si metemos un hack, un error a propósito para probar el programa,
        // Muy importante poner comentario explicativo y fecha.

        // For que recorre array bidimensional numeros, y por cada
        // subarray del mismo, mostramos el valor que tiene.
        int numeros[][] = {
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++)
                System.out.println(numeros[j]);
        }

        // Mantener un estilo coherente siempre.
        // Intelij lo hace automáticamente
        // ctrl + alt + l

        // Hacer copias de seguridad del código sobre el que se trabaja.
        // Hacer control de versiones con GIT github o gitlab.
        // En algunas empresas se usan otros por temas de privacidad.
        // En windows tortoise git

        // No utilizar la forma compleja de programar si existe una forma simple de hacerlo.
        // Depurar mirando los errores que aparecen en el compilador es un error.
        // Mejor usar un depurador. Aprender a utilizar.

        // Error de crear funciones que son demasiado grandes.
        // Su cometido es simplificar el código en bloques pequeños.
        // Por ejemplo si tengo un main enorme y genero una función igual de enorme
        // lo que hago es mover el problema a otro sitio.
        // Que la función tenga únicamente lo que dice que debe tener.

        // Conversion de tipos.
        // Provoca una pérdida de precisión.
        // Por ejemplo convertir un double o decimal en un int o entero.
        // Lo que hace es redondear el número a entero y se pierden los decimales en el camino.
        // O confundir kilómetros por millas o cosas similares.

        // Error por uno.
        // Los arrays son elementos relacionados entre sí y que comparten un mismo tipo.
        // Los arrays se cuentan desde el 0.
        // Si un array tiene 5 posiciones la quinta es el número 4, no el 5.
        // Es un error muy común.

        // Overflow
        // Dar un valor superior o inferior al máximo que permite un tipo de número.
        // Una buena práctica es usar el tipo de dato máximo que se va a utilizar.
        // Ejemplo
        byte numero = 127;
        System.out.println(numero);
        numero += 5;
        System.out.println(numero);

        // 127
        // Suma 5 y pasa a:
        //-124
        // Tras superar el máximo da la vuelta y pasa al mínimo.

        // Un byte = 1
        // Un megabyte = 1024 b
        // Un kilobyte = 1024 mb
        // Si se hace una búsqueda de miles de resultados y luego la copiamos en una función
        // Podríamos duplicar el uso de memoria ram.
        // Si usamos un dispositivo embebido como arduino o android con dispositivos
        // más pequeños y con menos memoria la podemos llenar.
    }

    // DEPURACIÓN DE ERRORES
    public static void Depuracion() {
        // Mejor usar un depurador que no los prints en pantalla.
        // Funcionan con puntos de ruptura. Le decimos al programa que pare.
        // Se pueden hacer con línea de comando. En java con jdb u otros.
        // También vienen incorporados.

        int suma = 0;
        // El punto rojo que se marca al lado es un break.
        // No finaliza lo que hace es esperar a que haga algo.
        // Dar en debug. Al bicho que hay al lado del play

        suma = suma + 16;
        // Se puede modificar la cantidad que queramos para probarlo
        // sin tener que cambiar el código.
        // En el valor que queramos cambiar le damos al botón derecho y setvalue

        // Watcher
        // Para que se pare cuando ocurra algo concreto
        // Botón derecho en punto rojo y añadir la condición para que se pare.
        System.out.println(suma);

        // Ejemplo con array
        // int valores[] = new int[5];
        // int posicion = 5;
        // Puede servir para comparar si intentamos usar una posición de un
        // array que no existe.
        // System.out.println(valores[posicion]);

        // Pila de llamadas del depurador.
        // Sirve para saber por dónde ha pasado mi programa
        // En la sección de frames, el cuadro de la izquierda,
        // aparece por dónde va leyendo.

        // Exception
        // Al compilar a veces saltan excepciones que la impiden
        // por ejemplo no se puede dividir un número entre cero.
    }

    // OBJETOS
    public static void Objetos() {
        // Es algo que pretendemos que represente algo del mundo real
        // Tienen métodos. Por ejemplo un coche tiene puertas y
        // para abrirlas es necesario un método abrir puerta.
        // Se declaran mediante clases o estructuras según el idioma.
        // Crear objeto desde la clase de más abajo.
        // INSTANCIA U OBJETO. Se guarda un espacio en la memoria para este espacio.
        // Para generar una instancia primero el nombre de la clase que está en mayusculas la primera.
        // Después en minúsculas se pone el nombre del objeto o instancia.
        Car car = new Car(2, 90);
        System.out.printf("Puertas: %d\n", car.numeroDePuertas);
        System.out.printf("Velocidad máxima: %d\n", car.velocidadMaxima);
        // Ya se puede invocar a los métodos de dentro de la clase.
        // Dentro de la clase las funciones se llaman métodos.
        System.out.println("Velocidad coche: " + car.velocidadActual);
        car.acelerar();
        System.out.println("Velocidad coche: " + car.velocidadActual);
        car.decelerar();
        System.out.println("Velocidad coche: " + car.velocidadActual);

        // Se pueden crear todas las instancias que se quieran.
        // Se alojan en sitios independientes de la memoria así que nos son iguales.
        // Comparten propiedades, pero no tienen por qué ser iguales
        Car car2 = new Car();
        System.out.printf("Puertas: %d\n", car2.numeroDePuertas);
        System.out.printf("Velocidad máxima: %d\n", car2.velocidadMaxima);
        System.out.println("Velocidad coche: " + car2.velocidadActual);
        car.acelerar();
        System.out.println("Velocidad coche: " + car2.velocidadActual);
        car.decelerar();
        System.out.println("Velocidad coche: " + car2.velocidadActual);

        Car car3 = new Car(5, 200);
        System.out.printf("Puertas: %d\n", car3.numeroDePuertas);
        System.out.printf("Velocidad máxima: %d\n", car3.velocidadMaxima);
        System.out.println("Velocidad coche: " + car3.velocidadActual);
        car.acelerar();
        System.out.println("Velocidad coche: " + car3.velocidadActual);
        car.decelerar();
        System.out.println("Velocidad coche: " + car3.velocidadActual);
    }

    // PRIVACIDAD, ABSTRACCIÓN Y ENCAPSULACIÓN
    public static void Privacidad() {

        // PROPIEDADES PRIVADAS Y PÚBLICAS
        // Cuando creamos una clase tiene unas propiedades que pueden ser públicas o privadas
        // Privada solo dentro de la implementación de la clase
        // Pública en cualquier parte del código
        // Instancia de la clase vehículo
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);

        // Acceder a propiedad privada de la clase y modificarla
        vehiculo.setTipoPrivado("Coche privado");
        // Para acceder a los datos de la propiedad privada:
        // O asignarlo a una variable
        String tipoPrivado = vehiculo.getTipoPrivado();
        System.out.println(tipoPrivado);

        // O imprimirlo diréctamente:
        System.out.println(vehiculo.getTipoPrivado());

        // Ejemplos SET Y GET
        Vehiculo coche = new Vehiculo();
        coche.setTipoPrivado("Skoda");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipoPrivado("Scooter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipoPrivado());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());

        System.out.println(moto.getTipoPrivado());
        System.out.println(moto.getVelocidadMaxima());
        System.out.println(moto.isRapido());

        // En cada idioma se hace de forma diferente.
        // Se usa en la programación multi hilo o threats que sirve para usar dos o más core del ordenador a la vez
    }

    // HERENCIA, POLIMORFISMO E INTERFACES
    public static void Herencia() {
        // Herencia es una clase que hereda métodos y propiedades de otra clase.
        // La que hereda es la clase hija
        // La que cede sus funciones es la superclase, clase principal, clase base...
        // La hija tiene lo que la superclase y se le puede añadir lo que queramos.
        // A su vez se puede hacer una hija que herede de la hija anterior.
        CocheHerencia cocheHerencia = new CocheHerencia();
        cocheHerencia.velocidadMaxima = 14;
        cocheHerencia.matricula = "ABC 1234";

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 14;
        cocheElectrico.matricula = "ABC 1234";

        System.out.println("Matrícula:" + cocheElectrico.compruebaMatricula("XXX"));

        // Usar la clase que tenga los métodos que necesito
        CocheHerencia cocheHerencia2 = new CocheHerencia();
        cocheHerencia2.setSonido("BRRR");
        System.out.println(cocheHerencia2.getSonido());

        // Polimorfismo
        Saludo2 saludo2 = new Saludo2();
        saludo2.diHola();
        saludo2.sumaNumeros(9,4);
        saludo2.sumaNumeros(9.2,4.2);
    }
    // MÉTODOS DE CLASE
    public static void MetodosClase() {
        // Son funciones dentro de las clases
        // Tienen firma o prototipo. (Signature)
        // 1. Ámbito o visibilidad (público o privado)
        // 2. Nombre
        // 3. Parámetros con su tipo de datos correspondiente. Opcional. Cero o más
        // 4. Puede devolver un valor
        // Como invocar a un método de una clase
        // Primero crear un objeto con nuestra clase.
        // Después llamar a clase. Método correspondiente.
        // Si queremos usarlo dentro de la clase es directamente
        // Creamos una instancia de una interfaz
        CocheInterfaz cocheInterfaz = new CocheInterfaz();
        MotoInterfaz motoInterfaz = new MotoInterfaz();
        // Llamamos a la función creada
        EjecutaAcelerar(cocheInterfaz);
        EjecutaAcelerar(motoInterfaz);
        // Se suele llamar meta programación. Defines lo que quieres hacer y luego lo vas haciendo.
        // Se simplifica el acceso a ciertas funciones
        // Se usa mucho para hacer testing. Por ejemplo para crear una base de datos simulada.
        // Practicar con ello y simularlo
        // Los parámetros que le pasamos a una función pueden ser de dos tipos.
        // 1. Paso por valor. Se genera una copia de los valores y se pasan directamente.
        // Se dice que es una copia porque los valores originales no se cambian.
        // El único problema es el uso en memoria RAM.

        int valA = 5; // int = 32 bits, = 4 bytes
        int valB = 10; // int = 32 bits, = 4 bytes

        suma(valA,valB); // Aquí copiamos de nuevo el uso en memoria.

        System.out.println(valA);
        System.out.println(valB);

        // 2. Paso por referencia.
        // Lo que se pasa es la posición en la memoria.
        // Modifica las variables originales cambiando su valor.
        // Se hace cuando se pasa un objeto en los parámetros.

        CocheInterfaz cocheReferencia = new CocheInterfaz();

    }

    public static int suma (int a, int b) {
        // Aquí se crea una copia de las variables en zonas de memoria diferentes.
        // Si opero con ellos no cambian las variables originales.
        return a + b; // Una vez se llama a return se destruyen las variables anteriores
    }

    // Función que requiere como parámetro una interfaz
    // Lo que le pedimos al programador es que pase como parámetro el nombre de una clase que implemente esa interfaz
    public static void EjecutaAcelerar(VehiculoInterfaz vehiculoInterfaz) {
        vehiculoInterfaz.Acelerar(15);
    }

}

// CLASE para métodos


// INTERFACES
// No implementan ninguna función
// Se usan para unificar métodos
// Le dice al programador los métodos que tiene que implementar.
// La ventaja es que nos aseguraremos de tener ciertas funciones creadas.
interface VehiculoInterfaz {
    int velocidad = 0;
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}
// Cuando creo la clase tengo que implementar las funciones.
// En cuanto se haga se considera que la interfaz ha sido implementada.
class CocheInterfaz implements VehiculoInterfaz {

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche() -> Acelerar");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() -> Frenar");
    }
}

class MotoInterfaz implements VehiculoInterfaz {

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto() -> Acelerar");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto() -> Frenar");
    }
}

// POLIMORFISMO.
// Clases hijas implementan la misma función, pero hacen algo diferente.
// OVERRIDE. SOBREESCRIBIR. Se sobreescribe una función para que haga otra cosa.
// Para sobreescribir solo hay que volver a escribir la función con el mismo nombre
// Y con los nuevos parámetros.
class Saludo {
    public void diHola() {
        System.out.println("Original");
    }
}

class Saludo2 extends Saludo {
    public void diHola() {
        System.out.println("Polimorfismo con función override");
    }
    public int sumaNumeros(int a, int b) {
        System.out.println("Suma números de INT");
        return a + b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Suma números de FLOAT");
        return a + b * (float) 9.0;
    }
    public void sumaNumeros (double a, double b) {
        System.out.println("Suma números de DOUBLE");
        System.out.println("El resultado es: " + (a + b));
    }
}

// HERENCIA SIMPLE una clase hereda de otra
// HERENCIA MÚLTIPLE de dos o más clases.
// En algunos idiomas ya no lo permite.
// HERENCIA HIBRIDA. Forma de rombo.
// Clase A principal. Clase B y C heredan de A. Y Clase D hereda de B y C.

// CLASE para herencia. SUPERCLASE. PADRE
// Clase abstracta para poder hacer cosas diferentes en las clases hijas
// Clase con métodos sin implementar.
abstract class VehiculoHerencia {
    int velocidadMaxima;
    String matricula;
    String sonido;

    // CONSTRUCTOR DE LA CLASE
    public VehiculoHerencia() {
        System.out.println("Estoy en el constructor de VEHÍCULO HERENCIA");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }
}

// CLASE hija clase anterior
class CocheHerencia extends VehiculoHerencia {
    public String getSonido() {
        return "Super sonido: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class MotoHerencia extends VehiculoHerencia {
    public String getSonido() {
        return "Sonido de moto: " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

// CLASE que hereda de una anterior
// FINAL para que ninguna clase pueda heredar de esta
final class CocheElectrico extends CocheHerencia {

}

// CLASE para privacidad
class Vehiculo {
    // Público
    String tipo;
    // Privado
    // GET y SET con string
    private String tipoPrivado;

    Vehiculo() {
    }

    // ENCAPSULACIÓN. Manipula tipos y propiedades, pero fuera se pueden usar también
    // Se crean dos funciones por cada una de las propiedades privadas
    // GETTERS (modificar la propiedad) Y SETTERS (dar valor de la propiedad)
    // Encapsulamos las propiedades para acceder a ellas únicamente a través de funciones
    // Empiezan siempre por set y el nombre de la variable capitalizando la primera letra
    // SETTER Para asignar un valor desde fuera a la propiedad
    public void setTipoPrivado(String valor) {
        this.tipoPrivado = valor;
    }

    // GETTER para devolver un valor. Devuelve algo. Necesita un tipo de retorno.
    // El tipo de dato que devolverá.
    // No tiene parámetros porque no modifica nada
    public String getTipoPrivado() {
        return this.tipoPrivado;
    }

    // GET y SET con int
    private int velocidadMaxima;

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    // GET y SET con boolean
    private boolean rapido;

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    // GET boolean dice que se denomina con IS y nombre variable en vez de GET
    public boolean isRapido() {
        return this.rapido;
    }

}

// CLASE ABSTRACTA
// Puede tener funciones abstractas.
// Significa que se implementa la funcionalidad de forma parcial. Unas si y unas no.
// Se las llama también clases parciales. Una parte hecha y otra no.
// Limitas algunos parámetros y otros los dejas libres.
// Lo que ocurra dentro de la función abstracta es decisión posterior.
abstract class VehiculoAbstracto {
    private String tipo;
    private Boolean sonido;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Esta es la parte del código que tendríamos que programar adicionalmente.
    // Se puede usar por ejemplo cuando no se sabe que datos se introducirán
    // Así se le deja a otro programador la opción de crear manualmente lo que necesite al implementarlo

    abstract public Boolean getSonido();

    abstract public void setSonido(Boolean sonido);
}

// CLASE para lección objetos de la que después se hará una instancia o un objeto.
class Car {
    // PROPIEDADES de la clase
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    // Las clases se construyen.
    // Cuando yo no creo un constructor Java lo crea por mí automáticamente.
    // Si lo genero no lo hace automáticamente.
    // CONSTRUCTOR es el mejor sitio para inicializar las propiedades de una clase cuando la instanciamos.
    // Nombre idéntico al nombre de la clase
    // Se invoca al hacer el new coche.
    // Se puede aprovechar para inicializar ciertas variables.
    public Car(int numeroDePuertas, int velocidadMaxima) {
        // IMPORTANTE Buena práctica.
        // El nombre de los parámetros son los mismos que tenga la clase.
        // Pero si son los mismos hay que poner THIS. Justo antes de la variable.
        // THIS sirve para hacer referencia a la variable de la clase.
        // Si la propiedad tiene el mismo nombre que una variable de la función.
        // Ejemplo: Inicializa la variable número de puertas dentro del constructor
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parámetros");
    }

    // SOBRECARGA DE CONSTRUCTOR
    // Es tener dos funciones con el mismo tipado pero distintos parámetros.
    public Car() {
        // Ejemplo: Inicializa la variable número de puertas dentro del constructor
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor sin parámetros");
    }

    // Si invoco sin parámetros dispara el segundo constructor y si lo invoco sin parámetros el primero
    // Ejemplo de sobrecarga con dos funciones que se llaman igual, pero admiten distintos parámetros.
    public int Suma(int a, int b) {
        return a + b;
    }

    public float Suma(float a, float b) {
        return a + b;
    }


    // MÉTODOS
    public void acelerar() {
        velocidadActual += 15;
    }

    public void decelerar() {
        velocidadActual -= 10;
    }
}