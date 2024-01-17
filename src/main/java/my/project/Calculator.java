package my.project;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // BinaryOperator<Integer> devide = (x, y) -> x / y;
    /*
     * Ошибка заключалась в делении на 0
     * Исправление : Проверяем делитель :
     *   Если не равен 0 возвращаем x / y.
     *   Иначе возвращаем 0 .
     * */
    BinaryOperator<Integer> devide = (x, y) -> {
        return (y != 0 ? x / y : 0);
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
