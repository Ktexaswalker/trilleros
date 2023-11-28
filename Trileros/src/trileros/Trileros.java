/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trileros;

import java.util.Scanner;

/**
 *
 * @author hema5364
 */
public class Trileros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        //definirArray3Posiciones()
        Scanner sc = new Scanner(System.in);
        char [] trileros = new char[3];
        todosAX(trileros);  //todosAX()
        //aleatorio(de 0 a 2), donde pones la o
        int valor = aleatorio();
        trileros[valor] = 'o';  //la pelota esta en la posicion random
        //motrarDisposicionCubos
        System.out.print("Esta es la posicion inicial:\t");
        dibujarCubiletes();
        mostrarCubos(trileros);
        System.out.println("Pulsa Enter para Empezar");
        sc.nextLine();
        do {    //Repetir 10 veces
            //System.out.print((cont+1) + "\t ");   //comentado para que solo aparezcan los cubos
            intercambiarPosicion(trileros); //IntercambiarPosicion
            /**System.out.print("\t\t\t\t");
            mostrarCubos(trileros);*/
            cont++;
        } while (cont < 10);
        //Comprobar si la posicion tiene la o
        int posicion = preguntaBolita(trileros);
        comprobarBolita(trileros, posicion);
    }

    public static void todosAX(char[] trileros) {
        for (int i = 0; i < trileros.length; i++) {
            trileros[i] = 'x';
        }
    }

    public static int aleatorio() {
        int range = 3;
        int rn = (int) (Math.random() * range);
        return rn;
    }

    private static void mostrarCubos(char[] trileros) {
        System.out.println("  [" + trileros[0] + "]     [" + trileros[1] + "]     [" + trileros[2] + "]");
    }

    private static void intercambiarPosicion(char[] trileros) {
        int pos1 = aleatorio(); //Escoger1º posicion aleatoria
        int pos2 = aleatorio(); //Escoger2º posicion aleatoria
        int posicion1, posicion2;
        char postemp;
        while (pos2 == pos1) {  //Comprobar que el segundo aleatorio es diferente, de lo contrario, volver a cambiar posición
            pos2 = aleatorio();
        }
        //HACER LOS CUBOS
        if (pos1 == 0 && pos2 == 1 || pos1 == 1 && pos2 == 0) {
            intercambiarposicion1con2();
        } else if (pos1 == 0 && pos2 == 2 || pos1 == 2 && pos2 == 0) {
            intercambiarposicion1con3();
        } else if (pos1 == 1 && pos2 == 2 || pos1 == 2 && pos2 == 1) {
            intercambiarposicion2con3();
        }
        mostrarFrase(pos2, pos1);   //Mostrar frase intercambio posicion "X" y "Y"
        //Cambiar el valor de las 2 posiciones
        postemp = trileros[pos1];
        trileros[pos1] = trileros[pos2];
        trileros[pos2] = postemp;
        limpiarConsola();
    }

    private static void mostrarFrase(int pos1, int pos2) {
        //Comentado para que aparezca solo los cubos
        //System.out.println("La posicion " + pos1 + " se ha cambiado por la posicion " + pos2);
    }

    private static void comprobarBolita(char[] trileros, int posicion) {
        for (int i = 0; i < trileros.length; i++) {
            if (trileros[i] == 'o') {
                if (i == posicion) {
                    System.out.println("Has acertado");
                } else {
                    System.out.println("Has perdido");
                }
            }
        }
    }

    private static int preguntaBolita(char[] trileros) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        System.out.print("Donde está la bolita? (0, 1, 2): ");
        return resultado = sc.nextInt();
    }
    
    public static void dibujarCubiletes() {
       
        limpiarConsola();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  ***     ***     ***");
        System.out.println(" *   *   *   *   *   *");    
        System.out.println("******* ******* *******");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void intercambiarposicion1con3() {
       
        dibujarCubiletes();
        limpiarConsola();
         
         System.out.println("");
          System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *    ***    ");
        System.out.println("*******  *   *    ***");    
        System.out.println("        *******  *   *");
        System.out.println("                *******");
         System.out.println("");
          System.out.println("");
        limpiarConsola();
         System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******   ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******   ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
         System.out.println("");
        limpiarConsola();
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                  ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
        limpiarConsola();
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                 ***");
        System.out.println("                *   *");        
        System.out.println("               *******");        
        limpiarConsola();
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                ***");
        System.out.println("               *   *");        
        System.out.println("              *******");        
        limpiarConsola();
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("               ***");
        System.out.println("              *   *");        
        System.out.println("             *******");        
        limpiarConsola();
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("             ***");
        System.out.println("            *   *");        
        System.out.println("           *******");        
        limpiarConsola();
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola();        
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola();    
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola();    
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola();    
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("   ***");
        System.out.println("  *   *");        
        System.out.println(" *******");        
        limpiarConsola();            
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola();    
       
         System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("          ***   *******");
        System.out.println("         *   *          ");    
        System.out.println("  ***   *******      ");
        System.out.println(" *   *");
        System.out.println("*******");        
         System.out.println("");
       
        limpiarConsola();    
       
         System.out.println("");
          System.out.println("");
        System.out.println("                  ***");
        System.out.println("          ***    *   *");
        System.out.println("  ***    *   *  *******");    
        System.out.println(" *   *  *******      ");
        System.out.println("*******");
        System.out.println("");
        System.out.println("");
        dibujarCubiletes();


    }

    
    public static void intercambiarposicion1con2() {
       
        dibujarCubiletes();
        limpiarConsola();
         
        System.out.println("");
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *            ***");
        System.out.println("*******   ***    *   *");    
        System.out.println("         *   *  ******* ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola();
        
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******           ***");
        System.out.println("                 *   *");    
        System.out.println("          ***   ******* ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola();
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("          ***");
        System.out.println("         *   *");        
        System.out.println("        *******");        
        limpiarConsola();       
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola();       
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("        ***");
        System.out.println("       *   *");        
        System.out.println("      *******");        
        limpiarConsola();       
 
        System.out.println("      ***");
        System.out.println("     *   *");
        System.out.println("    *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola();       
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("      ***");
        System.out.println("     *   *");        
        System.out.println("    *******");        
        limpiarConsola();       
        System.out.println("        ***");
        System.out.println("       *   *");
        System.out.println("      *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola();             
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("    ***");
        System.out.println("   *   *");        
        System.out.println("  *******");        
        limpiarConsola();     
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola();   
                 
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******   *** ");
        System.out.println("                 *   *  ");    
        System.out.println("  ***           *******");        
        System.out.println(" *   *");        
        System.out.println("*******");        
                 
          System.out.println("");
        limpiarConsola();     
          System.out.println("");
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *    *** ");
        System.out.println("  ***   *******  *   *  ");    
        System.out.println(" *   *          *******");        
        System.out.println("*******");        
                 System.out.println("");
          System.out.println("");   

        dibujarCubiletes();


    }
    

    public static void intercambiarposicion2con3() {
       
        dibujarCubiletes();
        limpiarConsola();
         
        System.out.println("");
        System.out.println("");
        System.out.println("                  *** ");
        System.out.println("  ***            *   *");
        System.out.println(" *   *    ***   ******* ");    
        System.out.println("*******  *   *         ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola();
        
        
        
        System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("  ***           *******");
        System.out.println(" *   *                ");    
        System.out.println("*******   ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("          ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("           ***           ");
        System.out.println("          *   *        ");        
        System.out.println("         *******        ");                 
     
        limpiarConsola(); 
        System.out.println("                ***");
        System.out.println("               *   *");
        System.out.println("              *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("            ***           ");
        System.out.println("           *   *        ");        
        System.out.println("          *******        ");                 

        limpiarConsola(); 
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("             ***           ");
        System.out.println("            *   *        ");        
        System.out.println("           *******        ");                 

        limpiarConsola(); 
        System.out.println("              ***");
        System.out.println("             *   *");
        System.out.println("            *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("              ***           ");
        System.out.println("             *   *        ");        
        System.out.println("            *******        ");                 

        limpiarConsola(); 
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("               ***           ");
        System.out.println("              *   *        ");        
        System.out.println("             *******        ");                 

        limpiarConsola(); 
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                 ***           ");
        System.out.println("                *   *        ");        
        System.out.println("               *******        ");                 
        
        limpiarConsola(); 
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                  ***           ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("  ***   *******        ");
        System.out.println(" *   *                ");    
        System.out.println("*******           *** ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        System.out.println("");
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("");
        System.out.println("          ***");
        System.out.println("  ***    *   *        ");
        System.out.println(" *   *  *******   *** ");    
        System.out.println("*******          *   *");
        System.out.println("                *******        ");                 
        System.out.println("");
        
        dibujarCubiletes();


    }


    
    
    public static void limpiarConsola() {
       try {
           Thread.sleep(100);
           for (int i = 0; i < 10; i++) {
               System.out.println("");
           }
       } catch (InterruptedException ex) {
           System.out.println("no sleep");
       }
    
    }

}
