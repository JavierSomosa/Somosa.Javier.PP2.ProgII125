/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

public abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public abstract void explorar();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Capacidad Tripulacion: " + capacidadTripulacion +
               ", Anio de Lanzamiento: " + anioLanzamiento;
    }
}

