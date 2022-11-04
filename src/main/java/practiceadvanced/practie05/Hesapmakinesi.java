package practiceadvanced.practie05;

public class Hesapmakinesi {

    public void toplama(int...a){
        int toplam = 0;
        for (int w:a) {
            toplam +=w;

        }
        System.out.println("Toplam = " + toplam);
    }
    public void chikarma(int a, int b){

        System.out.println("Farki =" + (a-b));

    }
    public void charpma(int... a){
        int charpim = 1;
        for (int w:a) {
            charpim *= w;
        }
        System.out.println("Charpim = " + charpim);
    }
    public void bolme(double a, double b){
        if (b==0){
            System.out.println("Bolen sayi 0 olamaz:");
        }else {
            System.out.println("Bolum = " + a/b);
        }

    }
}
