//Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class HW_Task_1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int n = Integer.parseInt(userInput.nextLine());
        userInput.close();

        if (n < 0) {
            System.out.println("\u001B[31mОперация невозможна. Введите число больше '0'!");
        } else if (n == 0) {
            System.out.println(
                    "При значении ввода равным '0', значение треугольного чилса булет равно '0', а факториала равно '1'! ");
        } else {
            System.out.printf("\u001B[32mТреугольное число %d равно %d\n", n, triangle(n));
            System.out.printf("\u001B[34mФакториал числа %d равен %d\n", n, factorial(n));
        }

    }

    

    static int triangle(int n) {
        if (n == 1)
            return 1;
        return n + triangle(n - 1);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

}