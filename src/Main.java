import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        double[] spendingMoney = {341_265.21, 465_347.78, 289_192.53, 331_623.97, 374_649.78};
        double totalSpending = 0;

        for (double cost : spendingMoney) {
            totalSpending += cost;
        }

        System.out.printf("Сумма трат за месяц составила %.2f рублей", totalSpending);

        //Задача 2
        int maxSpendingIndex = 0;
        int minSpendingIndex = 0;

        for (int i = 1; i < spendingMoney.length; i++) {
            if (spendingMoney[i] > spendingMoney[maxSpendingIndex]){
                maxSpendingIndex = i;
            }
            if (spendingMoney[i] < spendingMoney[minSpendingIndex]){
                minSpendingIndex = i;
            }
        }

        System.out.printf("\n\nМинимальная сумма трат за неделю составила %f рублей. Максимальная сумма трат за неделю составила %f рублей",
                spendingMoney[minSpendingIndex], spendingMoney[maxSpendingIndex]);

        //Задача 3
        double averageSpending = Arrays.stream(spendingMoney).average().getAsDouble();

        System.out.printf("\n\nСредняя сумма трат за месяц составила %f рублей", averageSpending);
        
        //Задача 4
        System.out.println("\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}