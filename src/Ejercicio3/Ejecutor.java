/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreEmpresa, rucEmpresa, direccionEmpresa;
        int opcion;

        System.out.print("Ingrese el nombre de la empresa: ");
        nombreEmpresa = teclado.nextLine();
        System.out.print("Ingrese el RUC: ");
        rucEmpresa = teclado.nextLine();
        System.out.print("Ingrese la dirección: ");
        direccionEmpresa = teclado.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, rucEmpresa, direccionEmpresa);

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Departamento");
            System.out.println("2. Mostrar Departamentos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    teclado.nextLine(); // limpiar buffer
                    System.out.print("Nombre del departamento: ");
                    String nombreDep = teclado.nextLine();
                    System.out.print("Número de empleados: ");
                    int empleados = teclado.nextInt();
                    System.out.print("Producción anual: ");
                    double produccion = teclado.nextDouble();
                    Departamento d = new Departamento(nombreDep, empleados, produccion);
                    empresa.agregarDepartamento(d);
                    System.out.println("Departamento agregado con éxito.");
                    break;

                case 2:
                    empresa.mostrarDepartamentos();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}

