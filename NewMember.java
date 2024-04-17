import java.util.Scanner;

public class NewMember extends TRM{
	static String name;
	static Scanner usrInput = new Scanner(System.in);
    static int usr;
    static Boolean rat;

    public static void name(String n) {
    	name=n;
    }
    
	public static void completeTask()
	{
		do {
            System.out.println("Enter 1 if "+name+" will rat the Donbot or 2 if they would complete the job");
            usr = usrInput.nextInt();
            if (usr == 1) {
                rat = true;
            } else if (usr == 2) {
                rat = false;
            }
        } while (usr != 1 && usr != 2);
    }

	}


