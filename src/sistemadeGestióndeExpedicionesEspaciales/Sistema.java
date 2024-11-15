/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeGestióndeExpedicionesEspaciales;

public class Sistema {
    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();

        Nave naveExploracion = new NaveExploracion("Explorador 1", 5, 2020, "CARTOGRAFIA");
        Nave carguero = new Carguero("Carguero Alpha", 3, 2018, 300);
        Nave crucero = new CruceroEstelar("Crucero Estelar Omega", 10, 2015, 200);

        try {
            agencia.agregarNave(naveExploracion);
            agencia.agregarNave(carguero);
            agencia.agregarNave(crucero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Mostrando todas las naves:");
        agencia.mostrarNaves();

        System.out.println("\nIniciando exploracion:");
        agencia.iniciarExploracion();
    }
}


