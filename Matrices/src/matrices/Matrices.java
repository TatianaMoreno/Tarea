/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * @author Astrid Barbosa y Tatiana Moreno 
 * @version 28/02/17
 */
public class Matrices {
    /**
     * @param args the command line arguments
     * @throws matrices.IOException
     */
     static public void main(String[]args)throws IOException {
       BufferedReader oa= new BufferedReader(new InputStreamReader(System.in));
       //se crea los valores de filas y columnas de las matrices a multiplicar 
       System.out.println("ingresar numero de filas de matriz uno:");
       int filas1=Integer.parseInt(oa.readLine());
       System.out.println("ingrese numero columnas de matriz dos");
       int columna1=Integer.parseInt(oa.readLine());
       int filas2=filas1-1;
       // se hace la igualdad de las matrices para poderlas multiplicar 
             if(filas2!=filas1){
            System.out.println("ingrese numero de filas de matriz dos ");
            filas2=Integer.parseInt(oa.readLine());
       }
     System.out.println("ingrese numero columnas de matriz uno ");
     int columnas=Integer.parseInt(oa.readLine());
     int [][] matriz1=new int[filas1][columna1];
     int [][] matriz2=new int[filas2][columnas];
     int [][] resp=new int[filas1][columnas];
         for(int i=0;i<filas1;i++){
             for(int j=0;j<columna1;j++){
              System.out.println("ingrese un numero:");
              matriz1[i][j]=Integer.parseInt(oa.readLine());
            }
        }
     for(int i=0;i<filas2;i++){
          for(int j=0;j<columnas;j++){
          System.out.println("ingrese un numero:");
          matriz2[i][j]=Integer.parseInt(oa.readLine());
        }
    }
         int[][] resultado = multiplica(matriz1,matriz2,filas1,columna1,columnas);

      for(int i=0;i<filas1;i++){
            for(int j=0;j<columnas;j++){
            System.out.println(resultado[i][j]+" ");
          }
         System.out.println();
      }
}
public static int[][]multiplica(int a[][],int b[][],int c,int d ,int e){
int resultado[][]=new int[c][e];
     for(int i=0;i<c;i++){
         for(int j=0;j<e;j++){
             for(int k=0;k<d;k++){
             resultado[i][j]=a[i][k]*b[k][j];
            }
        }
    }
return resultado;

}
}
