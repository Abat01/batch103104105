package da12loops;

import java.util.Scanner;

public class WhileLOops01 {

    public static void main(String[] args) {

        // ex: 1: 3den 10a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        for(int i=3; i<11;i++  ){
            System.out.println(i);
        }

        //2.Yol

        int i=3;

        while(i<11){
            System.out.print(i + "  ");

            i++;

                //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

            int k =17;
                while(k>3){
                    if (k%2==0){
                        System.out.print(k+" ");
                    }
                    k--;
                }

                System.out.println();

                //Example 3: 12 den 67 ye kadar sayilarin toplamini veren kodu yazınız

                int sum=0;
                int m = 12;

                while(m<68){

                    sum = sum +m;

                    m++;

                }
                System.out.println(sum);


                //Example-4: Size verilen bir tam sayının rakamlarının toplamını ekrana yazdıran kodu yazınız
 int sonuc = 0;
 int sayi = 385;

 while(sayi>0){
    sonuc = sonuc + sayi%10;

    sayi = sayi/10;

            }

            System.out.println(sonuc);




            //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
            //          3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
            Scanner input = new Scanner(System.in);
            System.out.println("Carpim tablsounu gormek icin bir sayi giriniz");
            int s = input.nextInt();
            int n = 1;

            while(n<11){
                System.out.println(s + "x" + n + " = " +  s*n);
                n++;
            }
        }

    }
}