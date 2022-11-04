package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {


    public static void main(String[] args) {
        //EX!: Size verilen pozitiv ve negative saayilar icheren bir integer Array deki "en buyuk negative" ve ""en kuchuk pozitive" elemani bulunuz


        int arr[] = {-12, 18, -5, 23, -2, 0};


        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];

        for(int w : arr){//for each loop ne den loop buyuk kuchuk oldugu ichin soru sorulmush o yuzden

            if (w<0){
                maxNegative = Math.max(maxNegative, w);
            }

            if (w>0){
                minPositive = Math.min(minPositive, w);
            }

        }
        System.out.println(maxNegative + " and " + minPositive);

    }
}
