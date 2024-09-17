/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstproj;
import java.util.*;
/**
 *
 * @author solty
 */
public class FirstProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] reverse = new char[word.length()];
        for(int i=0;i<word.length(); i++)
        {
            reverse[i] = word.charAt(i);
        }
        for(int i =reverse.length-1;i>=0;i--) //last value of array length -1
        {
           System.out.print(reverse[i]); 
        }
    }
    
}
