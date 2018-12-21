/* 
   10/20/14
   JDK 1.7
   Calculate the Area and Perimeter of a square using multiple methods
   Return arguments (type int) to perform calculations
*/

import javax.swing.JOptionPane;

public class SquareAreaAndPerimeter {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null,"What is the length of one side of a square?");
        double s = Double.parseDouble(input);
        double area = calculateArea(s);
        double perimeter = calculatePerimeter(s);
        JOptionPane.showMessageDialog(null,"The area of a square with side "
                + s + " is " + area + "\nThe perimeter of a square with side " 
                + s + " is " + perimeter);    
    }
    public static double calculateArea(double lengthOfSide){
        return lengthOfSide*lengthOfSide;
    }
    public static double calculatePerimeter(double lengthOfSide){
        return lengthOfSide*4;
    }
}
