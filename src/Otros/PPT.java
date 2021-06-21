package src.Otros;

import src.Jugador.Jugador;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author emili
 */
public class PPT {
     /**
      *  Variables que Utilizamos para Jugador
      */  
    Scanner teclado = new Scanner(System.in);
    Random Aleatoreo = new Random();
    int seleccionUsuario;
    int seleccionUsuario2;
    
    public PPT() {
       
    }
      /**
      *  Metodo Prieda papel o tijera , indica quien de los jugadoes gana por medio
      *  de numeros random
      */ 
    public void pttingame() {
        seleccionUsuario2 = Aleatoreo.nextInt(3) + 1;
        seleccionUsuario = Aleatoreo.nextInt(3) + 1;
        System.out.print("El usuario perdedor escogio ");
        switch (seleccionUsuario2) {
            case 1:
                System.out.println("Piedra");
                
                switch (seleccionUsuario) {
                    case 1:
                        System.out.println("Empate!");
                        break;
                    case 2:
                        System.out.println("Jugador 2 Gana!");
                        break;
                    case 3:
                        System.out.println("Jugador 1 gana!");
                        break;
                }
                break;

            case 2:
                System.out.println("Papel");
                switch (seleccionUsuario) {
                    case 1:
                        System.out.println("Jugador 1 gana!");
                        break;
                    case 2:
                        System.out.println("Empate!");
                        break;
                    case 3:
                        System.out.println("Jugador 1 gana!");
                        break;
                }
                break;

            case 3:
                System.out.println("Tijera");
                switch (seleccionUsuario) {
                    case 1:
                        System.out.println("Jugador 1 gana!");
                        break;
                    case 2:
                        System.out.println("Jugador 2 gana!");
                        break;
                    case 3:
                        System.out.println("Empate!");
                        break;
                }
                break;
        }
    }
}
