package Vista;

import java.util.Scanner;
public class View {
    public class UI {
        public static int readInt(String msg) {
            Scanner teclado = new Scanner(System.in);
            System.out.print(msg + ": ");
            return teclado.nextInt();
        }

        public static String readString(String msg) {
            Scanner teclado = new Scanner(System.in);
            System.out.print(msg + ": ");
            return teclado.nextLine();
        }
    }
}