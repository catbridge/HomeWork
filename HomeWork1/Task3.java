package HomeWork1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));      // 1 *Метод abs вычисляет значение по модулю. Вариант с int
        System.out.println(Math.abs(-21.8d));  // 21.8 Вариант с double.
        System.out.println(Math.abs(4532L));   // 4532 Вариант с long.
        System.out.println(Math.abs(5.341f));  // 5.341 Вариант с float.

        System.out.println(Math.PI); // число "Пи"

        System.out.println(Math.sin(Math.toRadians(45))); // Вычисление синуса от 45 градусов. Так же перевод 45 градусов в радианы, метод Math.toDegrees, наоборот, переводит радианы в градусы.
        System.out.println (Math.toDegrees(1)); // Перевод радиана в градусы отдельно.
        System.out.println(Math.cos(1)); //Вычисление косинуса от 1 радиана отдельно. По умолчанию вычисляется в радианах, а не градусах.
        // Таким образом можно вычислить синус - Math.sin, косинус - Math.cos, тангенс - Math.tan, арксинус - Math.asin, арккосинус-Math.acos, арктангенс - Math.atan


        double a = 4;
        System.out.println(Math.sqrt(a)); //Вычисляет квадратный корень из a. Math.cbrt - кубический корень из a
        System.out.println(Math.pow(a, 2)); // Возводит число a в степень 2 (b)
        System.out.println(Math.exp(a)); // Экспонента (E) в степени a
        System.out.println(Math.log(a)); // Вычисляет натуральный логарифм по основанию a
        System.out.println(Math.log10(a)); //Вычисляет десятичный логарифм по основанию а
        System.out.println(Math.log1p(a)); // Натуральный логарифм a + 1
        System.out.println(Math.expm1(a)); // Экспонента - 1

        System.out.println(Math.random()); //Генерация случайного числа

        double z = 1;
        double x = 5;
        double c = 3;
        double v = 7;
        double b = 8.5;

        System.out.println((Math.min(Math.min (z, x), Math.min (c, v)))); //Находит минимум из 4 чисел.
        System.out.println(Math.max(c, Math.max(z, x))); //Нашел максимум из 3 чисел.

        System.out.println(Math.round(b)); //Округление числа.







    }
}
