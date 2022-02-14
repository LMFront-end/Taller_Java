package com.sofka.TallerJava;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjercicioTrece {

    /*
     * Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
     * */
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("AAAA/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
    }
}