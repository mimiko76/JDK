package HW2;

import static HW2.PairUtils.concatenate;
import static HW2.PairUtils.sum;

public class Main {
    public static void main(String[] args) {

        // Пример использования для чисел
        Pair<Integer, Double> numberPair = new Pair<>(5, 3.5);
        double sum = sum(numberPair);
        System.out.println("Сумма: " + sum); // Вывод: Сумма: 8.5

        // Пример использования для строк
        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        String concatenated = concatenate(stringPair);
        System.out.println("Конкатенация: " + concatenated); // Вывод: Конкатенация: Hello, World!
    }
}
