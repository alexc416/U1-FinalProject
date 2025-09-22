import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total bill amount: ");
        double totalBill = input.nextDouble();

        System.out.print("What is the Tip Percent (as a int): ");
        int tipPercent = input.nextInt();

        System.out.print("What is the number of People: ");
        int numberOfPeople = input.nextInt();

        System.out.println("bill: " + totalBill + " tip: " + tipPercent + " ppl: " + numberOfPeople);
    }
}