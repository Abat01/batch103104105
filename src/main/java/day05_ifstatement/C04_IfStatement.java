package day05_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz..."+"\n Kadin icin K \n Erkek icin E harfini giriniz...");

        char cinsiyet= input.next().toUpperCase().charAt(0);


        System.out.println("Lutfen yasinizi giriniz...");
        double yas =input.nextDouble();
    }
}
