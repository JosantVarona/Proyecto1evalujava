package Model;

public class Mazo {
    private Card[] cards = new Card[52];

    //Hace el mazo de la baraja de cartas
    public Mazo() {
        String[] palos={"♦","♠","♣","♥"};
        int c=0;
        for(String palo:palos){  //4 palo=Diamante, palo=Picas...
            for(int j=1;j<=13;j++){
                cards[c]=new Card(j,palo);
                c++;
            }
        }
    }
    //Coge la carta atreves de la posición de la carta en la array
    public Card sacaCarta(){
        int numero = numeroDeLaCarta();
        return cards[numero];
    }
    //Saca la posición de la carta
    public int numeroDeLaCarta(){
        int mayor = 51;
        int bajo = 0;
        int numero= (int) (Math.random()*(mayor - bajo))+ bajo;

        return numero;
    }

}
