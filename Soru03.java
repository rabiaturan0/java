package teamsoru;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
        // Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negatif sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin  ve negatif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
       int toplam = 0;
       int negatifToplam = 0;
       int counter =0;
       int negatifCounter =0;
        System.out.println("Lutfen bir sayi giriniz \nbitirmek icin sifira basiniz");
       do {

           int sayi = input.nextInt();
           if (sayi==0){
               break;
           }
           if (sayi<0){
               negatifToplam+=sayi;
               negatifCounter++;
           }
           if (sayi>0){
               toplam+=sayi;
               counter++;
           }

       }while (true);

        System.out.println(counter + "tane pozitif sayi girilmistir");
        System.out.println("girilen pozitif sayilarin toplami " + toplam);
        System.out.println(negatifCounter + "tane negatif sayi girilmistir");
        System.out.println("girilen negatif sayilarin toplami "+negatifToplam);




    }
}
