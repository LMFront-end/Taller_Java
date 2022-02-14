package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioCatorce {
    /*
     * Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
     * */

    public static void main(String[] args) {

        int num;

        System.out.println("Ingresar un numero: ");
        Scanner data = new Scanner(System.in);
        num = data.nextInt();

        while (num <= 1000){
            System.out.println(num);
            num += 2;
        }
    }
}