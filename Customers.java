import java.util.Scanner;
public class Customers extends TRM {
    static Scanner usrInput = new Scanner(System.in);
    static int answer;
    static int answer2;
    static boolean buyProduct;

    static int amount;

    static boolean paymentAccepted;
    public static void purchaseProduct() {
        System.out.println("Would you like to purchase product?");
        System.out.println("Enter 1 if you would like to purchase product or 2 otherwise");
        answer = usrInput.nextInt();
        if (answer == 1) {
            buyProduct = true;
        } else if (answer == 2) {
            buyProduct = false;
        }

    }

    public static void ProductAmmount() {
        System.out.println("How much would product would you like to purchase?");
        amount = usrInput.nextInt();
    }

    public static void paymentMethod() {
        System.out.println("How would you like to pay?");
        System.out.println("Enter 1 for cash, 2 for card or check");
        answer2 = usrInput.nextInt();
        if (answer2 == 1) {
            paymentAccepted = true;
        } else if (answer2 == 2) {
            paymentAccepted = false;
            System.out.println("Payment method Declined!");
        }
    }




}
