/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudiante estudiante = null;

        int opcion;
        do {
            System.out.println("\n--- Menú Sistema de Calificaciones ---");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Materia");
            System.out.println("3. Verificar Aprobación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    teclado.nextLine(); // limpiar buffer
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEst = teclado.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = teclado.nextInt();
                    estudiante = new Estudiante(nombreEst, edad);
                    System.out.println("Estudiante registrado correctamente.");
                    break;

                case 2:
                    if (estudiante == null) {
                        System.out.println("Primero debe registrar al estudiante.");
                        break;
                    }
                    teclado.nextLine(); 
                    System.out.print("Ingrese el nombre de la materia: ");
                    String nombreMat = teclado.nextLine();
                    System.out.print("Ingrese la nota ACD (3.5): ");
                    double acd = teclado.nextDouble();
                    System.out.print("Ingrese la nota APE (3.5): ");
                    double ape = teclado.nextDouble();
                    System.out.print("Ingrese la nota AA (3.0): ");
                    double aa = teclado.nextDouble();
                    Materia materia = new Materia(nombreMat, acd, ape, aa);
                    estudiante.agregarMateria(materia);
                    System.out.println("Materia registrada y asignada al estudiante.");
                    break;

                case 3:
                    if (estudiante == null) {
                        System.out.println("No hay estudiante registrado.");
                    } else {
                        estudiante.mostrarEstadoAcademico();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}

