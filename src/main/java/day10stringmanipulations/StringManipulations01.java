package day10stringmanipulations;

public class StringManipulations01 {


    public static void main(String[] args) {
        String a = "Java kolaydir.";
        boolean b = a.startsWith("kola", 5 ); //bu string boolean verir..a.startsWith("va", 5 ) kodu ilk 5karakterden sonraki
        //stringe bakar ve o Stringin "kola" ile baslayip baslamadigini kontrol eder.
        System.out.println(b);


       String c =  a.replaceFirst("a", "*");

        System.out.println(c);//replace butun a lar degishir ve yildiza degishir fakat bu kodda sadeece a yerine yildiz verir //J*va


       String d =  a.concat(" Anladin mi??");

        System.out.println(d);

       // a + "Anladin mi??" bu kodda yazilir fakat concat var iken + kullanilmaz.CONCAT KULLAN!

        String e = "    Carl Sagan    ";
        System.out.println(e);  //bashdaki ve soldaki boshluklari alir ve gorunum shoyle "    CArl Sagan   " space karakterlerine dokunmaz ve boshluk olur.

        String f = e.trim();
        System.out.println(f); //Carl Sagan



       String h = "Java";
       String i = "Lava";
//h.compareTo(i) kod iki tane string'i alfabetik olarak (lexicografik) olarak karshilashtirir. Buyuk harf ve kuchuk harf e duyarlidir
        //buyuk harf kuchuk harfe duyarli olmasini istemzseniz compare to ignore case kullanilabilinir.
// bu kodda h nin alphabetic sirasinda "I" nin alphabetic sirasi chikarilir.

        int k = h.compareTo(i); //compareignore case da buyuk harf kuchuk harf bakmaz ve ayni gosterir
        System.out.println(k);

       String n=  a.repeat(3);
        System.out.println(n);

    }
}
