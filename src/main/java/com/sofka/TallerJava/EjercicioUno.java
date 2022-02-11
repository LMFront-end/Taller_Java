package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioUno {

    /* Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.*/
    // TODO: 10/02/2022 Declarar dos variables int, pedirle los datos al usuario
    public static void main(String[] args) {

        //Declaración de variables
        int number1, number2, compare;
        String message1, message2, message3;

        // primer dato
        System.out.println("Enter a number: ");
        Scanner data = new Scanner(System.in);
        number1 = data.nextInt();

        // segundo dato
        System.out.println("Enter other number: ");
        Scanner data2 = new Scanner(System.in);
        number2 = data2.nextInt();

        // mensajes
        message1 = "The number " + number1 + " is greater than the " + number2;
        message2 = "The number " + number2 + " is greater than the " + number1;
        message3 = "Both numbers are the same";

        if (number1 > number2) {
            System.out.println(message1);
        } else if (number2 > number1) {
            System.out.println(message2);
        } else if (number1 == number2) {
            System.out.println(message3);
        } else {
            System.out.println("Values entered are not numbers");
        }

    }

}