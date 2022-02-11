package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioDos {
    /* Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.*/
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
