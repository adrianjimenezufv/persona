package com.ufv;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;

    public Persona(String nombre, String apellidos, int dniSinLetra, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dniSinLetra = dniSinLetra;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDniSinLetra() {
        return dniSinLetra;
    }

    public void setDniSinLetra(int dniSinLetra) {
        this.dniSinLetra = dniSinLetra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dniSinLetra=" + dniSinLetra +
                ", edad=" + edad +
                '}';
    }
}
