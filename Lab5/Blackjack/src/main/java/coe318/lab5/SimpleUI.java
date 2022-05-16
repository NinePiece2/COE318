package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("The Dealer has " + this.game.getHouseCards().getCards());
        System.out.println("You have " + this.game.getYourCards().getCards());
        //FIX THIS
    }

  @Override
    public boolean hitMe() {
        char hit;
        System.out.println("Another Card?: ");
        hit = user.next().charAt(0);
        if (hit == 'y' || hit == 'Y'){
            return true;
        }
        else if (hit == 'n' || hit == 'N'){
            return false;
        }
        System.out.println("ERROR: Invalid Input");
        return false;
        //FIX THIS
    }

  @Override
    public void gameOver() {
        if (((game.score(this.game.getHouseCards())>= game.score(this.game.getYourCards())) && (game.score(this.game.getHouseCards()) <= 21)) || (game.score(this.game.getYourCards()) > 21)){
            System.out.println("You lose. Dealer has " +  this.game.getHouseCards().getCards());
            System.out.println("The value of the DEALER's hand is: " +  game.score(this.game.getHouseCards()));
            System.out.println("You have " +  this.game.getYourCards().getCards());
            System.out.println("The value of YOUR hand is: " +  game.score(this.game.getYourCards()));
        }
        else if (((game.score(this.game.getHouseCards()) < game.score(this.game.getYourCards()) && (game.score(this.game.getYourCards())) <= 21)) || (game.score(this.game.getHouseCards()) > 21)){
            System.out.println("You Win. Dealer has " +  this.game.getHouseCards().getCards());
            System.out.println("The value of the DEALER's hand is: " +  game.score(this.game.getHouseCards()));
            System.out.println("You have " +  this.game.getYourCards().getCards());
            System.out.println("The value of YOUR hand is: " +  game.score(this.game.getYourCards()));
        }
        else{
            System.out.println("ERROR");
        }
        
        //FIX THIS
    }

}