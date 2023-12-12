import ControladorMain.Controlador;
import Vista.UI;

public class Main {

    public static void main(String[] args) {
        int edad=0;
        System.out.println("Bienvenido a la Vegas2.0");
        System.out.println("Es juego es para mayores de 18");
        edad= UI.readInt("Si eres mayor de edad pulsa 1 de lo contrario pulse cualquier numero");
        if(edad ==1){
            Controlador.Empezar();
        }

    }

}
