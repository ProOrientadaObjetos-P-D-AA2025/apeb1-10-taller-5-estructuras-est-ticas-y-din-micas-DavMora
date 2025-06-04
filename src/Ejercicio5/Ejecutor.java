/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conflicto conflicto = new Conflicto("Conflicto Internacional X", "01-01-2020");

        conflicto.agregarPais("Rusia");
        conflicto.agregarPais("Ucrania");
        conflicto.agregarPais("EE.UU.");
        conflicto.agregarPais("China");
        conflicto.agregarPais("Alemania");

        int opcion;
        do {
            System.out.println("\n--- SISTEMA ONU ---");
            System.out.println("1. Agregar Evento");
            System.out.println("2. Ver Estado del Conflicto");
            System.out.println("3. Ver Todos los Eventos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre del evento: ");
                String nombre = teclado.nextLine();

                System.out.print("Fecha: ");
                String fecha = teclado.nextLine();

                System.out.print("Ubicación: ");
                String ubicacion = teclado.nextLine();

                System.out.print("Descripción: ");
                String descripcion = teclado.nextLine();

                System.out.print("¿Es batalla? (true/false): ");
                boolean esBatalla = teclado.nextBoolean();

                System.out.print("¿Usa armas nucleares? (true/false): ");
                boolean nucleares = teclado.nextBoolean();

                System.out.print("Porcentaje de bajas en país (0-100): ");
                int bajas = teclado.nextInt();

                Evento evento = new Evento(nombre, fecha, ubicacion, descripcion, esBatalla, nucleares, bajas);
                conflicto.agregarEvento(evento);

            } else if (opcion == 2) {
                System.out.println("Estado actual del conflicto: " + conflicto.getEstado());
            } else if (opcion == 3) {
                conflicto.mostrarEventos();
            }

        } while (opcion != 4);
    }
}
