package POO_ev2;

//import java.io.*;
import java.util.Scanner;
//import java.util.ArrayList;
  
public class principal
{
    public static void main (String[] args)
    {   
        
/*
if (proj!=work)
   {
       work;
   }  

*/
     

        System.out.println("/////VIDEOCLUB GAMES&VIDEOS/////");
        System.out.println("      /////BIENVENID@/////       ");
        System.out.println("t: Despliega todos los productos.");
        System.out.println("p: Despliega todas las películas.");
        System.out.println("v: Despliega todos los videojuegos.");
        System.out.println("s: Checar si una película está rentada.");
        System.out.println("j: Verifica si un videojuego está o no rentado.");
        System.out.println("c: Devuelve la cantidad de películas que están rentadas.");
        System.out.println("x: Indica la cantidad de videojuegos cuya plataforma es Xbox One.");
        System.out.println("u: Termina el programa.");
            Scanner input = new Scanner(System.in);
            String newinput = input.next();

         

            
            input.close();

        switch (newinput) 
        {
            case "T":
            case "t":
            System.out.println("Desplegando todos los productos...");
                    //System.out.println(name.getprod_nombre());

                break;

            case "P":
            case "p":
            System.out.println("peliculas en ");

                break;

            case "V":
            case "v":
            System.out.println("correcto");
            

                break;

            case "S":
            case "s":
            System.out.println("correcto");

                break;

            case "J":
            case "j":
                System.out.println("correcto");
    
                    break;

            case "C":
            case "c":
                System.out.println("correcto");
    
                    break;  

            case "X":
            case "x":
                System.out.println("plataforma: ");

                    break;

            case "U":
            case "u":
                System.out.println("TERMINANDO PROGRAMA");
                System.exit(0);
                    break;


            default:
            System.out.println("COMANDO NO RECONOCIDO, SALIENDO DEL PROGRAMA");
           
                break;
        
           
        }
}



}


