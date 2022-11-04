package groupractice01;

import java.util.Scanner;
public class QA_Team20_Loops {


    //Example1: Kullanicidan baslangic , bitis ve artis miktarini alarak
    // aradaki tum sayilari aralarina virgul koyarak yazdirin


    public static void main(String[] args) {
        int baslangic =20;
        int bitis = 52;
        int artis= 4;

        for (int i= baslangic ; i <=bitis; i+=artis) {
         if (i<bitis) {
             System.out.print(i+ ",");

        }else
             System.out.print(i);

    }
    }
}

