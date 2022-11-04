package day07ternarystringmanipulation;

public class Nestedternary01 {

    public static void main(String[] args) {

        /*
        Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100e bolunduyse 400 de bolunmelidir
        2) Yil 100 e bolunmezse 4 e bolunmelidir (INTERVIEW SORUSU
         */


        int year = 2001;

        String leap =  year %100==0 ? (year%400==0? "Lead year" : "Leap year degil") : (year%4==0 ? "Leap year": "Leap year degil");

        System.out.println(leap);


        /*
        asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz
        i) sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
        II) Sekiz  karakterden az karakter varsa ilk harfi 'K' olmalidir
          */

        String pwd = "i2a3ed54";

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli": "Gecersiz") : (pwd.charAt(0)=='i' ? "Gecerli": "Gecersiz");



    }
}
