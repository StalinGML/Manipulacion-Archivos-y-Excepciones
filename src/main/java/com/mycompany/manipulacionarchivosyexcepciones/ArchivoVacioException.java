package com.mycompany.manipulacionarchivosyexcepciones;

/**
 * Excepción personalizada para manejar archivos vacíos.
 */
public class ArchivoVacioException extends Exception {
    public ArchivoVacioException(String mensaje) {
        super(mensaje);
    }
}