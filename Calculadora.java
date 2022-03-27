/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author Nacho Vicente Abad
 * @version 1.0
 * @since 27/03/2022
 */
public class Calculadora {
    //Atributos
    /**
     * Marca de la calculadora
     */
    String marca;
    /**
     * Precio de la calculadora
     */
    String precio;

    //Metodos publicos
    /**
     * Devuelve la marca de la calculadora
     *
     * @return marca de la calculadora
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Introduce la marca de la calculadora
     * 
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Devuelve el precio de la calculadora
     *
     * @return precio de la calculadora
     */
    public String getPrecio() {
        return precio;
    }
    
    /**
     * Introduce el precio de la calculadora
     * 
     * @param precio
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    /**
     * Realiza la suma de dos numeros enteros
     *
     * @param a numero 1
     * @param b numero 2
     * @return a + b
     */
    public static int suma(int a, int b){
        return a + b;
    }
    
     /**
     * Realiza la resta de dos numeros enteros
     *
     * @param a numero 1
     * @param b numero 2
     * @return a - b
     */
    public static int resta(int a, int b){
        return a - b;
    }
    
     /**
     * Realiza la division de dos numeros enteros
     *
     * @param a numero 1
     * @param b numero 2
     * @return a / b
     */
    public static int division(int a, int b){
        return a / b;
    }
    
     /**
     * Realiza la multiplicacion de dos numeros enteros
     *
     * @param a numero 1
     * @param b numero 2
     * @return a * b
     */
    public static int multiplicacion(int a, int b){
        return a * b;
    }
    
    
}
