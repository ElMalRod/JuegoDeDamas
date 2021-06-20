
package src.juegodamas;
import src.Tablero.Tablero;
import src.Jugador.Jugador;
import src.Otros.PPT;
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
    String tablero[][] = new String[15][15];
    Tablero Tab = new Tablero();
    Jugador jugador = new Jugador();
    PPT ppt = new PPT();
    Jugador[] listadoJugadores = new Jugador[5];
    
    int X = 0, Y = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Principal JD = new Principal();

    }

    public Principal() {
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
                    jugador.agregarJugador(listadoJugadores);
                    break;
                case 2:
                    jugador.seleccionjugador(listadoJugadores);
                    Tab.RellenarTablero(tablero);
                    Tab.ColocarFichas(tablero);
                    Tab.ColocarFichas2(tablero);
                    Tab.ImprimirTablero(tablero);
                    //PiedraPapel
                    ppt.pttingame();
                    while (Tab.getJugadorFichas() != 0 || Tab.getJugadorFichas2() != 0) {
                        System.out.println("Ingrese la ficha que desea mover: Jugador 1");
                        System.out.println("Posicion X");
                        X = sc.nextInt();
                        System.out.println("Posicion Y");
                        Y = sc.nextInt();
                        Tab.MoverFichas(X, Y, tablero);
                        System.out.println("Ingrese la ficha que desea mover: Jugador 2");
                        System.out.println("Posicion X");
                        X = sc.nextInt();
                        System.out.println("Posicion Y");
                        Y = sc.nextInt();
                        Tab.MoverFichas2(X, Y, tablero);
                        if (Tab.getJugadorFichas() == 0) {
                            System.out.println("GANA EL JUGADOR 1");
                            listadoJugadores[jugador.getJugador1()].setPartidasPerdidas(1);
                        }
                        if (Tab.getJugadorFichas() == 0) {
                            System.out.println("GANA EL JUGADOR 2");
                            listadoJugadores[jugador.getJugador2()].setPartidasPerdidas(1);
                        }

                    }

                case 3:
                    jugador.listadoJugadores(listadoJugadores);
                    break;
                case 4:
                    ppt.pttingame();
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

    }
}