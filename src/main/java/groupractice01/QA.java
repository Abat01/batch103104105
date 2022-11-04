package groupractice01;

public class QA {
    public static void main(String[] args) {

        int baslangic=10;
        int bitis=50;
        int artisMiktari=5;
        for (int i = baslangic; i <=bitis ; i+=artisMiktari) {
            if(i<bitis){
                System.out.print(i+",");
            }else
                System.out.println(i);
        }

    }

}

