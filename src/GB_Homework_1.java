public class GB_Homework_1 {

    //  1. Создать пустой проект в IntelliJ IDEA и прописать метод main();


    public static void main(String[] args) {

        task02();
        task03();
        task04();
        task05();
        System.out.println(task06(-1));
        task07("сенсей");
        task08(2020);

    }

    //  2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

    static void task02() {

        int a = 10;
        System.out.println(a);
        byte b = 22;
        System.out.println(b);
        short c = 120;
        System.out.println(c);
        long d = 22345;
        System.out.println(d);
        float e = 2.14f;
        System.out.println(e);
        double f = 3.14359;
        System.out.println(f);
        char g = 'g';
        System.out.println(g);
        boolean h = false;
        System.out.println(h);
    }

    //  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    static void task03(){

        double a, b, c, d;
        a = 10.3;
        b = 15.5;
        c = 3;
        d = 4.5;

        System.out.println(a * (b + (c / d)));
    }

    //  4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    static void task04(){

        double a = 3.8;
        double b = 7.4;
        double sum = a + b;

        if(sum >= 10 && sum <= 20) {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

    //  5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    static void task05(){
        int a = -10;

        if(a >= 0) System.out.println("Введенное число: " + a + " - положительное");
        else  System.out.println("Введенное число: " + a + " - отрицательное");

    }

    //  6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    static boolean task06(int a){
        return a < 0;
    }

    //  7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    static void task07(String name){

        System.out.println("Привет, " + name + " !");
    }

    //  8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void task08(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println("Год " + year + " не високосный");
        else System.out.println("Год " + year + " високосный");
    }

}
