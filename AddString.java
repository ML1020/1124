package lesson1121;

import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[2];
        for (int i = 0;i <=1;i++){
            strings[i] = scanner.nextLine();
        }
        String addend = strings[0];
        String augend = strings[1];
        AddLongInteger(addend,augend);
}
    private static String AddLongInteger(String addend, String augend) {
        char[] a = addend.toCharArray();
        char[] b = augend.toCharArray();
        int maxL = Math.max(a.length,b.length);
        int[] result = new int[maxL+1];
        int temp = 0;
        for (int i = 0;i < result.length;i++){
            temp = result[i];
            if (i < a.length){
                temp += a[i] - '0';
            }
            if (i < b.length){
                temp += b[i] - '0';
            }
            if (temp >= 10){
                temp -= 10;
                result[i + 1] = 1;
            }
             result[i] = temp;
        }

        for (int i = result.length-1;i >= 0;i--){
            System.out.print(result[i]);
        }
         return null;
    }
}
