// Tipos de datos primitivos
int edad = 30;              // Número entero
double precio = 19.99;      // Número con decimales
boolean estaActivo = true;  // Valor booleano (verdadero/falso)
char letra = 'A';           // Carácter

// Tipo de dato de cadena de texto (String)
String nombre = "Juan Pérez";




import java.util.Scanner;

public class EjemploInput {
    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir y leer una cadena de texto
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Lee una línea completa
        System.out.println("Hola, " + nombre + "!");

        // 3. Pedir y leer un número entero
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt(); // Lee un número entero
        System.out.println("Wow, ¡" + edad + " años es una gran edad!");

        // 4. Cerrar el objeto Scanner
        scanner.close();
    }
}


int calificacion = 85;

if (calificacion >= 90) {
    System.out.println("Excelente, has obtenido una A.");
} else if (calificacion >= 80) {
    System.out.println("Muy bien, has obtenido una B.");
} else {
    System.out.println("Necesitas mejorar.");
}


int contador = 1;
int numero = 5;

System.out.println("Tabla de multiplicar del 5:");
while (contador <= 10) {
    System.out.println(numero + " x " + contador + " = " + (numero * contador));
    contador++; // Incrementa el contador en 1
}


import java.util.HashMap;
import java.util.Map;

// Crear un HashMap
Map<String, String> capitales = new HashMap<>();

// Agregar elementos
capitales.put("España", "Madrid");
capitales.put("Francia", "París");
capitales.put("Japón", "Tokio");

// Obtener un valor usando la clave
System.out.println("La capital de España es: " + capitales.get("España"));

// Iterar sobre el HashMap
for (String pais : capitales.keySet()) {
    System.out.println("País: " + pais + ", Capital: " + capitales.get(pais));
}


// Definición de la clase 'Coche'
class Coche {
    // Atributos (variables de instancia)
    String marca;
    String modelo;
    int anio;

    // Constructor de la clase
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método (comportamiento)
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
    }
}

// Clase principal donde se crean los objetos
public class Main {
    public static void main(String[] args) {
        // Crear un objeto (instancia de la clase Coche)
        Coche miCoche = new Coche("Toyota", "Corolla", 2022);
        
        // Llamar al método del objeto
        miCoche.mostrarDetalles();
    }
}