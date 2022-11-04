package day04_ifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {



        int not=88;
        if(not>=90 && not<=100){
            System.out.println("NOtunuz A chok iyi");
        }else if (not<90 && not>= 80){
            System.out.println("Notunuz B iyi");
        } else if (not<80 && not>=70) {
            System.out.println("Notunuz C Orta");


        }  else if (not<70 && not >=60) {
            System.out.println("Notunuz D Gecher");

        }else {
            System.out.println("Notunuz F zayif");
        }


    }
}
