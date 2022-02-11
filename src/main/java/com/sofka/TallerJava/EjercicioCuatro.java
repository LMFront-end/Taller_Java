package com.sofka.TallerJava;

import java.util.Scanner;

public class EjercicioCuatro {
    /* Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final
    con IVA. El IVA será una constante que será del 21%. */

    public static void main(String[] args) {
        // TODO: 10/02/2022 Crear una constante que contenga el valor del IVA

        // Declaración de constante
        final float IVA = (float) 0.21;

        // Declaración de variables
        float productValue, productIVA;

        // Pedir datos por consola
        System.out.println("Enter the product price: ");
        Scanner data = new Scanner(System.in);
        productValue = data.nextFloat();

        // calculo
        if(productValue != 0){
            productIVA = productValue * IVA;
            productIVA += productValue;

            System.out.println("The final price is: $" + productIVA);
        }else{
            System.out.println("Enter price");
        }

    }
}
