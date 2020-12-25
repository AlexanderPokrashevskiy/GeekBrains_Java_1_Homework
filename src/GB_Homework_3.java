import java.util.*;

public class GB_Homework_3 {

    // 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {

        Random r = new Random();
        int randNumber = r.nextInt(10) + 1;

        System.out.println("Загадано случайное число от 0 до 9. Попробуйте угадать число за 3 попытки.");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Введите " + (i) + "е число: ");
            int inputNumber = sc.nextInt();
            if (inputNumber > randNumber) {
                System.out.println("Загаданное число меньше.");
              // int inputNumber2 = sc.nextInt();
            } else if (inputNumber < randNumber) {
                System.out.println("Загаданное число больше.");
            //    int inputNumber3 = sc.nextInt();
            } else if(inputNumber == randNumber){
                System.out.println("Вы угадали! Загаданное число: " + randNumber);
                break;
            }

            }
        System.out.println("Конец игры! Повторить игру еще раз? 1 – да / 0 – нет");

        String userInput = sc.next();
        if(userInput.equals("1")){
        main(null);
    }
        }
    }

