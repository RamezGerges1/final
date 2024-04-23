public class Robossociates extends TRM{
	static int money;
	public static double netWorth;
	public static void participateInDeal() {
        System.out.println("Robossociates are assisting "+ NewMember.name + " in the deal.");
    }
public static void sellProduct(){
	Customers.purchaseProduct();
	if (!Customers.buyProduct){
		System.out.println("I didn't want to sell to you any ways");
	}
	else{
		Customers.ProductAmmount();
		money= Customers.amount * 10;
		Customers.paymentMethod();		}
	}
public static void increaseNetWorth(double cleanMoney) 
{
    netWorth += cleanMoney;
}
}