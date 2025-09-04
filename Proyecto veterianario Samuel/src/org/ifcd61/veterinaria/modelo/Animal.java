package org.ifcd61.veterinaria.modelo;

public abstract class Animal {
    private final String nombre;
    // Estos son los atributos del animal  protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto
    public abstract void hacerSonido();
}
