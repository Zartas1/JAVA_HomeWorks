package Lesson3;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

        System.out.print("1) ");

        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.print("2) ");

        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++){
            hundred[i] = i + 1;

            System.out.print(hundred[i] + " ");
        }

        System.out.println();

        System.out.print("3) ");

        int[] nums1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < 6) {
                nums1[i] *= 2;
            }

                System.out.print(nums1[i] + " ");
        }

        System.out.println();

        System.out.println("4) ");

        int[][] diagonal = new int[5][5];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i == j || i + j == diagonal.length - 1) {
                    diagonal[i][j] = 1;
                }
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
       /* for (int i = 0; i < diagonal.length; i++) {
            if (i == i && i == (diagonal.length - 1 - i)) {
                diagonal[i] = 1;
           /* }  не понимаю как решить без объявления переменной j. В методичке показано, что можно как то с одним for решить эту задачу */

        System.out.println("5) ");

        lenInitialValue(7, 18);
            }

            public static int[] lenInitialValue(int len, int initValue){
                int[] res = new int[len];
                for (int i = 0; i < res.length; i++) {
                    res[i] = initValue;
                    System.out.print(res[i] + " ");
                }
                return res;



            }

    }

