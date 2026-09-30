package ClasePaquete;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kiara
 */
public class Paquete {

    String codigo;
    String destino;
    double peso;
    boolean asegurado;

    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }

    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }

    public Paquete(String codigo) {
        this(codigo, "Por asignar");
    }

    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | "
                + peso + " kg | asegurado: " + asegurado);
    }

    public void actualizarPeso(double peso) {
        this.peso = peso;
    }

    public double calcularCosto() {
        double costo = peso * 5000;

        if (asegurado) {
            costo = costo + 8000;
        }

        return costo;
    }

    public double calcularCosto(double tarifaPorKilo) {
        double costo = peso * tarifaPorKilo;

        if (asegurado) {
            costo = costo + 8000;
        }

        return costo;
    }
}