

public class JoeyMousepad extends TRM{
	 
	private TRM trm;
	public static double netWorth;
	public JoeyMousepad(TRM trm) {
        this.trm = trm;
    }
		public void punishRat() {
			
		NewMember.completeTask();
		if(NewMember.rat) {
			System.out.println("Joey Mousepad noticed that "+NewMember.name+" rated out TRM and mysteriously few minutes after "+ NewMember.name+" was found dead");
			TinnyTim.attendFuneral();
			int i = 0;
			while (i < trm.list.size() && !trm.list.get(i).equalsIgnoreCase(NewMember.name)) {
	            i++;
	        }
			if (i < trm.list.size()) {
	            trm.list.remove(i); // Remove the member only if a match was found
	        } else {
	            // Optional: Handle the case where no match is found (e.g., print a message)
	            System.out.println(NewMember.name + " was not found in the list.");
	        }
		}
		}
		public static void increaseNetWorth(double cleanMoney) 
	    {
	        netWorth += cleanMoney;
	    }
	
}
