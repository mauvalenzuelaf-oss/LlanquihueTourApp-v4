package ui;

import java.util.List;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase principal encargada de ejecutar el sistema
 * y mostrar los servicios turísticos por consola.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        /*
         * La colección utiliza la superclase como tipo de referencia,
         * pero contiene objetos de distintas subclases.
         */
        List<ServicioTuristico> servicios =
                gestor.generarServicios();

        System.out.println(
                "=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ==="
        );

        /*
         * El ciclo recorre la colección usando referencias
         * de tipo ServicioTuristico.
         *
         * Java ejecuta la versión sobrescrita de
         * mostrarInformacion() correspondiente al tipo real
         * de cada objeto.
         */
        for (ServicioTuristico servicio : servicios) {
            System.out.println("-----------------------------");
            servicio.mostrarInformacion();
        }
    }
}