package cs.vsu.ru.kapustin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNumberN();
        int m = readNumberM();

        String card = chooseCard(n, m);

        printCard(card);
    }

    private static int readNumberN() {
        System.out.print("Введите значение N (от 6 до 14): ");
        Scanner scn1 = new Scanner(System.in);
        int value1;

        while(!scn1.hasNextInt()) {
            System.out.print("Недопустимое значение! Пожалуйста, попробуйте снова: ");
            scn1.next();
        }
        value1 = scn1.nextInt();

        while(value1 < 6 | value1 > 16) {
            System.out.print("Недопустимое значение! N должно быть от 6 до 14. ");
            System.out.println("Пожалуйста, попробуйте снова.");
            return readNumberN();
        }

        return value1;
    }

    private static int readNumberM() {
        System.out.print("Введите значение M (от 1 до 4): ");
        Scanner scn = new Scanner(System.in);
        int value;

        while(!scn.hasNextInt()) {
            System.out.print("Недопустимое значение! Пожалуйста, попробуйте снова: ");
            scn.next();
        }
        value = scn.nextInt();

        while(value < 1 | value > 4) {
            System.out.print("Недопустимое значение! M должно быть от 1 до 4. ");
            System.out.println("Пожалуйста, попробуйте снова.");
            return readNumberM();
        }

        return value;
    }

    private static String chooseCard(int n, int m) {
        String[] rankList = {"шестёрка", "семёрка", "восьмёрка", "девятка", "десятка",
                "валет", "дама", "король", "туз"};

        String[] listOfSuits = {"пик", "треф", "бубен", "червей"};

        n = n - 6;
        m = m - 1;

        String phrase = rankList[n] + " " + listOfSuits[m];
        return phrase;
    }

    private static void printCard(String card) {
        System.out.print("Ваша карта - " + card);
    }
}