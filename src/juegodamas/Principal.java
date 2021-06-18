/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.juegodamas;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Principal JD = new Principal();
        
    }
    public Principal(){
    Menu();
    }

    /*Metodo Menu contiene la mayor parte de los metodos y es lo primero que
    visualiza el usuario*/
    public void Menu() {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ingresar Jugador");
            System.out.println("2. Iniciar Partida");
            System.out.println("3. Resumen de Partidas");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

    }

}
