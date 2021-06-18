
package src.Tablero;

/**
 *
 * @author emili
 */
public class Tablero {
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
                   tablero[i][j]=ANSI_WHITE_BACKGROUND  +" "+ ANSI_RESET;
                } else {
                   tablero[i][j]=ANSI_BLUE_BACKGROUND +" "+ANSI_RESET;
                }
            }

        }
    }

    public void ColocarFichas(String tablero[][]) {
      
        char Ficha ='0';
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                   tablero[i][j] = ANSI_WHITE+Ficha+ANSI_RESET;
                    

                }
            }

        }
    }

    public void ColocarFichas2(String tablero[][]) {
        
        char Ficha = 'O';
       
        for (int i = 6; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + (j + 1)) % 2 == 0) {
                    tablero[i][j]=ANSI_BLUE+Ficha+ANSI_RESET;
                }
            }

        }
    }
}