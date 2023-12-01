package Model;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Card[] card;
    public Jugador(String nombre , int tam){
        this.nombre=nombre;

        this.card=new Card[tam];
    }
    public Jugador(){
        this("null",0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", card=" + Arrays.toString(card) +
                '}';
    }
}
