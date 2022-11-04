package da12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i = 1;    //while loop bazi durumlarda hic calismayabilir, yani while loop icin "zero execution" mumkun

        while(i<1){
            System.out.println("While Loop");

            i++;

        } //once dushunur sonra haraket eder



        int x = 1; //do-while loop kullandiginizda loop body'si icindeki kod en az bir kere caalishir. Yani; do-while loop icin "zero execution"mumkun degildir.

        do{
            System.out.println("so-while loop");
            x++;

    }while(x<1);  // hareket ve dusun


//EX1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz??
        //24.5673==> 5+6+7+3 =21

        //Examle 1:bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        double num = 24.5673;
        System.out.println(num);

        //String.valueOf() method'u parantezin icine konulan data'nin tipini String yapar.
        String str = String.valueOf(num);
        System.out.println(str);

        //Regex icin nokta kullandiginiz da onunce"\\" koyunuz. yani nokta "\\." seklinde kullanilir.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;

        do {

            sum = sum + decimalInt%10;


            decimalInt =  decimalInt/10;

        } while (decimalInt>0);

        System.out.println(sum);





    }
}