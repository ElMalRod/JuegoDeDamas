package src.Jugador;

/**
 *
 * @author emili
 */
public class Jugador {

    private int partidasGanadas = 0;
    private int partidasPerdidas = 0;
    private int puntuacionTotal = 0;
    private String nombreJugador;
    private IngresarDatos leerDatos = new IngresarDatos();
    private int contadorJugadores = 0;
    
    //Constructor del Objeto
    public Jugador(int partidasGanadas, String nombreJugador, int partidasPerdidas, int puntuacionTotal){

        this.partidasGanadas = partidasGanadas;
        this.nombreJugador = nombreJugador;
        this.partidasPerdidas = partidasPerdidas;
        this.puntuacionTotal = puntuacionTotal;

    }

    public Jugador(){

    }

    //Retorna los Datos del Jugador
    public String datosJugador(){

        String tmp = ("Jugador: " + nombreJugador + " Partidas Ganadas: " + partidasGanadas + " Partidas Perdidas: " + partidasPerdidas + " Puntuacion Total: " + puntuacionTotal);
        return tmp;
        
    }

    //Getters y Setters del Jugador
    public int getPartidasGanadas(){
        return partidasGanadas;
    }

    public int getPartidasPerdidas(){
        return partidasPerdidas;
    }

    public int getPuntuacionTotal(){
        return puntuacionTotal;
    }

    public String getNombreJugador(){
        return nombreJugador;
    }

    public void setPartidasGanadas( int partidasGanadas){
        this.partidasGanadas = partidasGanadas;
    }

    public void setNombreJugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
    }

    public void setPartidasPerdidas(int partidasPerdidas){
        this.partidasPerdidas = partidasPerdidas;
    }

    public void setPuntuacionTotal(int puntuacionTotal){
        this.puntuacionTotal = puntuacionTotal;
    }
       public void listadoJugadores(Jugador[] listadoJugadores){

        for (int i = 0; i < listadoJugadores.length; i++) {
            if (listadoJugadores[i]!=null) {
                System.out.println(listadoJugadores[i].datosJugador());
            }else{
                System.out.println("Sin Jugador");
            }
        }

    }

    public void agregarJugador(Jugador[] listado){
        String nombreJugador = "";
        nombreJugador = leerDatos.ingresarString("Ingrese el nombre del Jugador");
        listado[contadorJugadores] =  new Jugador(0, nombreJugador, 0, 0);
        contadorJugadores++;
    }


}