import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int accumulation = 2_459_000;
        int save = 15000;
        int initialSave = 0;
        int month = 0;

        while (initialSave <= accumulation) {
            initialSave += save;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + initialSave + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i + " ");
        }
        {
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int natality = 17;
        int death = 8;
        int year = 10;
        int populationNatalition = 0;
        int populationDeath = 0;

        for (int i = 1; i <= year; i = year + 1) {
            populationNatalition = population / 1000 * natality;
            populationDeath = population / 1000 * death;
            population = population + populationNatalition - populationDeath;
            System.out.println("Через " + year + " лет, численность населения составит " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int accumulationMonth = 15000;
        int percent = 7;
        int accumulationTotal = 12_000_000;

        for (int month = 1; accumulationMonth < accumulationTotal; month++) {
            accumulationMonth += accumulationMonth * percent / 100;
            System.out.println(" Месяц " + month + " Накопление " + accumulationMonth);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int accumulationMonth = 15000;
        int percent = 7;
        int accumulationTotal = 12_000_000;

        for (int month = 1; accumulationMonth < accumulationTotal; month++) {
            accumulationMonth += accumulationMonth * percent / 100;

            if (month % 6 == 0)
                System.out.println(" Месяц " + month + " Накопление " + accumulationMonth);

        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int accumulationMonth = 15000;
        int percent = 7;
        int year = 9;
        int monthYear = year * 12;

        for (int month = 1; month < monthYear; month++) {
            accumulationMonth += accumulationMonth * percent / 100;

            if (month % 6 == 0)
                System.out.println(" Месяц " + month + " Накопление " + accumulationMonth);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 5;
        int month = 31;
        for (int i = 1; friday <= month; friday += 7) {
            System.out.println("сегодня пятница " + friday + " отчетный день ");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int comet = 79;
        int year = 2023;
        int cometBack = year - 200;
        int cometForward = year + 100;

        for (int i = cometBack; i < cometForward; i += comet) {
            if (i > cometBack);
                System.out.println(i);
            }

        }
    }
