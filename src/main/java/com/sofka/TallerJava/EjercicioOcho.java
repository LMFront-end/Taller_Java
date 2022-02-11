package com.sofka.TallerJava;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioOcho {
    /*
     * Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
     * */

    public static void main(String[] args) {

        //Declaración de variable
        String dayWeek, message = "";

        //pedir datos por consola
        System.out.println("Enter a weekday: ");
        Scanner data = new Scanner(System.in);
        dayWeek = data.next().toLowerCase();

        switch (dayWeek) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                message = "Día laboral!";
                System.out.println(message);
                break;
            case "sabado":
            case "domingo":
                message = "Fin de semana";
                System.out.println(message);
                break;
            default:
                System.out.println("Enter a weekday");
                break;

        }
    }
}
