package Alhaji;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Char_frequency extends Analysis implements ActionListener{
		     
		    static final int SIZE = 100;
		      int str;
		    // function to print the character and its
		    // frequency in order of its occurrence
		    static void printCharWithFreq(String str ) {
		    
		
		    Scanner scanObj = new Scanner(System.in);
		     System.out.println("Enter a Cipher text and get their frequency !");
		     String cipherText = scanObj.nextLine();
		      String str1 = cipherText;
		      System.out.println("The entered cipher text :" + str1 );
		    
		    
				
		    
		    
		    {
		         // size of the string 'str'
		        int n = str1.length();
		 
		        // 'freq[]' implemented as hash table
		        int[] freq = new int[SIZE];
		 
		        // accumulate freqeuncy of each character
		        // in 'str'
		        for (int i = 0; i < n; i++)
		            freq[str1.charAt(i) - 'a']++;
		 
		        // traverse 'str' from left to right
		        for (int i = 0; i < n; i++) {
		 
		            // if frequency of character str.charAt(i)
		            // is not equal to 0
		            if (freq[str1.charAt(i) - 'a'] != 0) {
		 	
		                // print the character along with its
		                // frequency
		                System.out.print(str1.charAt(i));
		                System.out.print(freq[str1.charAt(i) - 'a'] +++ " ");
		 
		                // update frequency of str.charAt(i) to
		                // 0 so that the same character is not
		                // printed again
		                freq[str1.charAt(i) - 'a'] = 0    ; 
		            }
		        }
		    }
		    }
		      
		    // Driver program to test above
		    public static void main(String args[])
		    {
		        String str = "geeksforgeeks";
		        printCharWithFreq(str);
		    }

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		





	}


