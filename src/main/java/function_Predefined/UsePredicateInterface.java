package function_Predefined;

import java.util.function.*;

public class UsePredicateInterface {
    public static void main(String[] args) {
        System.out.println("Использование предопределённого интерфейса Predicate: ");
        Predicate<Integer> isEven = (n) -> (n % 2) == 0; //
        if (isEven.test(4))
            System.out.println("4 - чётное число");
        if (!isEven.test(5))
            System.out.println("5 - нечётное число");

        System.out.println("Использование предопределённого интерфейса UnaryOperator: ");
        UnaryOperator<Integer> isEven2 = (n) -> (n + n);
        int a = isEven2.apply(12);
            System.out.println("a = " + a);
        System.out.println("Использование предопределённого интерфейса BinaryOperator: ");
        BinaryOperator<Integer> isEven3 = (n, m) -> (n + m);
        int b = isEven3.apply(14, 5);
        System.out.println("b = " + b);
        System.out.println("Использование предопределённого интерфейса Supplier: ");
        Supplier<Double> isEven4 = () -> 40.556 + 32.23;
        double c = isEven4.get();
        System.out.println("c = " + c);
        System.out.println("Использование предопределённого интерфейса Function: ");
        Function<Integer, Double> isEven5 = n -> (double)n * n;
        double f = isEven5.apply(12);
        System.out.println("f = " + f);
        System.out.println("Использование предопределённого интерфейса Consumer: ");
        Consumer<Integer> isEven6 = (n) -> System.out.println("Передал число: " + n);
        isEven6.accept(3332);

    }
}
