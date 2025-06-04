/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

public class CasoCorrupcion {
    private String nombre;
    private String fechaInicio; 
    private int diasTranscurridos;
    private String estado;
    private double dañoEconomico;
    private ArrayList<Persona> personas;

    public CasoCorrupcion(String nombre, String fechaInicio, int diasTranscurridos, double dañoEconomico) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.diasTranscurridos = diasTranscurridos;
        this.dañoEconomico = dañoEconomico;
        estado = "Iniciado";
        personas = new ArrayList<Persona>();
        actualizarEstado();
    }

    public void agregarPersona(Persona p) {
        p.calcularFianza(dañoEconomico);
        personas.add(p);
    }

    public void actualizarEstado() {
        if (diasTranscurridos > 14) {
            estado = "Urgente";
        } else if (diasTranscurridos > 7) {
            estado = "Alerta";
        }
    }

    public void mostrarInfoCaso() {
        System.out.println("Caso: " + nombre);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Días transcurridos: " + diasTranscurridos);
        System.out.println("Estado: " + estado);
        System.out.println("Daño económico: $" + dañoEconomico);
        System.out.println("Personas implicadas:");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("- " + personas.get(i).toString());
        }
    }
}
