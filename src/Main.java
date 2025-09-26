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

        int totalTip = (int) ((totalBill * 100) * (tipPercent / 100.0) + 0.5);
        int totalBillFinal = (int) ((totalBill * 100) + totalTip + 0.5);
        int tipPerPerson = totalTip / numberOfPeople;
        int totalPerPerson = totalBillFinal / numberOfPeople;
        //breaks on numbers with decimals of only cents
        System.out.println("Total Tip Amount: " + (totalTip - totalTip % 100) / 100 + "." + totalTip % 100);
        System.out.println("Total Bill Amount: " + (totalBillFinal - totalBillFinal % 100) / 100 + "." + totalBillFinal % 100);
        System.out.println("Tip Per Person: " + (tipPerPerson - tipPerPerson % 100) / 100 + "." + tipPerPerson % 100);
        System.out.println("Total Per Person: " + (totalPerPerson - totalPerPerson % 100) / 100 + "." + totalPerPerson % 100);

        System.out.println(" total tip: " + totalTip + " total bill cost: " + totalBill + " tip per person: " + tipPerPerson + " total bill per person: " + totalPerPerson);
        System.out.println("bill: " + totalBill + " tip: " + tipPercent + " ppl: " + numberOfPeople);
    }
}