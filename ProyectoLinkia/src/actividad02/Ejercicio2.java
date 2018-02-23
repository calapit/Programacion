/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jesús Rosillo Vazquez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Declaramos la variables de l tipo double que contendran los numeros
        //introducidos por el usuario una vez parseados, asi como el resultaod final
        double numeroA;
        double numeroB;
        double numeroFinal;
        //String que contendrá la cadena introducida por el usuario y leida del buffer
        String valor_escrito;
        //Declaramos una variable compleja de tipo "BufferedReader".
        BufferedReader br;
        
        System.out.println("--------------------------------------------------------");
        //Mostramos un mensaje al usuario pidiendole que indique un numero decimal
        System.out.print("Escribe un numero decimal A:\t\t\t");

        //Leemos los datos introducidos
        br = new BufferedReader (new InputStreamReader (System.in));
        //Guardamos el numero introducido en la variable "valor_escrito", mediante
        //la funcion readLine de BufferedReader
        valor_escrito = br.readLine();
        //Parseamos el string a un double
        numeroA = Double.parseDouble(valor_escrito);
        
        //Creamos una estructura de bucle que se repetira mientras numeroB == 0
        //y se ejecutará al menos la primera vez.
        do {
            //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
            System.out.print("Escribe un numero decimal B diferente de 0:\t");
            //Guardamos el numero introducido en la variable "valor_escrito", 
            //mediante la funcion readLine de BufferedReader"
            valor_escrito = br.readLine();
            //Parseamos el string a un double
            numeroB = Double.parseDouble(valor_escrito);
        }while(numeroB == 0);
        
        //Guardamos el valor de la division de numeroA/numeroB
        numeroFinal=numeroA/numeroB;
        
        //Mostramos el resultado final por pantalla
        System.out.println("El resultado de " + numeroA + " / " + numeroB + " es:\t\t\t"
                + numeroFinal);
        System.out.println("--------------------------------------------------------");
    }
    
}
