import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers you want to add tgt: ");
        int one = in.nextInt();
        int two = in.nextInt();
        int sum = one + two;

        System.out.println("The sum of " + one + " and " + two + " is: " + sum);
    }
}