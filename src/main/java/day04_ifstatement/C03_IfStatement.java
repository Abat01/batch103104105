package day04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {


        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //stringlerde == neden kullanilmaz onun yerine EQUALS kullaniriz. Cunki javada 2tane memory var.
        //STACK ve HEAP..STRing referans degerinede bakildigi icin == equals kullanilir.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen gun ismi giriniz:");

/*
        //1.YOL:

       \* String gun= input.next().toLowerCase();//tolowercase kucuk harf yapar

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");

        }
        if(gun.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }

        if (!gun.equals("cuma" ) && !gun.equals("cumartesi")&& !gun.equals("pazar")){
            System.out.println("Kutsal gun degil");
        }

 */

 /*
        //2.YOL
    String gun= input.next();
        if (gun.equalsIgnoreCase("cuma" )){
            System.out.println("Muslumanlar icin kutsal gun");
        }
    if (gun.equalsIgnoreCase("cumartesi ")){
        System.out.println("Yahudiler icin kutsal gun");
    }
    if (gun.equalsIgnoreCase("pazar")){
        System.out.println("Hristiyanlar icin kutsal gun");
    }
    if (gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi")&& !gun.equalsIgnoreCase("pazar")){
        System.out.println("Kutsal gun degil");
    }

  */



    //3.YOL:

        String gun = input.next().toLowerCase();
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        } else  System.out.println("Kutsal Gun degil");
    }
}


