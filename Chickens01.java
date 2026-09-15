public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int monEggs = eggsPerChicken*chickenCount;
        int tueEggs = eggsPerChicken*(chickenCount + 1);
        int wedEggs = tueEggs/2;
        int totalEggs = monEggs + tueEggs + wedEggs;
        System.out.println(totalEggs);
        eggsPerChicken = 4;
        chickenCount = 8;
        monEggs = eggsPerChicken * chickenCount;
        tueEggs = eggsPerChicken * (chickenCount + 1);
        wedEggs = tueEggs / 2;
        totalEggs = monEggs + tueEggs + wedEggs;
        System.out.println(totalEggs);
    }
}
