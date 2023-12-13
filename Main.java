import ControladorMain.Controlador;
import Vista.UI;

public class Main {

    public static void main(String[] args) {
        int edad=0;
        System.out.println("       ,gggg,             ,ggg,        ,gg,          ,ggg,         ,gg   ,ggggggg,     ,gg,                 ,ggg,        ,gg,   \n" +
                "      d8\" \"8I            dP\"\"8I       i8\"\"8i        dP\"\"Y8a       ,8P  ,dP\"\"\"\"\"\"Y8b   i8\"\"8i               dP\"\"8I       i8\"\"8i  \n" +
                "      88  ,dP           dP   88       `8,,8'        Yb, `88       d8'  d8'    a  Y8   `8,,8'              dP   88       `8,,8'  \n" +
                "   8888888P\"           dP    88        `88'          `\"  88       88   88     \"Y8P'    `Y88aaad8         dP    88        `88'   \n" +
                "      88              ,8'    88        dP\"8,             88       88   `8baaaa          d8\"\"\"\"Y8,       ,8'    88        dP\"8,  \n" +
                "      88              d88888888       dP' `8a            I8       8I  ,d8P\"\"\"\"         ,8P     8b       d88888888       dP' `8a \n" +
                " ,aa,_88        __   ,8\"     88      dP'   `Yb           `8,     ,8'  d8\"              dP      Y8 __   ,8\"     88      dP'   `Yb\n" +
                "dP\" \"88P       dP\"  ,8P      Y8  _ ,dP'     I8            Y8,   ,8P   Y8,          _ ,dP'      I8dP\"  ,8P      Y8  _ ,dP'     I8\n" +
                "Yb,_,d88b,,_   Yb,_,dP       `8b,\"888,,____,dP             Yb,_,dP    `Yba,,_____, \"888,,_____,dPYb,_,dP       `8b,\"888,,____,dP\n" +
                " \"Y8P\"  \"Y88888 \"Y8P\"         `Y8a8P\"Y88888P\"               \"Y8P\"       `\"Y8888888 a8P\"Y888888P\"  \"Y8P\"         `Y8a8P\"Y88888P\" ");
        System.out.println("Bienvenido a la Vegas2.0");
        System.out.println("Es juego es para mayores de 18");
        edad= UI.readInt("Si eres mayor de edad pulsa 1 de lo contrario pulse cualquier numero");
        if(edad ==1){
            Controlador.Empezar();
        }

    }

}
