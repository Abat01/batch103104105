package day07_stringmanipulations;

public class C03_StringManipulationsReplace {
    /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {


        //rakam haricindekileri silin

        String str1="$45.99";
        str1=str1.replaceAll("\\D", "");
        System.out.println("str1 = "+ str1);


        // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin
String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\n", "*")+cumle.substring(10));



    }

}