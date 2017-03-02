/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codificado;


/**
 *
 * @author familia Moreno
 */
public class operacion {
    String contraseña;
    int clave;
    int desea;
    char letras[];
    int valorLetras[];
    int formula[];
    char encripta[];
    public char[] encriptar(String contraseña,int clave,int desea){
        
        if(desea==0){
     char letras[] = contraseña.toCharArray();
     int valorLetras[]= new int[letras.length];
     int formula[]= new int [letras.length];
     char encripta[]= new char [letras.length];
     for(int i=0;i<letras.length;i++)
     {
         switch(letras[i])
         {
             case ' ': valorLetras[i]= 0;
                       break;
             case 'a': valorLetras[i]= 1;
                       break;
             case 'b': valorLetras[i]= 2;
                       break;
             case 'c': valorLetras[i]= 3;
                       break;
             case 'd': valorLetras[i]= 4;
                       break;
             case 'e': valorLetras[i]= 5;
                       break;
             case 'f': valorLetras[i]= 6;
                       break;
             case 'g': valorLetras[i]= 7;
                       break;
             case 'h': valorLetras[i]= 8;
                       break;
             case 'i': valorLetras[i]= 9;
                       break;
             case 'j': valorLetras[i]= 10;
                       break;
             case 'k': valorLetras[i]= 11;
                       break;
             case 'l': valorLetras[i]= 12;
                       break;
             case 'm': valorLetras[i]= 13;
                       break;
             case 'n': valorLetras[i]= 14;
                       break;
             case 'ñ': valorLetras[i]= 15;
                       break;
             case 'o': valorLetras[i]= 16;
                       break;
             case 'p': valorLetras[i]= 17;
                       break;
             case 'q': valorLetras[i]= 18;
                       break;
             case 'r': valorLetras[i]= 19;
                       break;
             case 's': valorLetras[i]= 20;
                       break;
             case 't': valorLetras[i]= 21;
                       break;
             case 'u': valorLetras[i]= 22;
                       break;
             case 'v': valorLetras[i]= 23;
                       break;
             case 'w': valorLetras[i]= 24;
                       break;
             case 'x': valorLetras[i]= 25;
                       break;
             case 'y': valorLetras[i]= 26;
                       break;
             case 'z': valorLetras[i]= 27;
                       break;
         }
     }
     
     for(int i=0;i<valorLetras.length;i++)
     {
        formula[i]=(clave*valorLetras[i])%28;
         
            
     }
     for(int i=0;i<valorLetras.length;i++)
     {
         switch(formula[i])
         {
             case 0: encripta[i]= ' ';
                       break;
             case 1: encripta[i]= 'a';
                       break;
             case 2: encripta[i]= 'b';
                       break;
             case 3: encripta[i]= 'c';
                       break;
             case 4: encripta[i]= 'd';
                       break;
             case 5: encripta[i]= 'e';
                       break;
             case 6: encripta[i]= 'f';
                       break;
             case 7: encripta[i]= 'g';
                       break;
             case 8: encripta[i]= 'h';
                       break;
             case 9: encripta[i]= 'i';
                       break;
             case 10: encripta[i]= 'j';
                       break;
             case 11: encripta[i]= 'k';
                       break;
             case 12: encripta[i]= 'l';
                       break;
             case 13: encripta[i]= 'm';
                       break;
             case 14: encripta[i]= 'n';
                       break;
             case 15: encripta[i]= 'ñ';
                       break;
             case 16: encripta[i]= 'o';
                       break;
             case 17: encripta[i]= 'p';
                       break;
             case 18: encripta[i]= 'q';
                       break;
             case 19: encripta[i]= 'r';
                       break;
             case 20: encripta[i]= 's';
                       break;
             case 21: encripta[i]= 't';
                       break;
             case 22: encripta[i]= 'u';
                       break;
             case 23: encripta[i]= 'v';
                       break;
             case 24: encripta[i]= 'w';
                       break;
             case 25: encripta[i]= 'x';
                       break;
             case 26: encripta[i]= 'y';
                       break;
             case 27: encripta[i]= 'z';
                       break;                                                                                           
         }
     }
     System.out.println("La contraseña codificada");
     for(int i=0;i<valorLetras.length;i++)
     {
         System.out.println(letras[i]+"="+encripta[i]);
     }
    return  encripta;
        }
        else{
            char letras[] = contraseña.toCharArray();
     int valorLetras[]= new int[letras.length];
     int formula[]= new int [letras.length];
     char encripta[]= new char [letras.length];
     for(int i=0;i<letras.length;i++)
     {
         switch(letras[i])
         {
             case ' ': valorLetras[i]= 0;
                       break;
             case 'a': valorLetras[i]= 1;
                       break;
             case 'b': valorLetras[i]= 2;
                       break;
             case 'c': valorLetras[i]= 3;
                       break;
             case 'd': valorLetras[i]= 4;
                       break;
             case 'e': valorLetras[i]= 5;
                       break;
             case 'f': valorLetras[i]= 6;
                       break;
             case 'g': valorLetras[i]= 7;
                       break;
             case 'h': valorLetras[i]= 8;
                       break;
             case 'i': valorLetras[i]= 9;
                       break;
             case 'j': valorLetras[i]= 10;
                       break;
             case 'k': valorLetras[i]= 11;
                       break;
             case 'l': valorLetras[i]= 12;
                       break;
             case 'm': valorLetras[i]= 13;
                       break;
             case 'n': valorLetras[i]= 14;
                       break;
             case 'ñ': valorLetras[i]= 15;
                       break;
             case 'o': valorLetras[i]= 16;
                       break;
             case 'p': valorLetras[i]= 17;
                       break;
             case 'q': valorLetras[i]= 18;
                       break;
             case 'r': valorLetras[i]= 19;
                       break;
             case 's': valorLetras[i]= 20;
                       break;
             case 't': valorLetras[i]= 21;
                       break;
             case 'u': valorLetras[i]= 22;
                       break;
             case 'v': valorLetras[i]= 23;
                       break;
             case 'w': valorLetras[i]= 24;
                       break;
             case 'x': valorLetras[i]= 25;
                       break;
             case 'y': valorLetras[i]= 26;
                       break;
             case 'z': valorLetras[i]= 27;
                       break;
         }
     }
     for(int i=0;i<valorLetras.length;i++)
     {
         formula[i]=(28*(clave-1)+valorLetras[i])/clave;
            
     }
     for(int i=0;i<valorLetras.length;i++)
     {
         switch(formula[i])
         {
             case 0: encripta[i]= ' ';
                       break;
             case 1: encripta[i]= 'a';
                       break;
             case 2: encripta[i]= 'b';
                       break;
             case 3: encripta[i]= 'c';
                       break;
             case 4: encripta[i]= 'd';
                       break;
             case 5: encripta[i]= 'e';
                       break;
             case 6: encripta[i]= 'f';
                       break;
             case 7: encripta[i]= 'g';
                       break;
             case 8: encripta[i]= 'h';
                       break;
             case 9: encripta[i]= 'i';
                       break;
             case 10: encripta[i]= 'j';
                       break;
             case 11: encripta[i]= 'k';
                       break;
             case 12: encripta[i]= 'l';
                       break;
             case 13: encripta[i]= 'm';
                       break;
             case 14: encripta[i]= 'n';
                       break;
             case 15: encripta[i]= 'ñ';
                       break;
             case 16: encripta[i]= 'o';
                       break;
             case 17: encripta[i]= 'p';
                       break;
             case 18: encripta[i]= 'q';
                       break;
             case 19: encripta[i]= 'r';
                       break;
             case 20: encripta[i]= 's';
                       break;
             case 21: encripta[i]= 't';
                       break;
             case 22: encripta[i]= 'u';
                       break;
             case 23: encripta[i]= 'v';
                       break;
             case 24: encripta[i]= 'w';
                       break;
             case 25: encripta[i]= 'x';
                       break;
             case 26: encripta[i]= 'y';
                       break;
             case 27: encripta[i]= 'z';
                       break;                                                                                           
         }
     }
     System.out.println("La contraseña codificada");
     for(int i=0;i<valorLetras.length;i++)
     {
         System.out.println(letras[i]+"="+encripta[i]);
     }
    return  encripta;
                
        }
    }
}
