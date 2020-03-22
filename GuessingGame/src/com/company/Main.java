package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner keyboardInput = new Scanner(System.in);

        String secretWord = "giraffe";
        String guessedWord = "";

        int guessCount = 0; // every time the use guesses, increment this variable
        int guessLimit = 3; // gives user 3 guesses
        boolean outOfGuesses = false; // if outOfGuesses = true, then the user will have run out of guesses

        // keep looping as long as the guessedWord is not secretWord, AND as long as the user is not out of guesses
        while(!guessedWord.equals(secretWord) && !outOfGuesses){

            if(guessCount < guessLimit){
                System.out.print("Enter a guess: ");
                // create a variable to store the user's guess:
                guessedWord = keyboardInput.nextLine();
                guessCount++; // increase guessCount
            } else {
                outOfGuesses = true;
            }


        }
        // if the user guesses reaches guess limit, the while-loop stops and prints:
        if (outOfGuesses = true){
            System.out.println("You lost! You're out of guesses.");
        } else {
            // if the user guesses correctly, the while-loop stops and prints:
            System.out.println("You won!");
        }
    }
}