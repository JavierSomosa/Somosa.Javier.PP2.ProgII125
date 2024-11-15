/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

import java.util.ArrayList;

public class AgenciaEspacial {
    private ArrayList<Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) {
        for (Nave n : naves) {
            if (n.nombre.equals(nave.nombre) && n.anioLanzamiento == nave.anioLanzamiento) {
                throw new IllegalArgumentException("Ya existe una nave con el mismo nombre y anio de lanzamiento.");
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
        for (Nave nave : naves) {
            System.out.println(nave);
        }
    }

    public void iniciarExploracion() {
        for (Nave nave : naves) {
            nave.explorar();
        }
    }
}

