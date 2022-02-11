package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioTres {
    /* Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.*/

    public static void main(String[] args) {

        // TODO: 10/02/2022 Crear una variable de entrada, que pida un dato por consola 
        // TODO: 10/02/2022 Usar los métodos de Math

        // declaración de variables
        int num;
        double areaCircle;

        // pedir datos por consola
        System.out.println("Enter a number: ");
        Scanner data = new Scanner(System.in);
        num = data.nextInt();

        // calculo con método PI y POW
        areaCircle = (double) (Math.PI * Math.pow(num, 2));

        // mostrar resultado
        System.out.println("El area del circulo es: " + Math.ceil(areaCircle));

    }
}
