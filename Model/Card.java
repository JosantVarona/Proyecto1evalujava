package Model;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Objects;

public class Card {
    private int value;
    private String suit;


    public Card(int value , String suit){
            this.value= value;
            this.suit=suit;

    }

    public Card(){
        this(0, " ");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(suit, card.suit);
    }

    @Override
    public String toString() {
        StringBuffer stringCard = new StringBuffer("");
        switch (value) {
            case 11:
                stringCard.append("          \n" +
                        " _______\n" +
                        "|       |\n" +
                        "|   " + suit + "   |\n" +
                        "|   " + "J" + "   |\n" +
                        "|       |\n" +
                        "|_______|\n" +
                        "           \n");
                break;
            case 12:
                stringCard.append ("          \n" +
                        " _______\n" +
                        "|       |\n" +
                        "|   " + suit + "   |\n" +
                        "|   " + "Q" + "   |\n" +
                        "|       |\n" +
                        "|_______|\n" +
                        "           \n");
                break;
            case 13:
                stringCard.append( "          \n" +
                        " _______\n" +
                        "|       |\n" +
                        "|   " + suit + "   |\n" +
                        "|   " + "K" + "   |\n" +
                        "|       |\n" +
                        "|_______|\n" +
                        "           \n");
                break;
            default:
                stringCard.append( "          \n" +
                        " _______\n" +
                        "|       |\n" +
                        "|   " + suit + "   |\n" +
                        "|   " + value + "   |\n" +
                        "|       |\n" +
                        "|_______|\n" +
                        "           \n");
        }
        return stringCard.toString();
    }
}
