/*

   Derrick Cates
   Bellevue University
   CIS 402A-305J
   November 6, 2019

   The purpose of this program is to convert a given dollar amount into
   the following denominations: 100, 50, 20, 10, 5, and 1s. The user will
   input a whole dollar amount into a dialog box with JOptionPane and will
   receive the information with a second dialog box.


*/

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dollars { //create Dollars class

    //main method
    public static void main(String[] args){

        //create variables for raw input and converted input.
        String rawInput;
        int amount;

        // create icon object using ImageIcon
        ImageIcon icon = new ImageIcon("moneyEmoji.png");
        //creates input dialog box. Box has message, title, and modified icon
        rawInput = (String) JOptionPane.showInputDialog(null,
            "Please enter a whole dollar amount: ",
            "Denomination Conversion", JOptionPane.INFORMATION_MESSAGE,
            icon, null, "");

        //converts raw user input from string to int
        amount = Integer.parseInt(rawInput);
        //create hundred variable and determine how many 100's are in amount
        int hundred = amount / 100;
        //assign remainder to change
        int change = amount % 100;
        //repeat previous steps for each denomination
        int fifty = change / 50;
        //change is continually updated after higher denomination has been calc
        change = change % 50;

        int twenty = change / 20;
        change = change % 20;

        int ten = change / 10;
        change = change % 10;

        int five = change / 5;
        change = change % 5;

        int one = change;

        //create message dialog box to display number of each denomination
        JOptionPane.showMessageDialog(null, String.format("You entered: " +
                "$%s\n\n100s = %d\n50s   = %d\n20s   = %d\n10s   = %d\n5s     " +
                "= %d\n1s     = %d", rawInput, hundred, fifty, twenty, ten, five,
                one), "Denomination Conversion", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
