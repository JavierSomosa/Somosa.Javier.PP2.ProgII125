/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

public class Carguero extends Nave {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " esta realizando una mision de carga.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de Carga: " + capacidadCarga + " toneladas";
    }
}

