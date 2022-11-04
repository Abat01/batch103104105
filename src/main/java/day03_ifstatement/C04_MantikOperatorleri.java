package day03_ifstatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8);  //false


        boolean sonuc1=5>4 && 7<9 && 6+3==6 && 5-3==4; //booleanda 1tane bile yanlish varsa direk false der result
        System.out.println("sonuc1==> "+sonuc1);



        int sayi1 =15;


        System.out.println(10<sayi1 && sayi1<20); //true
        
        
        int sayi2=5;

        System.out.println("sayi2 ile 20 arasinda degildir :"+(sayi2<10  || sayi2<20));
        System.out.println(sayi2<10 || sayi2 >20 ); //true olur chunku mantik operator shartlardan doner 10 ve 20 arasinda sayi alamayiz
        // && = ve demek // || veya demek

    }
}
