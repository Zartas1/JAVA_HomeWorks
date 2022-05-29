import javax.swing.*;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {


        System.out.print("1) ");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {

        System.out.print("2) ");
        int a=10;
        int b=-30;
        if (a+b>=0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");
    }

    public static void printColor() {

        System.out.print("3) ");
        int value=101;

        if (value>100)
            System.out.println("Green");
        if (0<value && value<=100)
            System.out.println("Yellow");
        if (0>=value)
            System.out.println("Red");

    }

    public static void compareNumbers() {

        System.out.print("4) ");
        int a=10;
        int b=20;

        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }

}
