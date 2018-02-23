/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jesús Rosillo Vazquez
 */
public class Ejercicio01 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Declaramos dos variables en las que almacenar valores númericos
        //las variables de tipo "int" nos permiten almacenar enteros
        int total_manzanas; 
        int total_peras;

        //guardamos valores enteros en las variables enteras
        total_manzanas=10;
        total_peras=20;

        //modificamos el contenido de las variables enteras porque el granizo las ha mermado
        total_manzanas = total_manzanas -2;
        total_peras = total_peras -10;

        //mostramos por consola el valor de las variables enteras. De forma implícita se convierte de de int a string.
        System.out.println("Quedan "+total_manzanas+" manzanas despues del granizo");
        System.out.println("Quedan "+total_peras+" sandias despues del granizo");

        //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Quantas mazanas te quieres comer?");
        //Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        //Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        //guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /*Convertimos mediante una conversion explicita la variable "valor_escrito" a un valor entero para poder operar con él    y lo almacenamos en la variable "numero_melones_comer" */
        int numero_manzanas_comer = Integer.parseInt(valor_escrito );

        total_manzanas = total_manzanas -numero_manzanas_comer;
        System.out.println("Finalmente quedan "+total_manzanas+" manzanas"); 
        
        //PUNTO 2
        //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
        System.out.println("Quantas peras quieres comprar?");
        //utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        //guardamos el número introducido en la variable "valor_escrito"
        valor_escrito = br.readLine();
        
        /*Convertimos mediante una conversion explicita la variable 
        "valor_escrito" a un valor entero para poder operar con él    
        y lo almacenamos en la variable "numero_melones_comer" */
        int numero_peras_comprar = Integer.parseInt(valor_escrito );
        
        total_peras = total_peras +numero_peras_comprar;
        System.out.println("Ya tienes "+total_peras+" peras");
    }
}
