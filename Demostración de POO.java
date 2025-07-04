   // Clase base (superclase) - Demuestra ENCAPSULACIÓN
class Animal {
    // Atributos encapsulados (private)
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos (getters/setters) - Encapsulación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método que será sobrescrito - Polimorfismo
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }

    // Sobrecarga de métodos (Polimorfismo)
    public void alimentar() {
        System.out.println("Alimentando al animal");
    }

    public void alimentar(String comida) {
        System.out.println("Alimentando con: " + comida);
    }
}

// Clase derivada (subclase) - Demuestra HERENCIA
class Perro extends Animal {
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // Llama al constructor de la superclase
        this.raza = raza;
    }

    // Sobrescritura de método - POLIMORFISMO
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }

    // Método específico de Perro
    public void moverCola() {
        System.out.println(getNombre() + " mueve la cola feliz");
    }
}

// Otra clase derivada
class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau! ¡Miau!");
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Animal animalGenerico = new Animal("Genérico", 5);
        Perro miPerro = new Perro("Rex", 3, "Labrador");
        Gato miGato = new Gato("Whiskers", 2);

        // Demostrar encapsulación (acceso mediante getters)
        System.out.println("\n--- Encapsulación ---");
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        System.out.println("Edad del gato: " + miGato.getEdad());

        // Demostrar polimorfismo (sobrescritura de métodos)
        System.out.println("\n--- Polimorfismo (sobrescritura) ---");
        animalGenerico.hacerSonido();
        miPerro.hacerSonido();
        miGato.hacerSonido();

        // Demostrar polimorfismo (sobrecarga de métodos)
        System.out.println("\n--- Polimorfismo (sobrecarga) ---");
        miPerro.alimentar();
        miPerro.alimentar("croquetas");

        // Demostrar método específico de la subclase
        System.out.println("\n--- Método específico ---");
        miPerro.moverCola();

        // Demostrar herencia
        System.out.println("\n--- Herencia ---");
        System.out.println("Perro heredó: " + miPerro.getNombre() + ", " + miPerro.getEdad() + " años");
    }
}
    
