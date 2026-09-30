/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseHabitacion;

/**
 *
 * @author kiara
 */
public class Hotel {

    public static void main(String[] args) {

        Habitacion h1 = new Habitacion(101, "Sencilla");
        Habitacion h2 = new Habitacion(102, "Doble");
        Habitacion h3 = new Habitacion(103, "Suite", 180000, false);

        h1.ocupar();

        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        System.out.println("Estadia de 3 noches: " + h2.calcularEstadia(3));

        System.out.println("Estadia de 3 noches con 10% de descuento: "
                + h2.calcularEstadia(3, 10));
    }
}