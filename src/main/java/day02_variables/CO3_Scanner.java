package day02_variables;

import java.util.Scanner;

public class CO3_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = input.next();


        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )


        Scanner Abat = new Scanner(System.in);
        System.out.println("Cemberin yari capini giriniz...");
        double yaricap = input.nextDouble();

        System.out.println("Cemberin Cevresi: " +(2*3.14*yaricap));
        System.out.println("Cenberin Alani: " + (3.14*yaricap*yaricap));
    }





}
