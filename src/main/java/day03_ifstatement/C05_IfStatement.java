package day03_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {


    public static void main(String[] args) {


        /* TASK:
        * kallanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        * *dort islemden biri ile isleme koyup sonucu yazdiriniz
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 a" +
                "\n bolme islemi icin 3 \ncarpma islemi icin 4 \n giriniz");

        int islem = input.nextInt(); //islem icin yapiyoruz yukardakileri

        System.out.println("Lutfen iki tamsayi giriniz : "); //kullaniciya bildirimde kullandim

        double num1 = input.nextDouble(); //1.sayiyi assign edildi
        double num2 = input.nextDouble();



        if (islem == 1) {
            System.out.println("Toplama islemini sonucu : " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu : " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Bolme islemini sonucu : " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else if(islem == 4) {
            System.out.println("Carpma islemini sonucu : "+ num1+"*"+num2+"="+(num1*num2));
        }else System.out.println("Hatali giris yaptiniz ");
    }
}
