package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk harf ise
         'A' olursa gecerli password aksi halde gecersiz password
         Password'un ilk harfi kucuk harf ise
         'z' olursa gecerli password aksi halde gecersiz password

         */

        String pwd = "5zxy12!";
        char ilkHarf = pwd.charAt(0);


        if (ilkHarf=='A' && pwd.charAt(0)<='z'){


            if(ilkHarf=='A'){

                System.out.println("Gecherli Password");

            }else{

                System.out.println("Gecersiz Passord");

            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){

            if(ilkHarf=='z'){

                System.out.println("Gecherli Password");

            }else{
                System.out.println("Gecersiz Passord");
    }
}else{
            System.out.println("Ilk karakter harf olmalidir..."); //stringdeki 5 ichin yapilmishti
        }
    }
}
