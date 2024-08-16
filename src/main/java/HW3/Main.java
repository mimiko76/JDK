package HW3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Integer num1 =10, num2 = 10;
        Double num4 = 10.0;
        Float num7  = 10.0f;

        System.out.println(Calculator.plus(num1,num2));
        System.out.println(Calculator.minus(num7, num4));
        System.out.println(Calculator.plus(num1,num7));
        System.out.println("Task2");
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};

        System.out.println("Массив 1 и массив 2 равны: " + Compare.compareArrays(array1, array2)); // true
        System.out.println("Массив 1 и массив 3 равны: " + Compare.compareArrays(array1, array3)); // false

        String[] stringArray1 = {"Hello", "World"};
        String[] stringArray2 = {"Hello", "World"};
        String[] stringArray3 = {"Hello", "Java"};

        System.out.println("Массив строк 1 и массив 2 равны:  " + Compare.compareArrays(stringArray1, stringArray2)); // true
        System.out.println("Массив строк 1 и массив 3 равны: " + Compare.compareArrays(stringArray1, stringArray3)); // false
        System.out.println("Task3");
        Pair <Integer,String> pair = new Pair<>(1,"232");
        Pair <Double, Float> pair2 = new Pair<>(10.4,23.4f);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}
