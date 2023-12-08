package Vista;

public class Menu {
    public static int MenuInicial(){
        System.out.println("Escribe 1 para continuar");
        System.out.println("o 2 si no desea jugar en este momento ");
        return UI.readInt("¿Que desea hacer?");
    }
    public static String MenuEdad(){
        return UI.readString("Eres o sois mayores de edad");
    }
    public static String NumeroJugadores(){
        return UI.readString("¿Cuantos jugadores van a jugar?, en caso de ser un solo jugador jugara contra la IA");
    }
    public static int ContinuarParar(){
        return UI.readInt("Introduce 2 si desea mas cartas o 1 si desea parar");
    }
}
