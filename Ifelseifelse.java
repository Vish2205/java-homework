import java.util.Scanner;
public class Ifelseifelse {

    public static void main(String[] args) {
       
        // Create a Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
       
        // Take string data from the user
        String name = in.next();
       
        // Check the input value equal to 'Vishakha' or not
        if(name.equals("Vishakha"))
        {
            System.out.print("You have achieved the first price");
        }
        // Check the input value equal to 'Radhika' or not
        else if(name.equals("Radhika"))
        {
            System.out.print("You have achieved the second price");
        }
        // Check the input value equal to 'Advika' or not
        else if(name.equals("Advika"))
        {
            System.out.print("You have achieved the third price");
        }
        else
        {
            System.out.print("Try for next time");
        }
        //Close the scanner object
            in.close();
       
    }

}
// Example of if elseif else 