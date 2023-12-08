package TestProyec;

import Model.Card;
import Model.Jugador;
import Model.Mazo;

public class test {
    public static void main(String[] args) {
        Jugador jugador1=new Jugador("jose",18);
        Mazo mazo = new Mazo();

        jugador1.cogeCarta(mazo.sacaCarta());
        System.out.println(jugador1);
        System.out.println(jugador1.calculaPuntos());
        jugador1.cogeCarta(mazo.sacaCarta());
        System.out.println(jugador1);
        jugador1.cogeCarta(mazo.sacaCarta());
        System.out.println(jugador1);
        System.out.println(jugador1.calculaPuntos());
        System.out.println(Jugador.Robot(calculaPuntos()));
    }
}
