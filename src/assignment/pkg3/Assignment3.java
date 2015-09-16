package assignment.pkg3;

import java.util.Scanner; //Required for the Scanner class

public class Assignment3 {

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in); 
        String chosenWord, reversedWord = "";  //The given word and its reversal
        int wordLength;
        int i;  //used for evaluating character position
        
        System.out.println("Please enter a word that is at least 5 letters long: "); //Inquiring about the word to be reversed
        chosenWord = keyboard.next();
        wordLength = chosenWord.length();
        
        
        
        for(i=chosenWord.length() - 1; i >= 0; i--){    //used to reverse the word
            char value = chosenWord.charAt(i);
            reversedWord += String.valueOf(value);
        }
        
        System.out.println(reversedWord);  //displays the reversed word
        if(wordLength < 5){
            System.out.println("There's your reversed word, but it's shorter than 5 letters!");
        }
        
    }
    
}