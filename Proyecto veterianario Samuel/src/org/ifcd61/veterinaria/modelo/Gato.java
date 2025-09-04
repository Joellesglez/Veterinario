package org.ifcd61.veterinaria.modelo;

public class Gato extends Animal implements Mascota{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Método específico para el Gato
    @Override
    public void hacerSonido() {
        System.out.println(nombre + "dice: Miau");
    }

    @Override
    public void jugar() {
        boolean nombre;
        System.out.println(nombre + " está persiguiendo la pelota");
    }
}
