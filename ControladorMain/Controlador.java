package ControladorMain;

import Model.Card;
import Model.Jugador;
import Model.Mazo;
import Vista.Menu;
import Vista.UI;

public class Controlador {
    public static void Empezar() {
        Mazo mazo = new Mazo();
        int opcion = 0;
        //Menu
        do {

            System.out.println("1- Jugador VS IA");
            System.out.println("2- Jugador VS Jugador");
            System.out.println("3- Para tres jugadores");
            System.out.println("4- Para cuatro jugadores");
            System.out.println("0- Salir");
            opcion = UI.readInt("Introduce opción para continuar");
            mainController(opcion, mazo);

        } while (opcion != 0);
    }

    public static void mainController(int option, Mazo mazo) {
        Jugador[] jugadores = new Jugador[4];

        switch (option) {
            case 0:
                System.out.println("Gracias vuelva cuando pueda ");
                break;
            case 1://Este modo es contra la IA
                String nombre = UI.readString("Introduce el nombre del usuario");
                Jugador j1 = new Jugador(nombre);
                j1.cogerCartas(2, mazo);
                System.out.println(j1);
                //Continua para ver si quieres pedir o plantarse
                ContinuarJuego(j1, mazo);
                j1.setPuntos(j1.calculaPuntos());
                //Puntuación de jugador
                System.out.println("***************************************");
                System.out.println("Puntos usuario " + nombre + " " + j1.getPuntos());
                System.out.println("***************************************");
                jugadores[0] = j1;

                //Metodo para la IA
                Jugador ia = new Jugador("ia");
                JugarIA(mazo, ia, j1.calculaPuntos());
                jugadores[1] = ia;


                winner(jugadores);


                break;
            case 2://Este modo es uno contra uno
                String nombre1 = UI.readString("Introduce el nombre del usuario");
                Jugador jm1 = new Jugador(nombre1);
                jm1.cogerCartas(2, mazo);
                System.out.println(jm1);
                ContinuarJuego(jm1, mazo);
                jm1.setPuntos(jm1.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario " + nombre1 + " " + jm1.calculaPuntos());
                System.out.println("***************************************");

                jugadores[0] = jm1;


                String nombre2 = UI.readString("Introduce el nombre del usuario");
                Jugador jm2 = new Jugador(nombre2);
                jm2.cogerCartas(2, mazo);
                System.out.println(jm2);
                ContinuarJuego(jm2, mazo);
                jm2.setPuntos(jm2.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jm2.calculaPuntos());
                System.out.println("***************************************");
                jugadores[1] = jm2;


                winner(jugadores);

                break;
            case 3://Este es con tres jugadores que gana el que sin pasarse de 21 tenga mayor puntación
                String nombret = UI.readString("Introduce el nombre del usuario");
                Jugador jt1 = new Jugador(nombret);
                jt1.cogerCartas(2, mazo);
                System.out.println(jt1);

                ContinuarJuego(jt1, mazo);
                jt1.setPuntos(jt1.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jt1.calculaPuntos());
                System.out.println("***************************************");
                jugadores[0] = jt1;

                String nombret2 = UI.readString("Introduce el nombre del usuario");
                Jugador jt2 = new Jugador(nombret2);
                jt2.cogerCartas(2, mazo);
                System.out.println(jt2);

                ContinuarJuego(jt2, mazo);
                jt2.setPuntos(jt2.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jt2.calculaPuntos());
                System.out.println("***************************************");
                jugadores[1] = jt2;


                String nombret3 = UI.readString("Introduce el nombre del usuario");
                Jugador jt3 = new Jugador(nombret3);
                jt3.cogerCartas(2, mazo);
                System.out.println(jt3);

                ContinuarJuego(jt3, mazo);
                jt3.setPuntos(jt3.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jt3.calculaPuntos());
                System.out.println("***************************************");
                jugadores[2] = jt3;

                winner(jugadores);
                break;
            case 4://Este es con tres jugadores que gana el que sin pasarse de 21 tenga mayor puntación
                String nombrec = UI.readString("Introduce el nombre del usuario");
                Jugador jc1 = new Jugador(nombrec);
                jc1.cogerCartas(2, mazo);
                System.out.println(jc1);

                ContinuarJuego(jc1, mazo);
                jc1.setPuntos(jc1.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jc1.calculaPuntos());
                System.out.println("***************************************");
                jugadores[0] = jc1;


                String nombrec2 = UI.readString("Introduce el nombre del usuario");
                Jugador jc2 = new Jugador(nombrec2);
                jc2.cogerCartas(2, mazo);
                System.out.println(jc2);

                ContinuarJuego(jc2, mazo);
                jc2.setPuntos(jc2.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jc2.calculaPuntos());
                System.out.println("***************************************");
                jugadores[1] = jc2;


                String nombrec3 = UI.readString("Introduce el nombre del usuario");
                Jugador jc3 = new Jugador(nombrec3);
                jc3.cogerCartas(2, mazo);
                System.out.println(jc3);

                ContinuarJuego(jc3, mazo);
                jc3.setPuntos(jc3.calculaPuntos());
                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jc3.calculaPuntos());
                System.out.println("***************************************");
                jugadores[2] = jc3;


                String nombrec4 = UI.readString("Introduce el nombre del usuario");
                Jugador jc4 = new Jugador(nombrec4);
                jc4.cogerCartas(2, mazo);
                System.out.println(jc4);

                ContinuarJuego(jc4, mazo);
                jc4.setPuntos(jc4.calculaPuntos());

                System.out.println("***************************************");
                System.out.println("Puntos usuario: " + jc4.calculaPuntos());
                System.out.println("***************************************");
                jugadores[3] = jc4;

                winner(jugadores);

                break;
            default:
                System.out.println("Introduce unas de las opciones propuestas ");
        }

    }

    //esto nos dice la ganador de la partida
    public static void winner(Jugador[] jugadores) {
        Jugador ganador = new Jugador();
        int aux = 0;


        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getPuntos() <= 21 && jugadores[i].getPuntos() > aux) {

                    aux = jugadores[i].getPuntos();
                    ganador = jugadores[i];
                }
            }

        }

        System.out.println("El vencedor es "+ ganador.getNombre());
        System.out.println("**********************************************************");
    }

    //Menu para que el usuario decida si seguir o plantarse
    public static void ContinuarJuego(Jugador j, Mazo mazo) {
        int opcion = 0;
        do {
            System.out.println("1- Pedir carta");
            System.out.println("2- Plantarse");
            System.out.println("****************************************************");
            System.out.println("Tus puntos son " + j.calculaPuntos());
            System.out.println("****************************************************");
            opcion = UI.readInt("Introduce opción para continuar");

            switch (opcion) {
                case 1:
                    j.cogerCartas(1, mazo);
                    System.out.println(j.getCards());
                    break;
            }

        } while (opcion != 2);

        if (j.calculaPuntos() > 21) {
            System.out.println("¡Has perdido! :-( ");
        }
    }


    //IA
    public static void JugarIA(Mazo mazo, Jugador ia, int sumaJugador) {
        boolean opcion = false;

        int puntuacion = 0;

        ia.cogerCartas(2, mazo);
        puntuacion = ia.calculaPuntos();
        System.out.println(puntuacion);
        do {

            if (sumaJugador < 21) {

                if (puntuacion <= sumaJugador) {
                    ia.cogerCartas(1, mazo);
                    puntuacion = ia.calculaPuntos();

                } else {
                    opcion = true;
                }

            } else {
                opcion = true;
            }


        } while (!opcion);

        ia.setPuntos(puntuacion);
        System.out.println(ia);
        System.out.println("***************************************");
        System.out.println("la puntuacion de la IA es: " + puntuacion);
        System.out.println("***************************************");
    }


}
