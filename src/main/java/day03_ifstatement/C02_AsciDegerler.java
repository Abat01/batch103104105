package day03_ifstatement;

public class C02_AsciDegerler {

    public static void main(String[] args) {


        char harf='a';
        char harf2='A';

        System.out.println("harf>harf2 ==>"+(harf>harf2)); //karsilastirmanin sonucunu TRUE YADA false doner yani booleandir.

        //Buyuk harflerin ascii degerleri  kucuk harflerin ASCII degerlerininden daha kucuktur


        //1. herhangi bir char variable'in ASCII degerlerini kod yazarak bulunuz.

        //1.YOL
        char space=' ';
        System.out.println(" Space'in ASCII degeri : "+(space+0));


        char x = 'm';
        System.out.println("x'nin ASCII degeri : "+(x+0)); // burda variable o yuzden alttaki 2yolda x ascii degeri 120 chikti

        // 2.YOL

        int harf3 = 'x';

        System.out.println("x'in ASCII degeri = "+harf3);

        byte b1 = 12;
        byte b2 =-125;

        System.out.println("b1>b2 ==>"+(b1>b2));

        float f1 = 2.454645f;
        float f2 = 5.876878f;

        System.out.println("f1>f2 ==> "+(f1>f2));
        System.out.println("b1>b2 ==> "+(b1>b2));

        long lng1 = 54535637838L;
        System.out.println("b1<lng1 ==> "+(b1<lng1));

        char ch= 'h';
        System.out.println("b1>ch ==> "+ (b1>ch));




    }
}
