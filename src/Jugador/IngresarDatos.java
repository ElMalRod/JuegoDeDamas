package src.Jugador;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class IngresarDatos {

    private Scanner sc =  new Scanner(System.in);

    public IngresarDatos(){

    }

    public int ingresarEnteros(String mensajeDesplegar){

        System.out.print(mensajeDesplegar + " ");
        int tmp =  sc.nextInt();
        return tmp;
    }

    public String ingresarString(String mensajeDesplegar){

        System.out.print(mensajeDesplegar + " ");
        String stringDato = sc.next();
        return stringDato;

    }


}