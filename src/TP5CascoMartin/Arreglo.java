
package TP5CascoMartin;

/**
 *
 * @author Martin
 */
public class Arreglo {

    public Arreglo() {
    }
    
    public static void sumarLista(int []arreglo)
    {  int resultado=0;
        
        for(int i=0; i<arreglo.length;i++)
        { resultado+=arreglo[i];
        }
        
        System.out.println("la suma de los valores del arreglo es: "+resultado);
        System.out.println("el promedio es: "+ resultado/arreglo.length);
        
    }
    
    public static int buscarMayor(int [][]arreglo)
    {  int mayor=0;
    
        for(int x=0; x<arreglo.length;x++)
        {          
            for(int y=0; y<arreglo[x].length;y++)
           {  if(mayor<arreglo[x][y])
               mayor=arreglo[x][y];
              
           }
        }
        return(mayor);
    }
    
    public static int cuentaVocales(String cadena)
    { int cantidad=0;
       
       for(int i=0; i<cadena.length();i++)
       { if (cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'|| cadena.charAt(i)=='i'|| cadena.charAt(i)=='o'|| cadena.charAt(i)=='u')
         cantidad++;
        }
    
        return(cantidad);
    }
    
    public static int cuentaCaracter(String cadena, char caracter)
    { int resultado=0;
    
        for(int i=0; i<cadena.length();i++)
        { if(cadena.charAt(i)==caracter)
            resultado++;
        }
        return(resultado);
    }
}
