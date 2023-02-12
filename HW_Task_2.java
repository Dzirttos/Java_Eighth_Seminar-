//Вывести все простые числа от 1 до 1000

public class HW_Task_2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[J");
        boolean b = true;
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    b = false;
                    break;
                }
            }
            if (b == true) System.out.printf("\u001B[35m" + i + " ");
            else b = true;
        }
    }
}
