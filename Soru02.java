package teamsoru;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        //Soru 3: Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        //        Kullanici 0'a bastiginda kac pozitif sayi girdigini ve girdigi pozitif sayilarin toplaminin kac
        //        oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int counter = 0;

        do {
            System.out.println("Lutfen bir sayi giriniz \n bitirmek icin sifira basiniz.");
            int sayi = input.nextInt();
             if (sayi==0){
                 break;
             }
             if (sayi<0){
                 continue;
             }
             toplam+=sayi;
             counter++;

        }while (true);
        System.out.println(counter + "  tane positive sayi girilmistir");
        System.out.println("Girilren positive sayilarin toplami "  + toplam);

    }
}
