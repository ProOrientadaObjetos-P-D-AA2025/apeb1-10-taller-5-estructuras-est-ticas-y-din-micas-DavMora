/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.ArrayList;

public class Conflicto {
    private String nombre;
    private ArrayList<String> paisesInvolucrados;
    private String fechaInicio;
    private String estadoActual;
    private ArrayList<Evento> eventos;

    public Conflicto(String nombre, String fechaInicio) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        paisesInvolucrados = new ArrayList<>();
        eventos = new ArrayList<>();
        estadoActual = "En desarrollo";
    }

    public void agregarPais(String pais) {
        paisesInvolucrados.add(pais);
    }

    public void agregarEvento(Evento e) {
        eventos.add(e);
        verificarCondiciones();
    }

    public void verificarCondiciones() {
        int totalPaises = 195; // Países del mundo
        int batallas = 0;
        boolean nuclearesEnPrimerMundo = false;
        boolean bajasAltas = false;

        for (int i = 0; i < eventos.size(); i++) {
            Evento e = eventos.get(i);

            if (e.esBatalla()) {
                batallas++;
                if (e.usaArmasNucleares()) {
                    nuclearesEnPrimerMundo = true;
                }
            }

            if (e.getBajasPorcentuales() >= 50) {
                bajasAltas = true;
            }
        }

        double porcentajeBatallas = ((double) batallas / totalPaises) * 100;

        if (porcentajeBatallas >= 50) {
            estadoActual = "Guerra mundial";
        } else if (porcentajeBatallas >= 30 || bajasAltas) {
            estadoActual = "Reunión urgente";
        } else if (nuclearesEnPrimerMundo) {
            estadoActual = "Guerra mundial";
        }
    }

    public String getEstado() {
        return estadoActual;
    }

    public void mostrarEventos() {
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i).toString());
        }
    }

    public String toString() {
        return "Conflicto: " + nombre + ", Fecha inicio: " + fechaInicio + ", Estado: " + estadoActual;
    }
}
