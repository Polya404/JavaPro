package lesson15.blackJack;


import lesson15.blackJack.dto.Card;
import lesson15.blackJack.dto.Player;
import lesson15.blackJack.service.CardDeck;
import lesson15.blackJack.service.CardService;

import java.util.List;
import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        CardService cardService = new CardService();
        CardDeck cardDeck = new CardDeck();

        System.out.println("Game 21 ....");
        System.out.println("Enter your name: ");
        Scanner cs = new Scanner(System.in);
        Player player = new Player(cs.next());

        String endGame = "";
        do {
            int money = 0;
            do {
                System.out.println("Please put money from 1 to 20 ...");
                money = cs.nextInt();
            } while ((money > 20 || money < 1) && player.getBalance() > 0 );

            player.setBalance(player.getBalance() - money);

            List<Card> cards = cardDeck.shuffleCard(cardDeck.createDeck());

            player.putCard(cardService.getCard(cards));
            player.putCard(cardService.getCard(cards));

            player.getHand().forEach(c -> System.out.print(c + " "));
            System.out.println(" (" + cardService.calculatePlayerCount(player) + ") ");
            System.out.println();

            System.out.println("Do you want continue ... Y/N");
            String nextCard = cs.next();
            while (nextCard.equals("Y")) {
                player.putCard(cardService.getCard(cards));
                player.getHand().forEach(c -> System.out.print(c + " "));
                System.out.println(" (" + cardService.calculatePlayerCount(player) + ") ");
                System.out.println();
                if (cardService.calculatePlayerCount(player) < 22) {
                    System.out.println("Do you want continue ... Y/N");
                    nextCard = cs.next();
                } else {
                    break;
                }
            }

            System.out.println("Computer turn...");
            int computerCount = cardService.computerTurn();
            System.out.println("Computer count:  " + computerCount);
            int playerCount = cardService.calculatePlayerCount(player);
            System.out.println("Player count:  " + playerCount);

            if (playerCount <= 21 && computerCount > 21) {
                money += money;
                player.setBalance(player.getBalance() + money);
                player.setWin(player.getWin() + 1);
                System.out.println("Player win " + money + "$");
            } else if (playerCount > 21 && computerCount <= 21){
                player.setLost(player.getLost() + 1);
                System.out.println("Computer win");
            } else if (playerCount > 21 && computerCount > 21) {
                System.out.println("xxx");
            } else {
                if (playerCount >= computerCount){
                    money += money;
                    player.setBalance(player.getBalance() + money);
                    player.setWin(player.getWin() + 1);
                    System.out.println("Player win " + money + "$");
                } else {
                    player.setLost(player.getLost() + 1);
                    System.out.println("Computer win");
                }
            }

            cardService.eraseHand(player);
            System.out.println(player);
            System.out.println("_________");
            System.out.println("Do you want play next game... Y/N");
            endGame = cs.next();
        } while (endGame.equals("Y"));
    }
}
