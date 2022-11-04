package groupractice01;

public class QA_Loops2 {

   /* Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
    Ancak;
          1step: Sayi 3’un kati ise sayi yerine "Earn" yazdirin.
          2step: Sayi 5’in kati ise sayi yerine "Money" yazdirin.
          3step: Sayi hem 3’un hem 5’in kati ise sayi yerine " * Learn Java * " yazdirin.

    */


    public static void main(String[] args) {
        int sayi = 40;
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5 == 0){
                System.out.println("* Learn Java *");

            } else if (i%5==0) {
                System.out.print("Money,");

            } else if (i%3==0) {
                System.out.print("Earn,");

            }else
                System.out.print(i+ ",");

        }
        System.out.println("");
    }

}
