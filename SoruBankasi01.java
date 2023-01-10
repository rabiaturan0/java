package day01_bireysel;

import java.util.Scanner;

public class SoruBankasi01 {
    public static void main(String[] args) {
        /*
         Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
         */

        //1)
       Scanner input = new Scanner(System.in);
        System.out.println("ilk ismini gir ");
        String ilkIsim = input.next();

        System.out.println("orta ismini gir ");
        String ortaIsim = input.next();

        System.out.println("soy ismi gr ");
        String soyIsim = input.next();

        System.out.println("kimlik no gir ");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

       //2)
        System.out.println("ilk, orta , soy ve kimlik no ismini gir");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();
        System.out.println(ilk + "" + orta + "" + soy);
        System.out.println(kimlik);

        //3)

        System.out.println("ilk orta soy ismini gir ");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("kimlik no gir ");
        String kimlikkno = input.next();
        System.out.println(kimlikkno);

        /*
        Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
                   Ali Can ==> AC
        */

        //1)
     System.out.println("ilk ismini gir");
     char ilkk = input.next().charAt(0);
     System.out.println("soy ismii gir");
     char soyy = input.next().charAt(0);
     System.out.println(""+ilkk+soyy);

     //2)
        System.out.println("tam isminizi giriniz");
        String tamIsimm = input.nextLine();//Ali Can


        char ilkHarf = tamIsimm.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsimm.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}
