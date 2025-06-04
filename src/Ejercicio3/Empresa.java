/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento d) {
        departamentos.add(d);
    }

    public void mostrarDepartamentos() {
        System.out.println("\nEmpresa: " + nombre + " | RUC: " + ruc + " | Dirección: " + direccion);
        System.out.println("--- Departamentos registrados ---");
        for (int i = 0; i < departamentos.size(); i++) {
            System.out.println(departamentos.get(i).toString());
        }
    }
}