package HW3;

public class Calculator {
    public static <T extends Number> Number plus(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <T extends Number> Number minus(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public static <T extends Number> Number divide(T num1, T num2){
        if(num2.doubleValue() == 0){
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public static <T extends Number> Number multiply(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
}
