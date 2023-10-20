import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        double apple=3.67;
        double pear=2.14;
        double tomato=1.11;
        double bananas=0.95;
        double eggplant=5.00;

        Scanner input= new Scanner(System.in);
        System.out.println("how many kg of apples did you buy:");
        int apples= input.nextInt();
        System.out.println("how many kg of pear did you buy:");
        int pears = input.nextInt();
        System.out.println("how many kg of tomato did you buy:");
        int tomatos = input.nextInt();
        System.out.println("how many kg of bananas did you buy:");
        int bananass= input.nextInt();
        System.out.println("how many kg of eggplant did you buy:");
        int eggplants= input.nextInt();
        double total =(apple*apples)+(pear*pears)+(tomato*tomatos)+(bananas*bananass)+(eggplant*eggplants);
        System.out.println("Your debt is "+total+"$");
    }
}
