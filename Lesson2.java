package Lesson2;

public class Lesson2 {

    public static void main(String[] args){

        System.out.println(sumOfNum("1) ",20, 40));
        posOrNeg(100);
        System.out.println(posOrNegBool("3) ", -100));
        printTimes("I have no time",3);


    }

    public static boolean sumOfNum(String m, int a, int b){
        System.out.print(m);
        return (a + b >= 10) && (a + b <= 20);

    }

    public static void posOrNeg(int a) {
        System.out.print("2) ");
        if (a >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        }

    public static boolean posOrNegBool(String m, int a) {
        System.out.print(m);
        return (a >= 0);
    }

    public static void printTimes(String line, int times){
        System.out.print("4) ");
        for (int i = 0; i < times; i++){
            System.out.println(line);
        }

    }




}
