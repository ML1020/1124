package day15;

import java.util.Scanner;

public class AddABout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        int A = Integer.parseInt(strings[0]);
        int B = Integer.parseInt(strings[1]);
        addAB(A,B);
    }

    private static int addAB(int A, int B) {
        //进位为0时，输出他们的和
        int temp = 0;
        int cur = 0;
        //没有进位的和
        temp = A^B;
        //进位
        cur = (A & B) << 1;
        if (cur == 0){
            System.out.println(temp);
            return temp;
        }else {
            return addAB(temp,cur);
        }
    }
}
