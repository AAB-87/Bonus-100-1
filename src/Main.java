public class Main {
    public static void main(String[] args) {
        float currentBalance = 100;
        float addingBalance = 100;
        int bonus;
        if (addingBalance > 1000) {
            System.out.println(bonus = (int) addingBalance / 100);
            System.out.println(currentBalance = bonus + addingBalance + currentBalance);
        }
        if (addingBalance < 1000) {
            System.out.println(bonus = 0);
            System.out.println(currentBalance = currentBalance + addingBalance);
        }

    }
}