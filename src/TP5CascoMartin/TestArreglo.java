
package TP5CascoMartin;

import java.util.Scanner;

/**
*
* @author Martin
*/
public class TestArreglo {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    Arreglo arr=new Arreglo();

    int arreglo[]={1,8,9,10,15,35,45,50,7,60};
    int matriz[][]={{4,5,8,9,2},{48,23,46},{100,23},{32,45,85,65,27,62}};
    String cadena, pausa, caracter;
    Arreglo.sumarLista(arreglo);
    System.out.println("el numero mayor de la matriz es: "+Arreglo.buscarMayor(matriz));  
    pausa=teclado.nextLine();

    System.out.println("ingrese una frase");
    cadena=teclado.nextLine();

    System.out.println("La cantidad de vocales en la frase es: "+Arreglo.cuentaVocales(cadena));
    pausa=teclado.nextLine();

    System.out.println("ingresa un caracter para saber cuantas veces aparece en la frace");
    caracter=teclado.nextLine();
    System.out.println("el caracter ingresado aparece: "+Arreglo.cuentaCaracter(cadena, caracter.charAt(0))+" veces");
}

}
