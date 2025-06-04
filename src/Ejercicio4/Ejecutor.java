/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre del caso: ");
        String nombreCaso = teclado.nextLine();

        System.out.print("Fecha de inicio (formato libre): ");
        String fecha = teclado.nextLine();

        System.out.print("Días transcurridos desde el inicio: ");
        int dias = teclado.nextInt();

        System.out.print("Daño económico causado al estado ($): ");
        double daño = teclado.nextDouble();
        teclado.nextLine(); // limpiar buffer

        CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, fecha, dias, daño);

        System.out.print("¿Cuántas personas desea agregar al caso?: ");
        int numPersonas = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Ocupación: ");
            String ocupacion = teclado.nextLine();

            System.out.print("Nivel de implicación (acusado/testigo/víctima): ");
            String implicacion = teclado.nextLine();

            boolean colabora = false;
            double sentencia = 0;

            if (implicacion.equalsIgnoreCase("acusado")) {
                System.out.print("¿Colabora con la justicia? (true/false): ");
                colabora = teclado.nextBoolean();

                System.out.print("Sentencia en años: ");
                sentencia = teclado.nextDouble();
                teclado.nextLine();
            }

            Persona p = new Persona(nombre, edad, ocupacion, implicacion, colabora, sentencia);
            caso.agregarPersona(p);
        }

        System.out.println("\n===== INFORMACIÓN DEL CASO =====");
        caso.mostrarInfoCaso();

        teclado.close();
    }
}
