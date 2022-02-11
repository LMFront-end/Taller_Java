package com.sofka.TallerJava;

import java.util.Scanner;


public class EjercicioNueve {

    public static void main(String[] args) {


        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        texto = texto.replace("a", "e");
        System.out.println("La frase después del reemplazo es: \n" + texto);

        System.out.println("Introduzca el texto que desea añadir: ");
        Scanner data = new Scanner(System.in);
        String textoAnadido = data.nextLine();
        texto = texto.concat(textoAnadido);
        System.out.println("La frase después del reemplazo y añadir el texto del usuario es: \n"+ texto);
    }
}
