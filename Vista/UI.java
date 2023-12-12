package Vista;
import java.util.Scanner;
public class UI {
    public static int readInt(String msg){
        boolean valido=false;
        int num = -1;

        Scanner teclado = new Scanner(System.in);
        while(!valido) {

            try{
                System.out.print(msg+": ");
                num = teclado.nextInt();
                valido = true;

            }catch(Exception e) {
                teclado.nextLine();
                System.out.print("Por favor introduce un numero: ");
            }
        }
        return num;
    }

    public static String readString(String msg){
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg+": ");
        return teclado.nextLine();
    }

}
