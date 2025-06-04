/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Estudiante {
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void agregarMateria(Materia materia) {
        this.materia = materia;
    }

    public void mostrarEstadoAcademico() {
        System.out.println("\nEstudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Materia: " + materia.getNombre());
        System.out.println("Notas -> ACD: " + materia.getAcd() + ", APE: " + materia.getApe() + ", AA: " + materia.getAa());

        if (materia.estaAprobado()) {
            System.out.println("Resultado: Aprobado ");
        } else {
            double acumulado60 = materia.getAcumulado60();
            System.out.println("Resultado: No Aprobado ");
            System.out.println("Debe rendir examen de recuperación sobre 3.5 pts.");
            System.out.println("Acumulado del 60%: " + acumulado60 + " / 6.0");
        }
    }
}

