/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

public class Evento {
    private String nombre;
    private String fecha;
    private String ubicacion;
    private String descripcion;
    private boolean esBatalla;
    private boolean armasNucleares;
    private int bajasPorcentuales;

    public Evento(String nombre, String fecha, String ubicacion, String descripcion, boolean esBatalla, boolean armasNucleares, int bajasPorcentuales) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.esBatalla = esBatalla;
        this.armasNucleares = armasNucleares;
        this.bajasPorcentuales = bajasPorcentuales;
    }

    public boolean esBatalla() {
        return esBatalla;
    }

    public boolean usaArmasNucleares() {
        return armasNucleares;
    }

    public int getBajasPorcentuales() {
        return bajasPorcentuales;
    }

    public String toString() {
        return "Evento: " + nombre + ", Fecha: " + fecha + ", Ubicación: " + ubicacion +
               ", Descripción: " + descripcion + ", ¿Batalla?: " + esBatalla +
               ", ¿Nucleares?: " + armasNucleares + ", %Bajas: " + bajasPorcentuales;
    }
}

