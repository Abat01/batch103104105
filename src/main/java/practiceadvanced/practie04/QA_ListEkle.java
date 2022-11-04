package practiceadvanced.practie04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QA_ListEkle {
    public static void main(String[] args) {

         /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */
        Scanner input =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

       /* while (true){
            System.out.println("Ekleme yapmak ichin 'add' \n" +
                    "Guncelleme yapmak 'update'\n"  +
                    "Silmek ichin 'delete'\n"+
                    "Chikmak ichin 'quit' konutunu giriniz..");

            String option = input.next();
            if(option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginz sayiyi giriniz");
                int eklenecekSayi =  input.nextInt();
                list.add(eklenecekSayi);
            }else if (option.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(guncellenecekSayi), yeniSayi);
            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi = input.nextInt();
                list.remove((Integer)silinecekSayi);

            }



        System.out.println("Tschuusiiiii!!");

        */

        int[] arr = {5, 9, 15, 1 , 0, 11, 3};

        int toplam = 0;
        for(int w:arr){
            toplam += w;
        }

        double ortalama = toplam/arr.length;
        System.out.println(ortalama);

        for(int w:arr){
            if(w>ortalama){
                System.out.print(w+" ");
            }
}
    }
}
