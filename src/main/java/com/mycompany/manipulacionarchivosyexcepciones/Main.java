package com.mycompany.manipulacionarchivosyexcepciones;

/**
 * Clase principal que demuestra el uso de GestorDeArchivo y ValidadorArchivo.
 */
public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "Manipulacion de archivos y excepciones.txt";
        String contenido = "- Hola, este es un archivo de contenido.\n- Programa desarrollado por Stalin Mendieta.";

        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        try {
            // Guardar contenido en el archivo
            gestor.guardar(nombreArchivo, contenido);

            // Leer el contenido del archivo
            String textoLeido = gestor.leer(nombreArchivo);
            System.out.println("Contenido del archivo:\n" + textoLeido);

            // Verificar si el archivo está vacío
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo contiene información válida.");

        } catch (ArchivoVacioException ave) {
            System.err.println("Error: " + ave.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}