package lesson15.blackJack.dto;

import java.util.Objects;

public class Card {
    private final Suit suit;
    private final Rank rank;
    private final int cost;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.cost = rank.getCost();
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s%s", rank.getName(), suit.getSymbol());
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cost == card.cost && suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank, cost);
    }
}
