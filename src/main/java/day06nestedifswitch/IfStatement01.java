package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)


        Scanner input = new Scanner(System.in);
        System.out.println("Please give your age...");
        byte age = input.nextByte();

        if (age<0){
            System.out.println("gecherli age giriniz:  ");
        } else if (age<=4) {
            System.out.println("baby");
        } else if (age<=12) {
            System.out.println("child");

            
        } else if (age<=20) {
            System.out.println("teenager");

        } else if (age<=30) {
            System.out.println("adult");


        }else{
            System.out.println("not expected age....");

        }
    }
}
