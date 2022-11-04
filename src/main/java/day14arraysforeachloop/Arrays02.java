package day14arraysforeachloop;

public class Arrays02 {

    public static void main(String[] args) {



        //Ex1: [0,2,3,8,12,0] sifirlari en sona koyunuz
        // I) Eleman sayisi orjinal Array ile  ayni olmali II) sifir mi?
        // [2,3,12,0,0,0]

        int original[] = { 0,2,3,8,12,0};

        int yeni [] = new int[original.length];

        int idx= 0;

        for(int i=0; i<original.length; i++){
            if(original[i] !=0){
                yeni[idx] = original[i];
                idx++;
            }
        }
        //Example 2: Bir Array'in icinde herhangi
        // bir elemanin olup olmadigini kontrol eden ve
        // kac kere tekrarlandigini gosteren kodu yaziniz....
        // [2,1,2,-3,2]==> Kullanici 2'ye sordu =>2elemani var ver 3 kere tekrarlandi
         //==>Kullanici  6'yi sordu ==> elemani yok ver 0 kere tekrarlandi

        int arr[] = {5, 1, 5, -3};
        int eleman = 7;
        int counter = 0;// "flag": Bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

        for(int w : arr){
            if(w==eleman){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(eleman + " array'de " + counter + " defa var");
        }else{
            System.out.println(eleman + " array'de yok");
        }

    }
}

