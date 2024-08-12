package HW2;

public class PairUtils {

    // Метод для суммирования пар чисел
    public static <T extends Number, U extends Number> double sum(Pair<T, U> pair) {
        return pair.getFirst().doubleValue() + pair.getSecond().doubleValue();
    }

    // Метод для конкатенации пар строк
    public static String concatenate(Pair<String, String> pair) {
        return pair.getFirst() + pair.getSecond();
    }

}