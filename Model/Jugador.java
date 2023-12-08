package Model;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Card[] card;
    private int edad;
    public Jugador(String nombre ,int edad){
        this.nombre=nombre;

        this.card=new Card[20];
        this.edad=edad;
    }
    public Jugador(){
        this("null",0);
    }
    public void cogeCarta(Card carta){
        boolean insertada = false;
        for(int i=0;i<card.length&&!insertada;i++){
            if(card[i]==null){
                card[i]=carta;
                insertada=true;
            }
        }

    }
    public int calculaPuntos(){
        int puntuacion =0;
        if (card.length >=+ 0) {
            for(int i=0;i<card.length;i++){
                if(card[i]!=null){
                    if(card[i].getValue()>=10) {
                        puntuacion += 10;
                    } else {
                        puntuacion += card[i].getValue();
                    }
                    if(puntuacion<21){
                        if(card[i].getValue()==1){
                            card[i].setValue(11);
                        }
                }
            }
            }

        }

        return puntuacion;
    }

    public int Robot(){
        int puntacionia=0;
        do {
            cogeCarta(null);
            calculaPuntos();
        }while (calculaPuntos()<21);
    return puntacionia=calculaPuntos();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", card=" + Arrays.toString(card) +
                ", edad=" + edad +
                '}';
    }

}
