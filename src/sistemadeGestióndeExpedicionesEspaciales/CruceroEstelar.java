/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

public class CruceroEstelar extends Nave {
    private int capacidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " es un crucero estelar y no puede iniciar una mision.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de Pasajeros: " + capacidadPasajeros;
    }
}

