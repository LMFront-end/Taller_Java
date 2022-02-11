package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioDiez {
    // Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

    public static void main(String[] args) {

        // Declaración de variables
        String frase, fraseSinEspacios;

        // pedir datos por consola
        System.out.println("Ingrese una frase: ");
        Scanner data = new Scanner(System.in);
        frase = data.nextLine().toLowerCase();

        //eliminar espacios en blanco
        fraseSinEspacios = frase.replace(" ", "");
        System.out.println("Frase sin espacios: " + fraseSinEspacios);

    }
}
