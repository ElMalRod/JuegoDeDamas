package src.Jugador;
import src.Otros.PPT;
import java.util.Scanner;
/**
 *
 * @author emili
 */
public class Jugador {
  /**
   *  Variables que Utilizamos para Jugador
   */  
    PPT Juego = new PPT();
    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;
    private String nombreJugador;
    int Jugador1;
    int Jugador2;
    private IngresarDatos leerDatos = new IngresarDatos();
    Scanner sc = new Scanner(System.in);
    private int contadorJugadores = 0;

     /**
      *  Constructor de los Objetos de jugador
      */  
    public Jugador(int partidasGanadas, String nombreJugador, int partidasPerdidas) {

        this.partidasGanadas = partidasGanadas;
        this.nombreJugador = nombreJugador;
        this.partidasPerdidas = partidasPerdidas;

    }

    public Jugador() {

    }

    /**
      *  Retorna los Objetos de jugador
      */  
    public String datosJugador() {

        String tmp = ("Jugador: " + nombreJugador + " Partidas Ganadas: " + partidasGanadas + " Partidas Perdidas: " + partidasPerdidas);
        return tmp;

    }
     /**
      * Getters y Setters del Jugador
      */
    public int getJugador1() {
        return Jugador1;
    }

    public int getJugador2() {
        return Jugador2;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    /**
      * Metodo listado de jugador , Imprime los jugadores ingresados en el Vector
      */

    public void listadoJugadores(Jugador[] listadoJugadores) {

        for (int i = 0; i < listadoJugadores.length; i++) {
            if (listadoJugadores[i] != null) {
                System.out.println((i + 1) + ". " + listadoJugadores[i].datosJugador());
            } else {
                System.out.println(i + " ------Sin Jugador------");
            }
        }

    }
    /**
      * Metodo para Agregar jugador , los agrega a el vector Jugador
      */

    public void agregarJugador(Jugador[] listado) {
        String nombreJugador = "";
        nombreJugador = leerDatos.ingresarString("Ingrese el nombre del Jugador");
        listado[contadorJugadores] = new Jugador(0, nombreJugador, 0);
        contadorJugadores++;
    }

     /**
      * Metodo que recorre el arreglo para la seleccion de los 2 jugadores en Damas Chinas
      */

    public void seleccionjugador(Jugador[] listadoJugadores) {
        int jugador1;
        int jugador2;
        for (int i = 0; i < listadoJugadores.length; i++) {
            if (listadoJugadores[i] != null) {
                System.out.println(i + ". " + listadoJugadores[i].getNombreJugador());
            }
        }
        System.out.println("----Seleccione a Jugador 1-----");
        jugador1 = sc.nextInt();
        System.out.println("----Seleccione a Jugador 2-----");
        jugador2 = sc.nextInt();
        for (int i = 0; i < listadoJugadores.length; i++) {
            if (jugador1 == i) {
                System.out.println("selecciono " + listadoJugadores[i].getNombreJugador() + " como Jugador 1");
                Jugador1 = jugador1;

            }
        }
        for (int i = 0; i < listadoJugadores.length; i++) {
            if (jugador2 == i) {
                System.out.println("selecciono " + listadoJugadores[i].getNombreJugador() + " como Jugador 2");
                Jugador2 = jugador2;
            }
        }
        Juego.pttingame();

    }

}