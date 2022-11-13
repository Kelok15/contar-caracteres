/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelok;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Win7
 */
public class Kelok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lectoor=new Scanner (System. in) ;
       String cadena = "";
       char [] Arraycadena;
       char caracter;
       int contador = 0;
       cadena = JOptionPane.showInputDialog("hola que tal");
       cadena = lectoor.nextLine();
       Arraycadena = cadena.toCharArray();
       for (int i = 0; i < Arraycadena.length; i++){
           caracter = Arraycadena[i];
           for (int k = 0; k < Arraycadena.length; k++){
               if (Arraycadena[k] == caracter) {
                   contador++;
               }
               
           }
               System.out.println("La " + Arraycadena[i] + " sale " + contador + " vez");
           
           contador = 0;
       } 
    } 
}
