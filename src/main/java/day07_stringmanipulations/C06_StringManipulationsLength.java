package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    /**
     * Length()
     * length() method'u girilen String'in uzunlugunu verir
     * butun karakterlerin adedi (bosluklar da birer karakterdir)
     */
    public static void main(String[] args) {


        String cumle="Bugun hava yagmurlu";
        System.out.println(cumle.length());


        String str1= "";
        System.out.println(str1.length());

        String str2= "   ";
        System.out.println(str2.length());
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi girniz:  ");
        String isim= "Abat", soyisim= "Annamammedova";

        if(isim.length()>soyisim.length()){
            System.out.println("isim daha uzundur");
        } else if (isim.length()==soyisim.length()) {  //length uzunluk integer oldugu ichin equalls degilde eshit eshit kullandik, sayi olsugu ichinde length kullanildi
            System.out.println("Ikiside esit");

        }else
            System.out.println("soyisim daha uzundur.");

    }
// Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin
}
