package org.ifcd61.veterinaria;

import org.ifcd61.veterinaria.modelo.Gato;
import org.ifcd61.veterinaria.modelo.Perro;

public class VeterinariaApp {
    public static void main(String[] args) {
        // Creamos un Perro y un Gato
        Perro miPerro = new Perro("Rex", 5);
        Gato miGato = new Gato("Mishi", 3);

        // Llamamos a los métodos
        miPerro.hacerSonido();
        miPerro.jugar();

        miGato.hacerSonido();
        miGato.jugar();
    }
}
