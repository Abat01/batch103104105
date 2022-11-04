package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {


    public static void main(String[] args) {

        /*
    ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
    Array ile ArrayList'in farki nedir?
    1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz
      Array'ler eleman sayisinda "fixed" dirler. Yani sonradan eleman sayisi degistirilemez
      ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"

    2)Array'lerin icine "primitive" ve "reference" lar konabilir
      ArrayList'lerin icine ise sadece "non-Primitive"ler konulur.

    3)Array'ler super fast, cok hizli. Array'ler memory'i cok az kullanir.
    Note: Eleman sayisi belli olan coklu datalari depolamak icin Array kullaniriz, ama
          eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

 */

        //Arraylist nasil olushturulur??
        //1.YOL:
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //2.YOL:
        ArrayList<Integer> heights = new ArrayList<>(); //sag tarafa integer yazsanda olur yazmasanda,ozel tanimlama

        //3.YOL:
        List<Integer> nums = new ArrayList<>();

        //ArrayListler nasil yazdirilir??

        System.out.println(nums);

        //ArrayListlere nasil eleman eklenir??

        nums.add(21); //add methodu boolean ekler yani true(gorev tamam demek) veya false(yerleshtirelemedi)
        nums.add(18);
        System.out.println(nums); //add methodu en sona ekler.(insertion order)


        nums.add(1, 50);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);
        System.out.println(prices);

        nums.addAll(2, prices);
        System.out.println(nums);

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

        //Arraylist lerde herhangi bir eleman nasil sechilir?
        //get()methodu istenen bir index teki elemani verir

        int el1= nums.get(3);
        System.out.println(el1);

        //ArrayListin bosh olup olmadigini nasil anlariz?
        boolean bos1 =nums.isEmpty();
        System.out.println(bos1);


        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);


        //ArrayList de bir eleman nasil degistirilir?

        nums.set(3,200);
        System.out.println(nums);

        //EX1: nums ArrayListindeki tum tek sayilari 11 artirdiktan sorna ekrana yazdiriniz


        for (int w : nums){
        if (w%2!=0){

    nums.set(nums.indexOf(w), w+11);
        }

        }
        System.out.println(nums);




        //remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz
        //Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir, yani "int" dir.
        //Note 2: "primitive" ler ArrayList'lerin elemani olamazlar.
        //Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemani olur, index olamaz
        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);// [32, 50, 200, 18, 20, 34, 196]
    }
}
