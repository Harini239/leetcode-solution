// Last updated: 8/12/2026, 11:17:43 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        int usedFromMain = 0;  // liters used from main tank

        while (mainTank > 0) {
            mainTank--;         // consume 1 liter from main tank
            usedFromMain++;     // increment used liters counter
            distance += 10;     // 10 km per liter
            
            // After every 5 liters consumed, inject 1 liter from additional tank if available
            if (usedFromMain % 5 == 0 && additionalTank > 0) {
                mainTank++;         // add 1 liter to main tank
                additionalTank--;   // reduce from additional tank
            }
        }

        return distance;
    }
}
