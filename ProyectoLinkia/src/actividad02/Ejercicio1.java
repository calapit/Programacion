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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Declaramos el double numeroUsuario y le asignamos el valor 0, asi 
        //controlaremos si el usuario introduce decimales
        double numeroUsuario=0;
        //String que contendrá la cadena introducida por el usuario y leida del buffer
        String valor_escrito;
        //Declaramos una variable compleja de tipo "BufferedReader".
        BufferedReader br;
              
        System.out.println("---------------------------------");
        //Creamos una estructura de bucle while que se repetirá mientras numeroUsuario
        //no supere 7
        while (numeroUsuario <= 7){
            //Mostramos un mensaje al usuario pidiendole que indique un numero por consola
            System.out.print("Escribe un número superior a 7:\t");
            //Leemos los datos introducidos
            br = new BufferedReader (new InputStreamReader (System.in));
            //Guardamos el numero introducido en la variable "valor_escrito", mediante
            //la funcion readLine de BufferedReader
            valor_escrito = br.readLine();

            //Parseamos el string a un Dobule
            numeroUsuario = Double.parseDouble(valor_escrito);
        }
        
        //Creamos un blucle del tipo WHILE que se ejecutara mientras contador sea 
        //menor o igual que numeroUsuario. Siendo el valor inicial de contador 0
        System.out.println("Mostamos los número enteros con el bucle WHILE");
        int contador=0;
        while(contador<=numeroUsuario){
            System.out.println("\t\t\t" + contador++);
        }
        
        System.out.println("Mostamos los número enteros con el bucle FOR");
        //Creamos un blucle del tipo FOR que se ejecutara mientras contador sea 
        //mnor o igual que numeroUsuario. Siendo el valor inicial de contador 0
        for(int i=0; i<=numeroUsuario; i++){
              //Por cada iteraccion se mostrara por pantalla un mensaje con el 
              //valor de contador en ese momento
              System.out.println("\t\t\t"+i);
        }
        System.out.println("---------------------------------");
    }  
}
