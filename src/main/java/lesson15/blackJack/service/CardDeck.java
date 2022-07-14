package lesson15.blackJack.service;

import lesson15.blackJack.dto.Card;
import lesson15.blackJack.dto.Rank;
import lesson15.blackJack.dto.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    public List<Card> createDeck(){
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public List<Card> shuffleCard(List<Card> cards){
        Collections.shuffle(cards);
        return cards;
    }

    @Deprecated
    public void voidShuffleCard(List<Card> cards){
        Collections.shuffle(cards);
    }



}
