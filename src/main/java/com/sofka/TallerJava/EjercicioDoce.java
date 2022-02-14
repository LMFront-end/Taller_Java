package com.sofka.TallerJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjercicioDoce {

    public static void main(String[] args) {

        // declaración de variables
        String palabraUno, palabraDos;

        // Pedir datos por consola
        //frase 1
        System.out.println("Ingresa una frase: ");
        Scanner data1 = new Scanner(System.in);
        palabraUno = data1.nextLine().toLowerCase();
        String[] texto1 = (palabraUno.split(""));

        // frase 2
        System.out.println("Ingresa otra frase: ");
        Scanner data2 = new Scanner(System.in);
        palabraDos = data2.nextLine().toLowerCase();
        String[] texto2 = (palabraDos.split(""));

        List<String> diferencias = new ArrayList<>();

        if(texto1.length > texto2.length){

            for(int x = 0; x < texto1.length; x++){
                if(Arrays.asList(texto2).contains(texto1[x])){
                    System.out.println("1");
                } else{
                    diferencias.add(texto1[x]);
                }
            }
        }else{
            for(int x = 0; x < texto2.length; x++){
                if(Arrays.asList(texto1).contains(texto2[x])){
                }else{
                    diferencias.add(texto2[x]);
                }
            }
        }

        System.out.println("Diferencias " + diferencias);



    }
}
