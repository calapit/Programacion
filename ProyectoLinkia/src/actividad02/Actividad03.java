/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jesús Rosillo Vazquez
 */
public class Actividad03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables  litrosUsario, que almacenara el valor introducido
        //por el usuario parseado a double y valor_escrito que almacenara el string
        //introducido
        double litrosUsario;
        String valor_escrito;
                    
        //Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        //Las variables del tipo "BufferedReader" contienen funciones para 
        //leer datos por consola
        BufferedReader br;
        
        //Definimos las varaible para las cuales queremos un valor inicial dado
        double recipienteA = 0;
        double recipienteB = 0;
        int opcion=5;

        do{
            //Mostramos un mensaje al usuario pidiendole que indique la opcion que necesita
            System.out.println("\n------------------------------------------------\n" +
                    "\t1- Añadir refresco al primer recipiente.\n" +
                    "\t2- Traspasar refresco del primer al segundo recipiente.\n" +
                    "\t3- Quitar refresco del segundo recipiente.\n" +
                    "\t0- Finalizar");
            System.out.print("\n Que acción quiere realizar: ");

            //Alamacenamos los datos introducdos por consola
            br = new BufferedReader (new InputStreamReader (System.in));
  
            try{
                //Almacenos los datos introducidos en valor_escrito
                valor_escrito = br.readLine();
                //Parsemaos el valor introducido a un Integer
                opcion = Integer.parseInt(valor_escrito);
            //Capturamos las excepciones mas basicas en la entrada y el parseo
            } catch (NumberFormatException nf) {
                System.out.println("## ERROR: Formato del número incorrecto");
                continue;
            }catch (Exception ex) {
                System.out.println("## ERROR desconocido, vuelva a introducir los\n "
                        + "\tdatos y verifique que cumplen con los requisitos.\n"
                        + "\tEn caso de persistir el error, pongase en contacto\n"
                        + "\tcon su alumno.");
                continue;
            }
            
            //Definimos un switch, controlando cada uno de los valores validos de opcion
            switch (opcion) {
                case 1:  
                    //Mostramos un mensaje al usuario pidiendole que indique 
                    //los litros a añadir
                    System.out.print("** Indique los litros a añadir: ");
                    try{
                        //Almacenos los datos introducidos en valor_escrito
                        valor_escrito = br.readLine();
                        //Parsemaos el valor introducido a un Double
                        litrosUsario = Double.parseDouble(valor_escrito);
                    //Capturamos las excepciones mas basicas en la entrada y el parseo
                    } catch (NumberFormatException nf) {
                        System.out.println("## ERROR: Formato del número incorrecto");
                        continue;
                    }catch (Exception ex) {
                        System.out.println("## ERROR desconocido, vuelva a introducir los\n "
                                + "\tdatos y verifique que cumplen con los requisitos.\n"
                                + "\tEn caso de persistir el error, pongase en contacto\n"
                                + "\tcon su alumno.");
                        continue;
                    }
                    
                    if (litrosUsario < 0){
                        //Mostramos error en caso de ser un número negativo
                        System.out.println("## ALERTA: los litros no pueden ser negativos.\n\n"
                                + "\t-- NO SE REALIZARÁ LA OPERACIÓN --");
                    }else{
                        //Añadimos los litros a los del recipienteA
                        recipienteA += litrosUsario;
                        //Mostramos el resumen por pantalla
                        System.out.println("** Resultado de la operacion:\n"
                            + "**\tRecipiente A: " + recipienteA + " litros\n"
                            + "**\tRecipiente B: " + recipienteB + " litros\n");
                    }
                    
                    break;
                case 2: 
                    //Mostramos un mensaje al usuario pidiendole que indique los 
                    //litros a traspasar
                    System.out.print("** Indique los litros a para traspasar: ");
                    try{
                        //Almacenos los datos introducidos en valor_escrito
                        valor_escrito = br.readLine();
                        //Parsemaos el valor introducido a un Double
                        litrosUsario = Double.parseDouble(valor_escrito);
                    //Capturamos las excepciones mas basicas en la entrada y el parseo
                    } catch (NumberFormatException nf) {
                        System.out.println("## ERROR: Formato del número incorrecto");
                        continue;
                    }catch (Exception ex) {
                        System.out.println("## ERROR desconocido, vuelva a introducir los\n "
                                + "\tdatos y verifique que cumplen con los requisitos.\n"
                                + "\tEn caso de persistir el error, pongase en contacto\n"
                                + "\tcon su alumno.");
                        continue;
                    }
                    //Verificamos si los litros introducidos para traspasar no
                    //superan los del recipiente origen y que sean positivos
                    if (litrosUsario < 0){
                        //Mostrmoas error en caos de ser negativos
                        System.out.println("## ALERTA: los litros no pueden ser negativos.\n\n"
                                + "\t-- NO SE REALIZARÁ LA OPERACIÓN --");
                    }
                    else if ( litrosUsario <= recipienteA) {
                        //Restamos los litros del recipiente A y los añadimos al B
                        recipienteA -= litrosUsario;
                        recipienteB += litrosUsario;
                        //Mostramos el resumen por pantalla
                        System.out.println("** Resultado de la operacion:\n"
                            + "**\tRecipiente A: " + recipienteA + " litros\n"
                            + "**\tRecipiente B: " + recipienteB + " litros\n");
                    } else {
                        //Mostramos el alerta por pantalla al no haber litros suficientes
                        System.out.println("## ALERTA: Solo quedan: " + recipienteA + " litros"
                                + "en el primer recipiente.\n\n"
                                + "\t-- NO SE REALIZARÁ LA OPERACIÓN --");
                    }

                    break;
                case 3:
                    //Mostramos un mensaje al usuario pidiendole que indique los
                    //litros para quitar del segundo recipiente
                    System.out.print("** Indique los litros para vaciar: ");
                   try{
                        //Almacenos los datos introducidos en valor_escrito
                        valor_escrito = br.readLine();
                        //Parsemaos el valor introducido a un Double
                        litrosUsario = Double.parseDouble(valor_escrito);
                    //Capturamos las excepciones mas basicas en la entrada y el parseo
                    } catch (NumberFormatException nf) {
                        System.out.println("## ERROR: Formato del número incorrecto");
                        continue;
                    }catch (Exception ex) {
                        System.out.println("## ERROR desconocido, vuelva a introducir los\n "
                                + "\tdatos y verifique que cumplen con los requisitos.\n"
                                + "\tEn caso de persistir el error, pongase en contacto\n"
                                + "\tcon su alumno.");
                        continue;
                    }
                    //Verificamos si los litros introducidos para quitar no
                    //superan los del recipiente y que sean positivos
                    if (litrosUsario < 0){
                        //Mostrmoas error en caos de ser negativos
                        System.out.println("## ALERTA: los litros no pueden ser negativos.\n\n"
                            + "\t-- NO SE REALIZARÁ LA OPERACIÓN --");                   }
                    else if ( litrosUsario <= recipienteB) {
                        //Restamos los litros del recipiente B
                        recipienteB -= litrosUsario;
                        //Mostramos el resumen por pantalla
                        System.out.println("** Resultado de la operacion:\n"
                            + "**\tRecipiente A: " + recipienteA + " litros\n"
                            + "**\tRecipiente B: " + recipienteB + " litros\n");
                    } else {
                        //Mostramos el alerta por pantalla al no haber litros suficientes
                        System.out.println("## ALERTA: Solo quedan: " + recipienteB + " litros"
                                + "en el segundo recipiente.\n\n"
                                + "\t-- NO SE REALIZARÁ LA OPERACIÓN --");
                    }


                    break;
                case 0: 
                    //Mostramos el despedida por pantalla
                    System.out.println("Gracias, que tengas un buen día.");

                    break;
                default: 
                    //Mostramos el error de opcion invalida por pantalla
                    System.out.println("## ERROR: Opción invalida");

                    break;
            }
        }while (opcion != 0);
    }
    
}
