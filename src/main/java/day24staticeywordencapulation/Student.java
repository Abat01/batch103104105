package day24staticeywordencapulation;

//Encapsulation: "Data Hiding(Gizlemek)" demektir.
//Data'yi nicin gizlersiniz? Data'yi dis etkenlerden korumak için.
//Data'yi nasil gizlersin? Access Modifier'ini "private" yaparak gizlerim.
//Data'yi gizledikten sonra başka Class'lardan okumak istersen ne yaparsin?
//"get method'lar(getter)" oluşturarak gizlediğimiz data'lari okunur hale getirebiliriz.
//Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
//"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.
//Variable'ın "data type" ı ile get method'un "return type" ı aynı olmalıdır.
//"get method"ları isimlendirirken "get + <variable name>" ancak variable'ın data type' ı "boolean" ise "is + <variable name>"

public class Student {

    public String stdName = "Carl Sagan";
    private String sdtId = "CS202202";
    private double gpa  = 4.0 ;
    private boolean retired = false ;


    public String getSdtId() {
        return sdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }
}

