public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int monEggs = 100;
        int tueEggs = 121;
        int wedEggs = 117;
        double dailyAverage = (monEggs + tueEggs + wedEggs)/3.0;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
