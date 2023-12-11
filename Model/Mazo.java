package Model;

public class Mazo {
    private Card[] cards = new Card[52];

    public Mazo() {
        String[] palos={"Diamante","Picas","Treboles","Corazones"};
        int c=0;
        for(String palo:palos){  //4 palo=Diamante, palo=Picas...
            for(int j=1;j<=13;j++){
                cards[c]=new Card(j,palo);
                c++;
            }
        }
    }
    public void imprimerCarta(int numero,String palo){

    }
    public Card sacaCarta(){
        int numero = numeroDeLaCarta();
        return cards[numero];
    }
    public int numeroDeLaCarta(){
        int mayor = 51;
        int bajo = 0;
        int numero= (int) (Math.random()*(mayor - bajo))+ bajo;

        return numero;
    }

}
