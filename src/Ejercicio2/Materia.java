/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Materia {
    private String nombre;
    private double acd; 
    private double ape; // 
    private double aa;  // 

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAcd() {
        return acd;
    }

    public double getApe() {
        return ape;
    }

    public double getAa() {
        return aa;
    }

    public double getTotal() {
        return acd + ape + aa;
    }

    public boolean estaAprobado() {
        double total = getTotal(); 
        return total >= 7.0;
    }

    public double getAcumulado60() {
        return (getTotal() / 10.0) * 6.0; 
    }
}
