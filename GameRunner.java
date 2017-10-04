
/**
 * Write a description of class Blackjack here.
 * 
 * @author Kacey P. 
 * @version 9/27/17
 */
import java.util.Scanner;
public class GameRunner
{
    int pHand1 = 0;
    int pHand2 = 0;
    int dHidden = 0;
    int dShown = 0;
    boolean bust = false;
    public static void main(){
        Hand hand = new Hand();
        hand = hand.drawNum() + hand.drawNum();
        System.out.println("Here is your hand: " + (hand.drawNum() + hand.drawNum()));
        System.out.println("Here is the dealer's card: " + hand.drawNum());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to hit or quit? Please enter 1 or 2. ");
        guess = scanner.nextInt();
        while (guess == 1 && hand < 21){
            System.out.println("Here is your hand: " + (hand.drawNum() + hand.drawNum()));
        }
    }
