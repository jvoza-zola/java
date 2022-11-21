import java.util.Scanner;

public class TimesTable {
    public static void main (String[] args) {
        Scanner myobj = new Scanner(System.in);
        //collect the timestable from the user
        System.out.println("what times table would you like?");
        int TimesTable = myobj.nextInt();
        //set the base for the times table calculation
        int x = 1;
        // use the for Loop to count the times table up to 12
        for (double i = 1; i <= 12; i++) {
            //use the x value to count the times table
            i = TimesTable * x;
        System.out.println(" TimesTable " + 1 + " = " + x);
    }
    }
}
