import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Please enter your values and I will calculate the receipt plus tip!");
        System.out.println("--------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total bill amount($): ");
        double totalBillInitial = input.nextDouble();

        System.out.print("What is the Tip Percent (as a int): ");
        int tipPercent = input.nextInt();

        System.out.print("What is the number of People: ");
        int numberOfPeople = input.nextInt();
        //gathers info and stores it into variables

        int totalTip = (int) ((totalBillInitial * 100) * (tipPercent / 100.0) + 0.5);
        int totalBillFinal = (int) ((totalBillInitial * 100) + totalTip + 0.5);
        int tipPerPerson = totalTip / numberOfPeople;
        int totalPerPerson = totalBillFinal / numberOfPeople;
        //does main calculations and stores it as int values, ex: 30.16 is 3016

        //while printing it treats the decimals as their own values and does calculations to only find the hundreths or tenths number and then adds it back
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("[ Total Tip Amount: $" + (totalTip - totalTip % 100) / 100 + "." + (totalTip % 100 - totalTip % 10)/10 + "" + (totalTip % 10)+ "      ]");
        System.out.println("[ Total Bill Amount: $" + (totalBillFinal - totalBillFinal % 100) / 100 + "." + (totalBillFinal % 100 - totalBillFinal % 10)/10 + "" + (totalBillFinal % 10)+ "    ]");
        System.out.println("[ Tip Per Person: $" + (tipPerPerson - tipPerPerson % 100) / 100 + "." + (tipPerPerson % 100 - tipPerPerson % 10)/10 + "" + (tipPerPerson % 10)+ "        ]");
        System.out.println("[ Total Per Person: $" + (totalPerPerson - totalPerPerson % 100) / 100 + "." + (totalPerPerson % 100 - totalPerPerson % 10)/10 + "" + (totalPerPerson % 10) + "      ]");
        System.out.println("----------------------------------");
    }
}