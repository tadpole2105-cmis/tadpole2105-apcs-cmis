
/**
 * Dual player scrabble
 * program asks input of points they want to play to
 * player1 enters a word of at least 6 characters long 
 * program mixes up the letter of the entered word 
 * player2 makes as many words as possible from the letters (word must be at least 3 characters long)
 * 2 points rewarded for each word player2 makes. if no words can be made, player 1 gets #of characters points 
 * whoever reaches the input point wins
 */

/*
////////////////////      note                 ///////////////////////////////
create an array w/ as many slots as there are characters ; use .length()
then mathradom to mix up slots, then print out 
isolating characters of string : https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html







*/ 

public class scrabble
{
    int limitPoint = JOptionPane.showInputDialog ("Give your game a limit. Enter the point that you want to play til");
    
    public scrabble(String p1)
    {
       this.p1 = JOptionPane.showInputDialog ("enter a word of at least 6 characters");
    }

    
    }
}


