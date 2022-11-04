package day10stringmanipulations;

public class ForLoop01 { //LOOP dongu denemek her sheyi dongu halinde daily routine

    public static void main(String[] args) {


        //ex: Ekrana 5kere "Hi" yazdiriniz 5000 kere nasil yazilir??
        // tekrarli isler icin "loop "kullanilir
        //4ceshit LOop verdir, 1) for-loop, while-loop, do-while loop,for each loop

        //1) for-loop
        //Ex: ekrana 5kere"hi" yazdirniz.


//Bashlangich degeri Loop hangi shart altinda chalishacak  Increment or decrement
        for ( int i = 1    ;   i<6  ;   i= i+1   ){
            System.out.println("Hallooo");

        }
        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=4; i<8; i=i+1){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 14; i >4 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Ex: 14den 5e kadar tum sayilari ekrana yazdiran kodu yaziniz
        //cift sayilar: 14,12,10...


        for (int i = 14; i >4 ; i-=2){
            System.out.print(i + " ");
        }
    }
}

//2YOL:
               


