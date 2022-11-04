package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //example 1: bir sayiinin pozitif olup olmadigini ekrana kodu yaziniz.

        //1.way: if  else

        int a= 12;
        if (a>0){
            System.out.println("Pozitif");

        }else{
            System.out.println("Pozitif degil");
        }

        //2.Way : Ternary
                      //Condition  ?  Condition dogru ise uygulanacak kod  : Condition yanlish ise uygulanacak kod
        String sonuc = a>0         ?      "Pozitif"                        :        "Pozitif degil";
        System.out.println(sonuc);




        //ex: 2: Iki sayidan kucuk olani secen kodu yaziniz

        int b = 12;
        int c = 23;
       int min=  b<c ?  b : c;
        System.out.println(min);

        //Example 3. Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int d= -45;
        int abs = d<0 ? -1*d : d;

        System.out.println(abs);


        // Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise "Islem yapamamm" mesaji veriniz



    }

}
