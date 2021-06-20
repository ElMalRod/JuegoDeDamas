
package src.Tablero;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Tablero {
    int JugadorFichas = 20;
    int JugadorFichas2 = 20;
    Scanner sc = new Scanner(System.in);
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Tablero() {

    }

    public void ImprimirTablero(String tablero[][]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

    }

    public void RellenarTablero(String tablero[][]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i + j) % 2) == 0) {
                    tablero[i][j] = ANSI_WHITE_BACKGROUND + " " + ANSI_RESET;
                } else {
                    tablero[i][j] = ANSI_BLUE_BACKGROUND + " " + ANSI_RESET;
                }
            }

        }
    }

    public void ColocarFichas(String tablero[][]) {

        String Ficha = "X";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                    tablero[i][j] = Ficha;

                }
            }

        }
    }

    public void ColocarFichas2(String tablero[][]) {

        String Ficha = "O";

        for (int i = 6; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                    tablero[i][j] = Ficha;
                }
            }

        }
    }

    public void MoverFichas(int PosicionX, int PosicionY, String tablero[][]) {
        if (tablero[PosicionX][PosicionY] == "X") {
            System.out.println("Existente Jugador 1 - Fichas: " + JugadorFichas);
            tablero[PosicionX][PosicionY] = ANSI_BLUE + " ";
            System.out.println("Ingrese la posicion X");
            PosicionX = sc.nextInt();
            System.out.println("Ingrese la posicion Y");
            PosicionY = sc.nextInt();
            if (tablero[PosicionX][PosicionY] == "O") {
            System.out.println("Jugador 1 comio ficha a Jugador 2");
            JugadorFichas2--;
        }
            tablero[PosicionX][PosicionY] = "X";
            ImprimirTablero(tablero);

        } else if (tablero[PosicionX][PosicionY] != "X") {
            System.out.println("No Existente");
        }
        
    }

    public void MoverFichas2(int PosicionX, int PosicionY, String tablero[][]) {
        if (tablero[PosicionX][PosicionY] == "O") {
            System.out.println("Existente Jugador 2 - Fichas: "+JugadorFichas2);
            tablero[PosicionX][PosicionY] = ANSI_BLUE + " ";
            System.out.println("Ingrese la posicion X");
            PosicionX = sc.nextInt();
            System.out.println("Ingrese la posicion Y");
            PosicionY = sc.nextInt();
            if (tablero[PosicionX][PosicionY] == "X") {
            System.out.println("Jugador 2 comio ficha a Jugador 1");
            JugadorFichas--;
        }
            tablero[PosicionX][PosicionY] = "O";
            ImprimirTablero(tablero);
        } else if (tablero[PosicionX][PosicionY] != "O") {
            System.out.println("No Existente");
        }
        
    }

    public int getJugadorFichas() {
        return JugadorFichas;
    }

    public int getJugadorFichas2() {
        return JugadorFichas2;
    }
    

}
