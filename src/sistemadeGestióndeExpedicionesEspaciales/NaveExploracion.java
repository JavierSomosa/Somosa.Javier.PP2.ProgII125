/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

public class NaveExploracion extends Nave {
    private String tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, String tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " esta iniciando su mision de " + tipoMision + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Mision: " + tipoMision;
    }
}
