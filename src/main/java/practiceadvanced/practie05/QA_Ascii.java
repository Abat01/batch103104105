package practiceadvanced.practie05;

import java.util.Scanner;

public class QA_Ascii {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("ilk karakter giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci larakteri giriniz...");
        char ch2 = input.next().charAt(0);

        int ilk= Math.min(ch1,ch2);
        int ikinci = Math.max(ch1,ch2);


        for(int i=ilk; i<ikinci; i++){
            System.out.print((char)i+" ");
    }
    }
}