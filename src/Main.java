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
        double maxSpending = Arrays.stream(spendingMoney).max().getAsDouble();
        double minSpending = Arrays.stream(spendingMoney).min().getAsDouble();

        System.out.printf("\n\nМинимальная сумма трат за неделю составила %f рублей. Максимальная сумма трат за неделю составила %f рублей", minSpending, maxSpending);

        //Задача 3
        double averageSpending = Arrays.stream(spendingMoney).average().getAsDouble();

        System.out.printf("\n\nСредняя сумма трат за месяц составила %f рублей", averageSpending);
        
        //Задача 4
        System.out.println("\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
            reverseFullName[i] = temp;
        }

        for (char c : reverseFullName){
            System.out.print(c);
        }
    }
}