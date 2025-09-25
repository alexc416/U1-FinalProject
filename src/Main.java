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

        double totalTip = (totalBill) * (tipPercent / 100.0);
        totalBill = totalBill + totalTip;
        double tipPerPerson = totalTip / numberOfPeople;
        double totalPerPerson = totalBill / numberOfPeople;
        System.out.println(totalTip);
        totalTip = ((int) ((totalTip*100.0)+0.5) / 100);
        /*totalBill = (((int) (totalBill * 100) + 0.5) / 100);
        tipPerPerson = (((int) (tipPerPerson * 100) + 0.5) / 100);
        totalPerPerson = (((int) (totalPerPerson * 100) + 0.5) / 100);*/

        System.out.println(" total tip: " + totalTip + " total bill cost: " + totalBill + " tip per person: " + tipPerPerson + " total bill per person: " + totalPerPerson);
        System.out.println("bill: " + totalBill + " tip: " + tipPercent + " ppl: " + numberOfPeople);
    }
}