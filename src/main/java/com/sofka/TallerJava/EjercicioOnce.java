package com.sofka.TallerJava;

import java.util.HashMap;
import java.util.Scanner;

import static java.util.Spliterators.iterator;

public class EjercicioOnce {

    public static void main(String[] args) {


        //crear una lista de vocales
        String [] vocales = {"a", "e", "i", "o", "u"};

        // Inicializar variables
        String cadena, frase;

        // Pedir datos por consola
        System.out.println("Ingresa una frase");
        Scanner data = new Scanner(System.in);
        frase = data.nextLine().toLowerCase();
        cadena = frase;

        System.out.println("Esta frase tiene " + frase.replace(" ", "").length() + " caracteres no vacios");

        for(String vocal: vocales) {
            cadena = cadena.replace(vocal, "");
        }
        System.out.println("La frase tiene " + (frase.length() - cadena.length()) + " vocales");

    }
}
