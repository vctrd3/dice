
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 * program description: guess a number then throw the dice.
 */
public class Dice {

    
    public static void main(String[] args) {
        int input;
        //initialize scanner for user input
        Scanner reader=new Scanner(System.in);
        //grab and store user input in input
        System.out.print("Guess a number before throwing the dice: ");
        input = Integer.parseInt(reader.nextLine());
        
        //loop to check if input is within 1 and 6
        while(true){
        if(input>6 || input<=0){
            System.out.print("Guess a number (Hint: choose between 1 and 6): ");
            input = Integer.parseInt(reader.nextLine());
        }
        else{
            break;
        }
        }
        //call rollDice() method
        int rollDice=rollDice();
        System.out.println("Throwing dice...");
        //check input with rollDice() and output result
        if(input==rollDice){
            System.out.println("Dice: "+rollDice);
            System.out.println("Wow! You guessed correctly!");
            
        }
        else{
            System.out.println("Dice: "+rollDice);
            System.out.println("Sorry, try again...");
        }
        
        
        
    }
    //method to get a random number between 1 and 6
    public static int rollDice(){
        Random dice = new Random();
        int diceNumber;
        diceNumber = dice.nextInt(6)+1;
        return diceNumber;
    }
    
    
    
}
