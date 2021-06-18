
package src.Tablero;

/**
 *
 * @author emili
 */
public class Tablero {

    public Tablero() {

    }

    public void ImprimirTablero(char tablero[][]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

    }

    public void RellenarTablero(char tablero[][]) {
        char Blanco = 9723;
        char Negro = 9724;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i + j) % 2) == 0) {
                    tablero[i][j] = '#';
                } else {
                    tablero[i][j] = '#';
                }
            }

        }
    }

    public void ColocarFichas(char tablero[][]) {
        //Color Azul = new Color("\033[34m");
        char Ficha = 9770;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                    tablero[i][j] = Ficha;

                }
            }

        }
    }

    public void ColocarFichas2(char tablero[][]) {
        //Color Rojo = new Color("\033[31m");
        char Ficha = 9770;
        for (int i = 6; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                    tablero[i][j] = Ficha;
                }
            }

        }
    }
}