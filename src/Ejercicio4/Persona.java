/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String implicacion; 
    private boolean colabora;
    private double sentencia; 
    private double fianza;

    public Persona(String nombre, int edad, String ocupacion, String implicacion, boolean colabora, double sentencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.implicacion = implicacion;
        this.colabora = colabora;
        this.sentencia = sentencia;
        this.fianza = 0;
    }

    public String getImplicacion() {
        return implicacion;
    }

    public boolean colabora() {
        return colabora;
    }

    public double getSentencia() {
        return sentencia;
    }

    public void calcularFianza(double dañoEconomico) {
        if (implicacion.equalsIgnoreCase("acusado") && sentencia < 1 && colabora) {
            fianza = dañoEconomico * 0.5;
        }
    }

    public String toString() {
        String resultado = "Nombre: " + nombre + ", Edad: " + edad + ", Ocupación: " + ocupacion + ", Implicación: " + implicacion;
        if (implicacion.equalsIgnoreCase("acusado")) {
            resultado += ", Sentencia: " + sentencia + " años, Colabora: " + (colabora ? "Sí" : "No") + ", Fianza: $" + fianza;
        }
        return resultado;
    }
}

