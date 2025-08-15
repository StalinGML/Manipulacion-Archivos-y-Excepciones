package com.mycompany.manipulacionarchivosyexcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase encargada de validar el contenido de un archivo.
 */
public class ValidadorArchivo {

    /**
     * Verifica si el archivo no está vacío.
     *
     * @param nombreArchivo Nombre del archivo a verificar.
     * @throws ArchivoVacioException Si el archivo no contiene contenido.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) {
                throw new ArchivoVacioException("El archivo " + nombreArchivo + " está vacío.");
            }
        } catch (IOException e) {
            System.err.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
}