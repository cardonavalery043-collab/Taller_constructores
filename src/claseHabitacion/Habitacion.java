/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseHabitacion;

/**
 *
 * @author kiara
 */
public class Habitacion {

    int numero;
    String tipo;
    double precioNoche;
    boolean ocupada;

    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }

    public Habitacion(int numero, String tipo) {
        this(numero, tipo, 120000, false);
    }

    public void ocupar() {
        this.ocupada = true;
    }

    public boolean estaDisponible() {
        return !this.ocupada;
    }

    public double calcularEstadia(int noches) {
        return this.precioNoche * noches;
    }

    public double calcularEstadia(int noches, double descuento) {
        double total = calcularEstadia(noches);
        return total - (total * descuento / 100);
    }

    public void mostrarInformacion() {
        System.out.println("Habitacion " + numero + " | "
                + tipo + "  $" + precioNoche
                + " | Ocupada: " + ocupada);
    }
}