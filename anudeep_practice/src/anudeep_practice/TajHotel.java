package anudeep_practice;

public class TajHotel {
    public static void main(String[] args) {
        String[] roomTypes = {"luxury", "a/c", "non a/c", "delux", "general"};
        int[] costPerDay = {2500, 2000, 1500, 1200, 500};
        int numberOfDays = 30;

        int[] totalBill = new int[roomTypes.length];

        for (int i = 0; i < roomTypes.length; i++) {
            totalBill[i] = costPerDay[i] * numberOfDays;
        }

        System.out.println("Total Bill for each Room Type:");
        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println(roomTypes[i] + ": " + totalBill[i]);
        }
    }
}
