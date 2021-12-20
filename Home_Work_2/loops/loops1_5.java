package loops;

public class loops1_5 {
    public static void main(String[] args) { //Разделил на 2 цикла, т.к. не разобрался как перевести половину результата в консоли вниз.
    for (int i = 1; i < 11; i++) {
        for (int j = 2; j < 6; j++) { //Умножение от 2 до 6
            System.out.print(j + " * " + i + " = " + (i * j) + "\t | ");

        }
        System.out.println();
    }
    System.out.println("___________________________________________________________");

    for (int i = 1; i < 11; i++) {
        for (int j = 6; j < 10; j++) { //Умножение от 6 до 9
            System.out.print(j + " * " + i + " = " + (i * j) + "\t | ");

        }
        System.out.println();
    }

}
}
