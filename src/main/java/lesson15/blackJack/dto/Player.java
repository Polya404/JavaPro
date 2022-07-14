package lesson15.blackJack.dto;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int balance = 100;
    private int lost = 0;
    private int win = 0;
    private List<Card> hand = new ArrayList<>();

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", lost=" + lost +
                ", win=" + win +
                ", hand=" + hand +
                '}';
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void putCard(Card card){
        hand.add(card);
    }



}
