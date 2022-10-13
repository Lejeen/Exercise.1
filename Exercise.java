public class Exercise {

    public static void main(String[] args) {

        // Writing a program which includes numbers from 1 up to and including 100
        int n1 = 1;
        int n2 = 100;

        // If the number is divisible by 2 and 3, but not by 5
        // If the number is divisible by 3 and 5, but not by 2
        // If the number is divisible by 2, 3 and 5
        // Otherwise print the number
        for(int i = n1; i <= n2; i++) {
            if(i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
                System.out.println("SeamShip");
            }
            if(i % 3 == 0 && i % 5 == 0 && i % 2 != 0) {
                System.out.println("ShipRide");
            }
            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("SteamShipRide");
            } else {
                System.out.println(i);
            }
        }
    }
}
