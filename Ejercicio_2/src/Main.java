import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Juego j = new Juego();
        RevolverAgua ra = new RevolverAgua();
        ra.llenarRevolver();

        for (int i = 0; i < 3; i++) {
            Jugador ju = new Jugador();
            System.out.println("Ingrese el id: ");
            ju.setNumJ(leer.nextInt());
            System.out.println("Ingrese el nombre del jugador: ");
            ju.setNombre(leer.next());
            jugadores.add(ju);
        }
        j.llenarJuego(jugadores, ra);
        j.ronda();
    }
}