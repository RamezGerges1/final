import java.util.Scanner;

public class Clamps extends TRM {
    static Scanner usrInput = new Scanner(System.in);
    static int usr;
    static Boolean agree;

    public static void agree() {
        do {
            System.out.println("Enter 1 if the Clamps agree on adding the member Donbot suggested or 2 otherwise");
            usr = usrInput.nextInt();
            if (usr == 1) {
                agree = true;
            } else if (usr == 2) {
                agree = false;
            }
        } while (usr != 1 && usr != 2);
    }

    public Clamps() {
        super(); // Call the parent class (TRM) constructor
    }
}
