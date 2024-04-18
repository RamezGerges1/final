public class BookKeeper extends TRM {
    public int money;
	public static double netWorth;
    public static void distributeProfit(double cleanMoney) {
        Robossociates.increaseNetWorth(cleanMoney*.1);
        BookKeeper.increaseNetWorth(cleanMoney*.05);
        Clamps.increaseNetWorth(cleanMoney*.15);
        Donbot.increaseNetWorth(cleanMoney*.45);
        JoeyMousepad.increaseNetWorth(cleanMoney*.10);

        System.out.println("Robossociates received $" + cleanMoney*.10);
        System.out.println("Robossociates net worth now is $" + Robossociates.netWorth);
        
        System.out.println("Bookkeeper received " + cleanMoney*.05);
        System.out.println("Bookkeeper net worth now is $" + BookKeeper.netWorth);
        
        System.out.println("Police received " + cleanMoney*.15);
        //System.out.println("Robossociates net worth now is $" + BookKeeper.netWorth);
        
        System.out.println("Clamps received " + cleanMoney*.15);
        System.out.println("Clamps net worth now is $" + Clamps.netWorth);
        
        System.out.println("Joey Mousepad received " + cleanMoney*.10);
        System.out.println("Joey Mousepad net worth now is $" + JoeyMousepad.netWorth);
        
        System.out.println("Donbot received " + cleanMoney*.45);
        System.out.println("Donbot net worth now is $" + Donbot.netWorth);
    }
    public static void increaseNetWorth(double cleanMoney) 
    {
        netWorth += cleanMoney;
    }

    
}