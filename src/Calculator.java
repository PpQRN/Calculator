public class Calculator {

    public Calculator() {
    }

    public static double plus(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0){
            throw new ArithmeticException("Нельзя делить на ноль :)");
        }
        return number1 / number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double calculate(double number1, double number2, char sign) {
        double result;
        switch (sign) {
            case '+' -> result = plus(number1, number2);
            case '-' -> result = minus(number1, number2);
            case '/' -> result = divide(number1, number2);
            case '*' -> result = multiply(number1, number2);
            default -> throw new IllegalArgumentException("Вы ввели неверный знак");
        }
        return result;
    }
}
