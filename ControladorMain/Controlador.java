package ControladorMain;
import Model.Card;
import Model.Jugador;
import Model.Mazo;
import Vista.Menu;
public class Controlador {
    public static void Empezar(){
        int opcion=0;
        do {
            opcion = Menu.MenuInicial();
            mainController(opcion);

        }while(opcion!=1 &&opcion!=2);
    }
    public static void mainController(int option){

    }
}
