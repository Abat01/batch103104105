package practiceadvanced;

import java.util.Scanner;

public class QA4_DoWhile_TopunSichramasi {

    public static void main(String[] args) {

        /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */


        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yuksekligi gir...");

        double yukseklik = input.nextDouble();
        double toplamyol = 0;
        int vurmaSayisi = 0;

        do {
            vurmaSayisi++;
            toplamyol += yukseklik;
            yukseklik = yukseklik*0.75;
            toplamyol += yukseklik;

        }while (yukseklik>1);

        System.out.println("vurmaSayisi = " + vurmaSayisi);
        System.out.println("toplamyol = " +toplamyol);



    }
}
