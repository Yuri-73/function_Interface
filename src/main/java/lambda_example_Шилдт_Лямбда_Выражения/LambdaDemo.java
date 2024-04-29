package lambda_example_Шилдт_Лямбда_Выражения;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("Представление строчного лямбда-выражения: ");
        MyValue myVal;
        myVal = () -> 98.6;  //По сути, представленная лямбда-реализация интерфейса MyValue
        System.out.println("Постоянное значение: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n; //По сути, представленная лямбда-реализация интерфейса MyParamValue
        System.out.println("Обратная величина от 4 равна: " + myPval.getValue(4.0));

        System.out.println("\nПредставление блочного лямбда-выражения: ");
        NumericFunc smallestF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;  //Нахождение абсолютного значения для переменной n
            for (int i = 2; i <= n / i; i++)
                if (n % i == 0) {
                    result = i;
                    break;
                }
            return result;
        };
        System.out.println("Наименьшим делителем для 12 является " + smallestF.func(12));
        System.out.println("Наименьшим делителем для 11 является " + smallestF.func(11));

        System.out.println("\nПредставление лямбда-выражения, реализующего обобщённый интерфейс SomeTest_Generalized: ");
        System.out.println("\nПереопределение входных типов данных и выходного типа на Integer: ");
        SomeTest_Generalized<Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2))
            System.out.println("2 является делителем 10");

        System.out.println("\nПереопределение входных типов данных и выходного типа на Double: ");
        SomeTest_Generalized<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 4.0))
            System.out.println("4.0 является делителем 212.0");

        System.out.println("\nПереопределение входных типов данных и выходного типа на String: ");
        SomeTest_Generalized<String> isFactorS = (n, d) -> (n.indexOf(d)) != -1;
        String str = "Обобщённый функциональный интерфейс";
        System.out.println("Тестируемая строка: " +str);
        if (isFactorS.test(str, "ный")) {
            System.out.println("'ный' найдено");
        } else {
            System.out.println("'ный' не найдено");
        }
    }

}
