/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Jesús Rosillo Vazquez
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        //-----------------PUNTO 1------------------//
   
        System.out.println("-------------PUNTO 1-------------");
        /*Definimos la variable del tipo boolean y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         boolean miBoolean = true;
         System.out.println("Boolean:\n"
                 + "\t1 byte (8 bits)para almacenar valores true o false.\n"
                 + "\tEjemplo: " + miBoolean);
         
        /*Definimos la variable del tipo char y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         char miChar='A';
         System.out.println("Char:\n"
                 + "\t2bytes para almacenar un caracter.\n"
                 + "\tEjemplo: " + miChar);
         
        /*Definimos la variable del tipo short y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         short miShort = 30000;
         System.out.println("Short:\n"
                 + "\t2 bytes para almacenar un valor entero entre -32768 y 32767.\n"
                 + "\tEjemplo: " + miShort);
         
        /*Definimos la variable del tipo int y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         int miInt = 50000;
         System.out.println("Int:\n"
                 + "\t4 bytes para almacenar un valor entero mayor que short.\n"
                 + "\tEjemplo: " + miInt);
         
        /*Definimos la variable del tipo long y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         long miLong = 12345678910L;
         System.out.println("Long:\n"
                 + "\t8 bytes para almacenar un valor entero mayor que Int.\n"
                 + "\tEjemplo: " + miLong);
         
        /*Definimos la variable del tipo float y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         float miFloat = 101.5f;
         System.out.println("Float:\n"
                 + "\t4 bytes para almacenar un valor con coma pequeño.\n"
                 + "\tEjemplo: " + miFloat);
         
        /*Definimos la variable del tipo double y mostramos las características 
        del tipo de dato y muestre el valor de la variable*/
         double miDoble = 10.14;
         System.out.println("Double:\n"
                 + "\t8 bytes para almacenar un valor decimal.\n"
                 + "\tEjemplo: " + miDoble);
         
         
         
        //-----------------PUNTO 2------------------//
        
        //En alguna lineas usamos printf para facilitar el darle formato de tabla 
        //a la salida por pantalla.
        //Creamos un bloque para mostrar por pantalla un ejemplo de cada uno de
        // los operadores aritmeticos.
        System.out.println("\n\n-------------PUNTO 2-------------");
        System.out.println("  --------- Operadores aritméticos ---------");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","OPERADOR", "|", "EJEMPLO", "|", "RESULTADO", "|");
        System.out.printf("%2s %8s %2s %13s %2s %9d %2s %n", "|","+", "|", "1 + 1", "|", (1 + 1), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9d %2s %n", "|","-", "|", "1 - 1", "|", (1 - 1), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9d %2s %n", "|","*", "|", "2 * 2", "|", (2 * 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9d %2s %n", "|","/", "|", "2 / 2", "|", (2 / 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9d %2s %n", "|","%", "|", "13 % 2", "|", (13 % 2), "|");
        System.out.println("  ------------------------------------------");
        
        //Creamos un bloque para mostrar por pantalla un ejemplo de cada uno de
        // los operadores relacionales
        System.out.println("  --------- Operadores relacionales --------");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","OPERADOR", "|", "EJEMPLO", "|", "RESULTADO", "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|",">", "|", "2 > 1", "|", (2 > 1), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","<", "|", "2 < 1", "|", (2 < 1), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|",">=", "|", "2 >= 2", "|", (2 >= 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","<=", "|", "2 <= 2", "|", (2 <= 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","!=", "|", "2 != 2", "|", (2 != 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","==", "|", "2 == 2", "|", (2 == 2), "|");
        System.out.println("  ------------------------------------------");

        //Creamos un bloque para mostrar por pantalla un ejemplo de cada uno de
        // los operadores lógicos
        System.out.println("  ---------- Operadores lógicos ------------");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","OPERADOR", "|", "EJEMPLO", "|", "RESULTADO", "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","&&", "|", "true && false", "|", (true && false), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","||", "|", "true || false", "|", (true || false), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","^", "|", "true ^ false", "|", (true ^ false), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","!", "|", "!true", "|", (!true), "|");
        System.out.println("  ------------------------------------------");
        
        //Creamos un bloque para mostrar por pantalla un ejemplo de cada uno de
        // los operadores unarios, para este punto declaramos una varia del tipo
        // int con un valor inicial de 2 y poder asi operar con ella.
        int miNumero = 2;
        System.out.println("** miNumero = 2 **");
        System.out.println("  ---------- Operadores unarios ------------");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","OPERADOR", "|", "EJEMPLO", "|", "RESULTADO", "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","++", "|", "++miNumero", "|", (++miNumero), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","--", "|", "--miNumero", "|", (--miNumero), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","-", "|", "-miNumero", "|", (-miNumero), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","~", "|", "~miNumero", "|", (~miNumero), "|");
        System.out.println("  ------------------------------------------");       

        //Creamos un bloque para mostrar por pantalla un ejemplo de cada uno de
        // los operadores asignación, reutilizamos la variable 'miNumero', 
        //definida anteriormente
        System.out.println("  ------- Operadores de asignación ---------");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","OPERADOR", "|", "EJEMPLO", "|", "RESULTADO", "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","=", "|", "miNumero = 3", "|", (miNumero = 3), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","+=", "|", "miNumero += 2", "|", (miNumero += 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","-=", "|", "miNumero -= 2", "|", (miNumero -= 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","*=", "|", "miNumero *= 2", "|", (miNumero *= 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","/=", "|", "miNumero /= 2", "|", (miNumero /= 2), "|");
        System.out.printf("%2s %8s %2s %13s %2s %9s %2s %n", "|","%=", "|", "miNumero %= 2", "|", (miNumero %= 2), "|");
        System.out.println("  ------------------------------------------");
          
        //-----------------PUNTO 3------------------//
        System.out.println("\n\n-------------PUNTO 3-------------");
        //Mostramos un mensaje al usuario pidiendole que indique un numero
        System.out.print("Escribe un numero: ");
        //Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        //Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        //guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        //Convertimos mediante una conversion explicita la variable "valor_escrito" 
        //a double para poder operar con él y lo almacenamos en la 
        //variable "numeroUsuario" 
        System.out.println("\t 1- Realizamos una conversion explicita del valor\n"
                + "\t\tleido del buffer, de string a int,\n"
                + "\t\tmediante Integer.parseInt()" );
        int numeroUsuario = Integer.parseInt(valor_escrito);
        //multiplicamos el valor introducido por el usuario por 100 y lo almacenamos
        // en 'valor_final'
        int valor_final= 100 * numeroUsuario;
        
        //Mostramos el resultado de la multiplicacion por pantalla
        System.out.println("El valor final es de: " + valor_final);
        System.out.println("\t 2- Al mostrar el resultado por pantalla,\n "
            + "\t\tal concadenarlo con un string se hace\n"
            + "\t\tuna conversion implicita de int a string");
    }
    
}
