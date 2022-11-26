import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Part 1 - Task 1
        int savePart = 15000;
        int total = 0;
        int month = 1;
        double percent = 0.12;
        while (total < 2_459_000) {
            if (month % 12 == 0) {
                total += total * 0.12;
            }
            total += savePart;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println("");
        //Part 1 - Task 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Part 1 - Task 3
        int population = 12_000_000;
        byte fertility = 17;
        byte mortality = 8;
        int increaseCapacity = fertility - mortality;
        for (int l = 1; l <= 10; l++) {
            population += population/1000*increaseCapacity;
            System.out.println("Год " + l + ", численность населения составляет " + population);
        }
        System.out.println("");
        task21();
        task22();
        task23();
        task24();
        task31();
        task32();
    }
    public final static float DEPOSIT = 1.07f;
    public final static int VASYA_ACCUM = 15000;
    public static void task21() {
        //Part 2 - Task 1
        int totalVasyaSave = 15000;
        for (int g = 1; totalVasyaSave <= 12_000_000; g++) {
            totalVasyaSave *= DEPOSIT;
            System.out.println("На счету у Васи уже " + totalVasyaSave);
            if (totalVasyaSave >= 12_000_000)
                System.out.println("Поздравляем! Количество месяцев потребовавшееся Васе = " + g);
        }
        System.out.println("");
    }
    public static void task22() {
        //Part 2 - Task 2
        int totalVasyaSave = 15000;
        for (int g = 1; totalVasyaSave <= 12_000_000; g++) {
            totalVasyaSave *= DEPOSIT;
            if (g % 6 == 0) {
                System.out.println("На счету у Васи уже " + totalVasyaSave);
            }
            if (totalVasyaSave >= 12_000_000)
                System.out.println("Поздравляем! Количество месяцев потребовавшееся Васе = " + g);
        }
        System.out.println("");
    }
    public static void task23() {
        //Part 2 - Task 3
        int totalVasyaSave = 0;
        for (int q = 1; q <= (9 * 12); q++) {
            totalVasyaSave = (int) ((totalVasyaSave + VASYA_ACCUM) * DEPOSIT);//Копейки в подарок банку, Вася же миллионер
            if (q % 6 == 0) {
                System.out.println("Этоу нас месяц номер " + q + ". На счету у Васи уже " + totalVasyaSave);
            }
        }
        System.out.println("");
    }
    public static void task24() {
        Scanner sc1 = new Scanner(System.in);
        int firstFriday;
        System.out.println("Insert first Friday number:");
        for (firstFriday = sc1.nextInt(); firstFriday <= 31; firstFriday += 7)
            System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет.");
        /*
        firstFriday = sc1.nextInt()
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет.");
            firstFriday += 7;
         */
        System.out.println("");
    }
    public static void task31() {
        //Part 3 - Task 1
        Scanner scYear = new Scanner(System.in);
        System.out.println("Input actual year:");
        int periodOfCometComing = 79;
        int yearNow = scYear.nextInt();
        int startYear = yearNow - 200;
        int yearOfComing = 0;
        do {
            yearOfComing += periodOfCometComing;
            if (yearOfComing > startYear) {
                System.out.println(yearOfComing);
            }
        } while (yearOfComing < yearNow);
        System.out.println("");
    }
    public static void task32() {
        //Part 3 - Task 2
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}


