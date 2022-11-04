package day25exception;

public class E01 {
    public static void main(String[] args) {
        //        divide(6,2);
//        divide(0,2);
//        divide(6,0);

        divide2(6,0);


    }
    //1. Yol tavsiye edilmez
    //Bir developer için tüm matematik kurallarını ezbere bilmek mümkün değildir
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı sıfır ile bölünemez.");
        }else {
            System.out.println(a/b);
        }

    }
    //2.Yol Try-catch kullanaran exception'ı handle etmek tavsiye edilir.
    //Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
//1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
// isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
//2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
// try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
// Javanin ne yapmasini istedigimizi yazabiliriz

    /*
    1. "Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen  beklenmedik durumlardir.
    2. Exception'lar ile calishmanin iki yolu vardir.
        a.try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme.
         b. throw exception kullanarak çalışmayı durdurma (mesela yazdığımız kod gereği bir
         dosya üzerinden okuma yapmamız gerekiyor ise bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
       3) Eğer exception'ı handle etmez isek (sorunu halletmezsek) java çalışmayı durdurur.
       4) try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullana biliriz.
       5) try catch olmaksızın yanlız kullanılamaz
        6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz  try-catch block iciene koymalisiniz
      7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
      8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
         e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
         System.err.println(); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez


     */
    public static void divide2(int a, int b){

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
        }
    }

}
