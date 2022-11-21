import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        // Exercise title: SuNumbers
        int sumTotal =0;
                //read user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int number = reader.nextInt();

int i = 1;

while (i <= number) {
    System.out.println(i + " ");
    sumTotal = i + sumTotal;
    i++;
}
System.out.println("The sum of all the number from 1 to " + sumTotal);
    }
    }

