public class Bookkeeper extends TRM {
    public int money;

    public Bookkeeper() {
        money = 0;
    }

    public void receivePayment(int amount) {
        money += amount;
    }

    public void distributeProfit() {
        int totalRobossociatesShare = calculateShare(0.15);
        int bookkeeperShare = calculateShareFrom(totalRobossociatesShare, 0.05);
        int robossociatesShare = totalRobossociatesShare - bookkeeperShare; 
        int policeShare = calculateShare(0.15);
        int clampsShare = calculateShare(0.15);
        int joeyMousepadShare = calculateShare(0.10);
        int donbotShare = calculateShare(0.45);

        System.out.println("Robossociates received " + robossociatesShare);
        System.out.println("Bookkeeper received " + bookkeeperShare);
        System.out.println("Police received " + policeShare);
        System.out.println("Clamps received " + clampsShare);
        System.out.println("Joey Mousepad received " + joeyMousepadShare);
        System.out.println("Donbot received " + donbotShare);
    }

    private int calculateShare(double percentage) {
        int share = (int)(money * percentage);
        money -= share;
        return share;
    }

    private int calculateShareFrom(int total, double percentage) {
        return (int)(total * percentage);
    }

    public void runningNumbers(int payment) {
        receivePayment(payment);
        distributeProfit();
    }
}
