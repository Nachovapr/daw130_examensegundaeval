/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author Nacho Vicente Abad
 * @version 1.0
 * @since 27/03/2022
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 12, numero2 = 6;
        Calculadora calculadora = new Calculadora();

        examensegundaeval(calculadora, numero1, numero2);

    }

    private static void examensegundaeval(Calculadora calculadora, int numero1, int numero2) {
        int resultado;
        System.out.println("La SUMA es ");
        resultado = calculadora.suma(numero1,numero2);
        System.out.println(resultado);
        System.out.println("La RESTA es ");
        resultado = calculadora.resta(numero1,numero2);
        System.out.println(resultado);
        System.out.println("La MULTIPLICACION es ");
        resultado = calculadora.multiplicacion(numero1,numero2);
        System.out.println(resultado);
        System.out.println("La DIVISION es ");
        resultado = calculadora.division(numero1,numero2);
        System.out.println(resultado);
    }

}
