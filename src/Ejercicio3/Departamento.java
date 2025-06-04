/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Departamento {
    private String nombre;
    private int numEmpleados;
    private double produccionAnual;
    private String categoria;

    public Departamento(String nombre, int numEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = calcularCategoria();
    }

    private String calcularCategoria() {
        if (numEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else if (numEmpleados >= 20 && produccionAnual >= 1000000) {
            return "B";
        } else if (numEmpleados >= 10 && produccionAnual >= 500000) {
            return "C";
        } else {
            return "Sin categoría";
        }
    }

    public String toString() {
        return "Departamento: " + nombre +
               "\nEmpleados: " + numEmpleados +
               "\nProducción Anual: $" + produccionAnual +
               "\nCategoría: " + categoria + "\n";
    }
}


