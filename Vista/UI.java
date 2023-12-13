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
        String nombre="";
        boolean valido=false;

        System.out.print(msg+": ");
        nombre=teclado.nextLine();

        do {
            if (nombre.trim().length() > 0 && !nombre.equalsIgnoreCase("IA")){
                 valido=true;
            }else {
                System.out.println("el nombre introducido es invalido, introducelo de nuevo");
                nombre=teclado.nextLine();
            }
        }while (valido!= true);

        return nombre;
    }

}
