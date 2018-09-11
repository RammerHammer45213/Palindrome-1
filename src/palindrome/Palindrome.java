/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import javax.swing.JOptionPane;

/**
 *
 * @author RaCoc9605
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String originalWord = JOptionPane.showInputDialog("Please enter a word:");
        String backwardsWord = "";
        String word = "";
        String palindrome = "";
        String sentence = "";
        int spacePos = 0;

        word = originalWord.replaceAll("","");
        
        while (sentence.length()>0)
        {
            spacePos = sentence.indexOf("");
            word = sentence.substring(0,spacePos);
            sentence = sentence.substring (spacePos + 1, sentence.length());
        }
        
        backwardsWord = "";
        for (int pos = word.length() - 1; pos >= 0; pos--) 
        {
        backwardsWord += word.charAt(pos);
        }
        
        if (word.equalsIgnoreCase (backwardsWord))
            {
                palindrome = "Your word IS a palindrome";
            }
                else
                    {
                        palindrome = "Your word is NOT a palindrome";
                    }
                
        JOptionPane.showMessageDialog(null, "Your word is: " + originalWord + "\n" + palindrome );
    }
    
}
