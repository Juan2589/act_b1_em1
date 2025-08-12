package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
          Estudiante estudiante1 = new Estudiante("Juan", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("María", 22, 9.0);
        // 2. Mostrar la información de ambos estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        // 3. Modificar algún atributo usando un setter
        estudiante1.setPromedio(9.2);
        estudiante2.setEdad(23);     

        // 4. Mostrar la información actualizada
        System.out.println("Información actualizada:");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
         Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        // 2. Crear un libro usando el constructor con solo titulo y autor
           Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");
        // 3. Mostrar información de ambos libros
         System.out.println("=== Información Inicial ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10);         
        libro2.setPrecio(20000.0);                
        libro2.aplicarDescuento(20, 3000);        
        // 5. Mostrar información actualizada de los libros
        System.out.println("=== Información Actualizada ===");
        libro1.mostrarInformacion(); 
        libro2.mostrarInformacion();
    }
}