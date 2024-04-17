import java.util.Scanner;
import java.util.Arrays;

public class Donbot extends TRM {
    public int netWorth;
    protected String name;
    static Scanner usrInput = new Scanner(System.in);
    static int usr;
    static String newMember;

    public Donbot() {
        super(); // Ensure the TRM constructor is called to properly initialize the LinkedList
    }

    public static void main(String[] args) {
        Donbot donbot = new Donbot();
        donbot.list.add("ramez");
        donbot.list.add("zach");
        donbot.list.add("lisa");

        do {
            System.out.println("Enter 1 to replace a member or 2 to add a new member");
            while (!usrInput.hasNextInt()) {
                usrInput.next(); // Consume the invalid input
                System.out.println("Please enter an integer value.");
            }
            usr = usrInput.nextInt();

            if (usr == 1) {
                donbot.replaceMember();
            } else if (usr == 2) {
                donbot.addMember();
            }
        } while (usr == 1 || usr == 2);
    }

    public void addMember() {
        System.out.println("Please enter the name of the person you would like to add:");
        newMember = usrInput.next();
        Clamps.agree();
        if(!Clamps.agree) {
            System.out.println("Clamps didn't agree to add a new member.");
            System.out.println(Arrays.toString(this.list.toArray()));
        } else {
            this.list.add(newMember);
            System.out.println(Arrays.toString(this.list.toArray()));
            NewMember.name(newMember);
            assignTask();
            JoeyMousepad joeyMousepad = new JoeyMousepad(this);
			joeyMousepad.punishRat();
            System.out.println(Arrays.toString(this.list.toArray()));
        }
    }

    public void replaceMember() {
        System.out.println("Please enter the name of the member you would like to replace:");
        String oldMember = usrInput.next();
        int i = 0;
        while (i < this.list.size() && !this.list.get(i).equalsIgnoreCase(oldMember)) {
            i++;
        }
        if (i < this.list.size()) {
            System.out.println("Please enter the name of the new member:");
            newMember = usrInput.next();
            Clamps.agree();
            if (!Clamps.agree) {
                System.out.println("Clamps didn't agree to replace the old member.");
                System.out.println(Arrays.toString(this.list.toArray()));
            } else {
                this.list.set(i, newMember);
                NewMember.name(newMember);
                System.out.println(Arrays.toString(this.list.toArray()));
                assignTask();
                JoeyMousepad joeyMousepad = new JoeyMousepad(this);
				joeyMousepad.punishRat();
				
                System.out.println(Arrays.toString(this.list.toArray()));
            }
            
        } else {
            System.out.println("Member not found.");
        }
        
    }

    public void increaseNetWorth(int money) 
    {
        this.netWorth += money;
    }
    public void assignTask() 
    {   
    	System.out.println("Enter one of the following number to assign the corrosponding task to the new member:");
    	System.out.println("1. Interrogations");
    	System.out.println("2. Robo-napping");
    	System.out.println("3. Trafficking of human arms and legs");
    	System.out.println("4. Evidence tampering");
    	System.out.println("5. Running scheme");
    	System.out.println("6. Breaking robot parts");
    	System.out.println("7. Blackmail");
    	System.out.println("8. Arson");
    	System.out.println("9. Stealing");
    	usr = usrInput.nextInt();
    	switch(usr) {
    	case 1:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of interrogation");
    		break;
    	case 2:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Robo-napping");
    		break;
    	case 3:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Trafficking of human arms and legs");
    		break;
    	case 4:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Evidence tampering");
    		break;
    	case 5:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Running a scheme");
    		break;
    	case 6:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Breaking robot parts");
    		break;
    	case 7:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Blackmailing");
    		break;
    	case 8:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Arson");
    		break;
    	case 9:
    		System.out.println("Donbot assigned"+ NewMember.name + "a task of Stealing");
    		break;
    	}
    }
}
