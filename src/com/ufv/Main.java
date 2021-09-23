package com.ufv;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona_read;
        InOut inOut = new InOut();

        try {
            persona_read= inOut.LecturaFichero("data.txt");
            System.out.println(persona_read);
        } catch (FileNotFoundException fne) {
            System.out.println("No hemos encontrado el fichero especificado");
        } catch (IOException ioe){
            System.out.println("Otro fallo no identificado");
        }
    }
}
