package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {

        System.out.println("Elige una opcion: ");
        String Menu = "** GESTION CINEMATOGRAFICA **** \n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR";

        mostrarMenu(Menu);
    }

    public static void mostrarMenu(String menu) {

        String opcion;

        String [] opcionesMenu = {"1", "2", "3", "4", "5", "6", "7"};

        // Pedir datos por consola

        System.out.println(menu);
        Scanner data = new Scanner(System.in);

        System.out.println("Respuesta: ");
        opcion = data.nextLine();

        switch (opcion){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                mostrarMenu(menu);
                break;
            case "8":
                System.out.println("\n \n Saliendo del menu... \n \n");

                break;
            default:
                System.out.println("Opción incorrecta");
                mostrarMenu(menu);

        }

    }
}
