package lesson15.blackJack.service;


import lesson15.blackJack.dto.Card;
import lesson15.blackJack.dto.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService {

    public Card getCard(List<Card> cards){
        Card card = cards.get(0);
        cards.remove(card);
        return card;
    }

    // 17 .. 25
    public int computerTurn(){
        return new Random().nextInt(25 - 17) + 17;
    }

    public int calculatePlayerCount(Player player) {
        return player.getHand().stream().mapToInt(Card::getCost).sum();
    }

    public void eraseHand(Player player) {
        player.setHand(new ArrayList<>());
    }
}
