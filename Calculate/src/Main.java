import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int first;
        int second;
        int result;
        String chekString;

        // Первое число

        System.out.println("Введите первое целое число: ");

        try {
            first = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное число. Повторите попытку:");
            chekString = in.nextLine();
            while (!chekString.matches("[-+]?\\d+")) {
                System.out.println("Введено некорректное число. Повторите попытку:");
                chekString = in.nextLine();
            }
            first = Integer.parseInt(chekString);
            chekString = null;
        }

        // Второе число

        System.out.println("Введите второе целое число: ");

        try {
            second = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное число. Повторите попытку:");
            chekString = in.nextLine();
            while (!chekString.matches("[-+]?\\d+")) {
                System.out.println("Введено некорректное число. Повторите попытку:");
                chekString = in.nextLine();
            }
            second = Integer.parseInt(chekString);
            chekString = null;
        }

        // Оператор

        System.out.println("Введите символ операции '+', '-', '*', '/': ");
        char operation = in.next().charAt(0);

        while(operation != '+' & operation != '-' & operation != '/' & operation != '*') {
            System.out.println("Допустимые символы '+', '-', '*', '/'. Введите новый символ: ");
            operation = in.next().charAt(0);
        }

        // Результат

        switch (operation) {

            case '+':
                result = first + second;
                System.out.println("Ответ: " + result);
                break;

            case '-':
                result = first - second;
                System.out.println("Ответ: " + result);
                break;

            case '/':
                try {
                    result = first / second;
                    System.out.println("Ответ: " + result);
                    break;
                }
               catch (Exception e){
                   System.out.println("Делить на 0 нельзя. Введите другую операцию: ");
                   operation = in.next().charAt(0);
                   while (operation == '/'){
                       System.out.println("Делить на 0 нельзя. Введите другую операцию: ");
                       operation = in.next().charAt(0);
                   }

               }

            case '*':
                result = first * second;
                System.out.println("Ответ: " + result);
                break;

            default:
                System.out.println("Операцию выполнить не удалось");
                break;
        }
        }

}