/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codificado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author familia Moreno
 */
public class Codificado{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la clave");
        int clave= Integer.parseInt(in.readLine());
        String contraseña;
        System.out.println("Ingrese la contrasea");
        contraseña=in.readLine();
        int desea=2;
        System.out.println("Desea encriptar o desencriptar Para encriptar digite 0 para desencriptar digite 1");
        desea=Integer.parseInt(in.readLine());
     
        //Cree el objeto de la clase
        operacion encriptar1= new operacion();
        //Invoco el metodo que hay en el objeto
        
        encriptar1.encriptar(contraseña, clave, desea);
        //Invoco el metodo y los parametros para que trabaje en la clase
        
        

   }
}
