
//Реализовать простой калькулятор
import java.util.Scanner;

public class HW_Task_3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        float c = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Добро пожаловать в простой сканнер. Пожалуйста, введите первое число: ");
        float a = userInput.nextInt();
        System.out.printf("Пожалуйста, введите второе число: ");
        float b = userInput.nextInt();
        System.out.printf("Какую операцию Вы хотите выполнить? Введите '+', '-', '*' или '/': ");
        String n = userInput.next();
        userInput.close();

        if (b == 0)
            System.out.println("\u001B[31mУважаемый, на ноль делить-то нельзя! Попробуйте еще раз.");
        else {
            switch (n) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "/":
                    c = a / b;
                    break;
                case "*":
                    c = a + b;
                    break;
            }
            System.out.printf("%.2f", c);
        }
        
    }
}
