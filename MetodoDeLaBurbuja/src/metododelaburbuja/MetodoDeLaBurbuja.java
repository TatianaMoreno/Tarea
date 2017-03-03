/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoDeLaBurbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Astrid Barbosa y Tatiana Moreno 
 * @version 28/02/17
 */
public class MetodoDeLaBurbuja {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  throws IOException{
        // TODO code application logic her  
    // se creo por teclado un objeto 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        // se crea el rango o tamaño del arreglo 
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
        int ordenado = Integer.parseInt(in.readLine());
        //se crea el arreglo 
        int arreglo[] = new int[ordenado];
        System.out.println();
        //se lee el arreglo
        int j = 0;
        for (int i = 0 ; i < arreglo.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arreglo[i] = Integer.parseInt(in.readLine());
        }
        Metodoburbuja(arreglo);
    }
 
    static void Metodoburbuja(int numeros[]) {
       // TODO code application logic he
        int ordenado;//guarda las variables 
        //se creo un for para recorrer el arreglo 
        for(int i=0;i<numeros.length;i++){
            // este for hace las comparaciones del arreglo
            for (int j=0;j<numeros.length-1;j++){
              //se comparan los numeros del vector
                if (numeros[j]>numeros[j+1]){ 
                    //ahora recorre el vector y lo cambia de posicion
                    ordenado=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=ordenado;
                }
            }
        }
        // se imprime el arreglo ya organizado 
         for(int i=0;i<numeros.length;i++){
         System.out.println(numeros[i]);
    }

    

    }
    }
    
