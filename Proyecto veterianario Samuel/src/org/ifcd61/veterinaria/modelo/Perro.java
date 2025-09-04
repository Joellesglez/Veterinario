package org.ifcd61.veterinaria.modelo;

public class Perro extends Animal implements Mascota{

    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementar método específico para Perro
    @Override
    public void hacerSonido() {
        System.out.println(nombre + "el Perro dice: Guau Guau!");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está jugando felizmente!");
    }
}
