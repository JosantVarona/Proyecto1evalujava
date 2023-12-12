package Model;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Card[] card;
    private int puntos;
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.card = new Card[20];
        this.puntos = puntos;
    }

    public Jugador() {

    }
    public void cogerCartas(int NumeroCartas, Mazo mazo) {

        int contador = 0;
        boolean insertada = false;
        for (int i = 0; i < card.length && !insertada; i++) {

            if (contador != NumeroCartas) {
                if (card[i] == null) {
                    card[i] = mazo.sacaCarta();

                    contador++;
                }
            }else{
                insertada = true;

            }

        }

    }


    public int calculaPuntos() {
        int puntuacion = 0;
        if (card.length >= 0) {
            for (int i = 0; i < card.length; i++) {
                if (card[i] != null) {
                    if (card[i].getValue() >= 10) {
                        puntuacion += 10;
                    } else {
                        puntuacion += card[i].getValue();
                    }
                    if (puntuacion <= 10) {
                        if (card[i].getValue() == 1) {
                            card[i].setValue(11);
                        }
                    }
                }
            }

        }

        return puntuacion;
    }
    public String getCards(){
        StringBuffer stringCards= new StringBuffer("");
        for(int i= 0;i<20;i++){
            if(card[i]!=null){
                stringCards.append(card[i].toString());
            }
        }
        return stringCards.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Card[] getCard() {
        return card;
    }

    public void setCard(Card[] card) {
        this.card = card;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Las cartas del jugador " +nombre+
                " son " + getCards();

    }
}
