package src.Jugador;
import src.Otros.PPT;
import java.util.Scanner;
/**
 *
 * @author emili
 */
public class Jugador {

    PPT Juego = new PPT();
    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;
    private int puntuacionTotal = 0;
    private String nombreJugador;
    int Jugador1;
    int Jugador2;
    private IngresarDatos leerDatos = new IngresarDatos();
    Scanner sc = new Scanner(System.in);
    private int contadorJugadores = 0;

    //Constructor del Objeto
    public Jugador(int partidasGanadas, String nombreJugador, int partidasPerdidas, int puntuacionTotal) {

        this.partidasGanadas = partidasGanadas;
        this.nombreJugador = nombreJugador;
        this.partidasPerdidas = partidasPerdidas;
        this.puntuacionTotal = puntuacionTotal;

    }

    public Jugador() {

    }

    //Retorna los Datos del Jugador
    public String datosJugador() {

        String tmp = ("Jugador: " + nombreJugador + " Partidas Ganadas: " + partidasGanadas + " Partidas Perdidas: " + partidasPerdidas + " Puntuacion Total: " + puntuacionTotal);
        return tmp;

    }

    //Getters y Setters del Jugador
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

    public int getPuntuacionTotal() {
        return puntuacionTotal;
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

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public void listadoJugadores(Jugador[] listadoJugadores) {

        for (int i = 0; i < listadoJugadores.length; i++) {
            if (listadoJugadores[i] != null) {
                System.out.println(i + ". " + listadoJugadores[i].datosJugador());
            } else {
                System.out.println("Sin Jugador");
            }
        }

    }

    public void agregarJugador(Jugador[] listado) {
        String nombreJugador = "";
        nombreJugador = leerDatos.ingresarString("Ingrese el nombre del Jugador");
        listado[contadorJugadores] = new Jugador(0, nombreJugador, 0, 0);
        contadorJugadores++;
    }

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