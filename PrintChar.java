package lesson1121;

import java.util.Scanner;

public class PrintChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int m = Integer.valueOf(strings[0]);
        howPrintQ(m,strings[1]);
    }

    private static void howPrintQ(int m, String string) {
       // int row = ;//行
       // int col = ;//列
        //Math.ceil((double)m / 2 - 1)向上整除，需要double类型
        for (int row = 0;row <= Math.ceil((double)m / 2 - 1);row++) {
            if (row == 0) {
                for (int col = 0; col < m; col++) {
                    System.out.print(string);
                }
                System.out.println( );
            } else if (row == Math.ceil((double)m / 2 - 1)){
                for (int col = 0; col < m; col++) {
                    System.out.print(string);
                }
            }else if (row > 0 && row <  Math.ceil((double)m / 2 - 1)){
                System.out.print(string);
                for (int i = 0;i < m-2;i++){
                    System.out.print(" ");
                }
                System.out.println(string);
            }
        }
    }
}
