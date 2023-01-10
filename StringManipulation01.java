package day01_bireysel;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
            /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                            i)En az 8 character icermeli
                            ii)Space characteri icermemeli
                            iii)Ilk harfi "M" veya "m" olmali
                            iv)Son characteri "?" olmali
         */

        String pwd = "Mersin17?";
        boolean sart1 = pwd.length()>7;
        boolean sart2 = !pwd.contains(" ");
        boolean sart3 = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        boolean sart4 = pwd.charAt(pwd.length()-1)=='?';
        System.out.println(sart1 && sart2 && sart3 && sart4);




        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //           Ali Can ==> AC       Tahsin Yurdakul ==> TY
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);
    }
}
