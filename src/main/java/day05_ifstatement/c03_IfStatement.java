package day05_ifstatement;

import java.util.Scanner;

public class c03_IfStatement {

    //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
    // asagidaki degerlere gore cevap yazdirin.
    //Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
    //10000 – 20.000 arasinda ise "Konusabiliriz",
    //10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println ("Lutfen maas icin bir teklif veriniz..");
        double maas = input.nextDouble();
if (maas >= 20000) {
        System.out.println("Kabul ediyorum");

    } else if (maas >= 10000 ) {
        System.out.println("Konusabiliriz");

    } else if (maas < 10000) {
        System.out.println("Maalesef Kabul edemem");
    }

}
}

