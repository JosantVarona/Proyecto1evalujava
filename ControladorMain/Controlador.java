package ControladorMain;

import Model.Card;
import Model.Jugador;
import Model.Mazo;
import Vista.Menu;
import Vista.UI;

public class Controlador {
    public static void Empezar() {
        Mazo mazo=new Mazo();
        int opcion = 0;
        do {
            System.out.println("1- Jugador VS IA");
            System.out.println("2- Jugador VS Jugador");
            System.out.println("3- Para tres jugadores");
            System.out.println("4- Para cuatro jugadores");
            System.out.println("0- Salir");
            opcion = UI.readInt("Introduce opción para continuar");
            mainController(opcion,mazo);

        } while (opcion != 0);
    }

    public static void mainController(int option,Mazo mazo) {

        switch (option) {
            case 1://Este modo es contra la IA
                String nombre=UI.readString("Introduce el nombre del usuario");
                Jugador j1=new Jugador(nombre);
                j1.cogerCartas(2,mazo);
                System.out.println(j1);
                //Continua para ver si quieres pedir o plantarse
                ContinuarJuego(j1,mazo);
                //Puntuación de jugador
                System.out.println("Puntos usuario: "+j1.calculaPuntos());

                //Metodo para la IA
                JugarIA(mazo,j1.calculaPuntos());

                break;
            case 2://Este modo es uno contra uno
                String nombre1=UI.readString("Introduce el nombre del usuario");
                Jugador jm1=new Jugador(nombre1);
                jm1.cogerCartas(2,mazo);
                System.out.println(jm1);
                ContinuarJuego(jm1,mazo);
                System.out.println("Puntos usuario: "+jm1.calculaPuntos());

                String nombre2=UI.readString("Introduce el nombre del usuario");
                Jugador jm2=new Jugador(nombre2);
                jm2.cogerCartas(2,mazo);
                System.out.println(jm2);
                ContinuarJuego(jm2,mazo);
                System.out.println("Puntos usuario: "+jm2.calculaPuntos());

                break;
            case 3://Este es con tres jugadores que gana el que sin pasarse de 21 tenga mayor puntación
                String nombret=UI.readString("Introduce el nombre del usuario");
                Jugador jt1=new Jugador(nombret);
                jt1.cogerCartas(2,mazo);
                System.out.println(jt1);

                ContinuarJuego(jt1,mazo);

                System.out.println("Puntos usuario: "+jt1.calculaPuntos());

                String nombret2=UI.readString("Introduce el nombre del usuario");
                Jugador jt2=new Jugador(nombret2);
                jt2.cogerCartas(2,mazo);
                System.out.println(jt2);

                ContinuarJuego(jt2,mazo);

                System.out.println("Puntos usuario: "+jt2.calculaPuntos());

                String nombret3=UI.readString("Introduce el nombre del usuario");
                Jugador jt3=new Jugador(nombret3);
                jt3.cogerCartas(2,mazo);
                System.out.println(jt3);

                ContinuarJuego(jt3,mazo);

                System.out.println("Puntos usuario: "+jt3.calculaPuntos());
                break;
            case 4://Este es con tres jugadores que gana el que sin pasarse de 21 tenga mayor puntación
                String nombrec=UI.readString("Introduce el nombre del usuario");
                Jugador jc1=new Jugador(nombrec);
                jc1.cogerCartas(2,mazo);
                System.out.println(jc1);

                ContinuarJuego(jc1,mazo);

                System.out.println("Puntos usuario: "+jc1.calculaPuntos());

                String nombrec2=UI.readString("Introduce el nombre del usuario");
                Jugador jc2=new Jugador(nombrec2);
                jc1.cogerCartas(2,mazo);
                System.out.println(jc2);

                ContinuarJuego(jc2,mazo);

                System.out.println("Puntos usuario: "+jc2.calculaPuntos());

                String nombrec3=UI.readString("Introduce el nombre del usuario");
                Jugador jc3=new Jugador(nombrec3);
                jc1.cogerCartas(2,mazo);
                System.out.println(jc3);

                ContinuarJuego(jc3,mazo);

                System.out.println("Puntos usuario: "+jc3.calculaPuntos());

                String nombrec4=UI.readString("Introduce el nombre del usuario");
                Jugador jc4=new Jugador(nombrec4);
                jc4.cogerCartas(2,mazo);
                System.out.println(jc4);

                ContinuarJuego(jc4,mazo);

                System.out.println("Puntos usuario: "+jc4.calculaPuntos());
        }

    }

    public static void ContinuarJuego(Jugador j,Mazo mazo) {
        int opcion = 0;
        do {
            System.out.println("1- Pedir carta");
            System.out.println("2- Plantarse");
            System.out.println("****************************************************");
            System.out.println("Tus puntos son "+j.calculaPuntos());
            System.out.println("****************************************************");
            opcion = UI.readInt("Introduce opción para continuar");

            switch (opcion) {
                case 1:
                    j.cogerCartas(1,mazo);
                    if(j!=null) {
                        System.out.println(j);
                    }
                    break;
            }

        } while (opcion != 2&& j.calculaPuntos()<21);

        if(j.calculaPuntos()>21) {
            System.out.println("¡Has perdido! :-( ");
        }
    }
    public static int[] Recuento(int participantes){
        int[] puntuciones=new int[participantes];

        return puntuciones;
    }
    public static void Ganador(int[] ganador){

    }

    public static void JugarIA(Mazo mazo,int sumaJugador) {
        boolean opcion = false;

        int puntuacion=0;
        Jugador ia=new Jugador("IA");
        ia.cogerCartas(2,mazo);
        puntuacion=ia.calculaPuntos();
        do {

            if(sumaJugador<21){

                if (puntuacion<=sumaJugador){
                    ia.cogerCartas(1,mazo);
                    puntuacion=ia.calculaPuntos();

                }else{
                    opcion=true;
                }

            }else{
                opcion=true;
            }



        } while (!opcion);

        System.out.println(ia);
        System.out.println("la puntuacion de la IA es: "+puntuacion);
    }




}
