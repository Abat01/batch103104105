package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {


    //Arrays'lerin ichine sadece "Primitive data type"leri yerlestirilebilit
    public static void main(String[] args) {

        String str [] = new String[3];
        str[0] = "Java";
        str[1]= "did";
        str[2] = "schoked you!!!";
        System.out.println(Arrays.toString(str));

        //string bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr [] ={"Jane","Carl", "Christopher", "Tom", "Ali", "Rojda" };

        for (String w: arr){
            System.out.println(w + " ");

            if (w.equals("Tom")){
                continue;

            }
            System.out.println(w + " ");
        }



        //Ex3: Bir ogretmenin sinifindaki ogrencilerin application'a  yuklenmesini saglayan kodu yaziniz.
        // (Kullanici ile beraber bir Array olusturunuz ve ichine data ekleyiniz )


        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");



        for(int i=1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");

            String stdName = input.next();


            if(stdName.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdName;

        }
        System.out.println(Arrays.toString(names));


    }

}
