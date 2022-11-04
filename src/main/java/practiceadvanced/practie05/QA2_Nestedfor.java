package practiceadvanced.practie05;

import java.util.Scanner;

public class QA2_Nestedfor {
    /*
EXAMPLE: Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=0; i<satir; i++){//Satır kontrolü

            for (int bosluk=satir-i; bosluk>1; bosluk--){

                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();
    }
}
}



