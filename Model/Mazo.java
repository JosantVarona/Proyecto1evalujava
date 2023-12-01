package Model;

public class Mazo {
    private Card[] cards = new Card[51];

    public int numeroDeLaCarta(){
        int mayor = 13;
        int bajo = 1;
        int numero= (int) (Math.random()*(mayor - bajo))+ bajo;

        return numero;
    }
    public String paloDeLaCarta(){
        int palo= 3;
        int palo1= 1;
        String []colores={"Diamante","Picas","Treboles","Corazones"};
        String color=" ";
        int elige= (int) (Math.random()*(palo - palo1))+ palo1;
        if(elige ==1){
            color=colores[0];
        }
        if(elige ==2){
            color=colores[1];
        }
        if(elige ==2){
            color=colores[2];
        }
        if(elige ==3){
            color=colores[3];
        }

        return color;
    }

}
