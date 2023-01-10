package gdjytxdftx;

import java.util.Scanner;
 import java.util.Arrays;
public class Fljihkgh09 {

        public static void main(String[] args) {

        /*
                           ****SAYI OYUNU NASIL OYNANIR****
            1- Oyunculardan biri 0 ile baslamayan, rakamlari birbirinden farkli 4 basamakli bir sayi yazar.
            2- Diger oyuncu asagidaki ipuclarini kullanarak en fazla 10 adimda sayiyi bulmaya calisir.
            * Tahminde bulundugu herbir sayi icin;
                    - program gercek sayi ile ayni basamakta eslesen herbir rakam icin +1 deger artirir
                    - gercek sayida var olan, ama farkli basamakta yer alan her bir rakam icin -1 deger artirir.
              Program tarafindan verilen ve gercek sayiya ne kadar yaklasildigini gosteren bu + ve - degerlerin degerlendirilmesiyle
              asil sayi bulunmaya calisilir.

             *** ORNEK ***
             Oyuncunun girdigi sayi: 9261 olsun
             *2. Oyuncunun 1. Tahmini: 1234 olursa program "+1, -1" verecektir. Cunku 2 ve 1 sayisi gercek sayida var.
                                      Bunlardan 2 rakami gercek sayidakiyle ayni basamakta (yuzler) oldugundan program +1 verir.
                                      1 rakami ise gercek sayida birler basamaginda iken tahmin sayisinda binler basamagindadir. Program -1 verir
                                      Tahmin sayisindaki diger 2 rakam (3 ve 4) gercek sayida bulunmadigindan onlara program deger vermez
                           2. Tahmini: 5678 olursa, ayni mantikla program -1 degeri verir( tutturulan 6 rakami icin)
                           3. Tahmini: 9065 olursa +2 verir (yerleriyle beraber dogru tutturulan 9 ve 6 icin)
                ** Bu sekilde tahminler devam ederek sayi bulunmaya calisilir. Kolay gelsin.
         */

            Scanner input = new Scanner(System.in);
            System.out.println("Ayni rakam icermeyen ve 0 ile baslamayan 4 basamakli bir sayi giriniz");
            int sayi = input.nextInt();
            if(sayi/10000>=1||sayi/1000<1) {
                System.out.println("Girdiginiz sayi 0 ile baslamayan, 4 basamakli bir sayi olmalidir\nBastan baslayin");
            }else{

                int sayi4 = sayi % 10;
                int sayi3 = (sayi / 10) % 10;
                int sayi2 = (sayi / 100) % 10;
                int sayi1 = (sayi / 1000) % 10;

                if(sayi1==sayi2 || sayi1==sayi3||sayi1==sayi4||sayi2==sayi3||sayi2==sayi4||sayi3==sayi4){
                    System.out.println("Girdiginiz sayidaki tum rakamlar farkli olmalidir.\nBastan baslayin");

                }else {
                    int array1[] = {sayi1, sayi2, sayi3, sayi4};


                    System.out.println("Lutfen 4 basamakli sayi tahminlerinizi yaziniz. Dogru sayiyi bulmak icin 10 hakkiniz var");
                    int k = 1;
                    do {
                        System.out.println(k + ". sayi tahmininizi giriniz:");
                        int tahmin = input.nextInt();
                        if (tahmin / 10000 >= 1 || tahmin / 1000 < 1) {
                            System.out.println("Girdiginiz sayi 0 ile baslamayan, 4 basamakli bir sayi olmalidir\nBastan baslayin");
                            break;
                        }

                        if (sayi != tahmin) {
                            int sayi44 = tahmin % 10;
                            int sayi33 = (tahmin / 10) % 10;
                            int sayi22 = (tahmin / 100) % 10;
                            int sayi11 = (tahmin / 1000) % 10;

                            if(sayi11==sayi22 || sayi11==sayi33||sayi11==sayi44||sayi22==sayi33||sayi22==sayi44||sayi33==sayi44) {
                                System.out.println("Girdiginiz sayidaki tum rakamlar farkli olmalidir.\nBastan baslayin");
                                break;
                            }

                            int array2[] = {sayi11, sayi22, sayi33, sayi44};


                            int eleman = 2;
                            int counter = 0;

                            if (sayi1 == sayi11) {
                                counter++;
                            }
                            if (sayi2 == sayi22) {
                                counter++;
                            }
                            if (sayi3 == sayi33) {
                                counter++;
                            }
                            if (sayi4 == sayi44) {
                                counter++;
                            }

                            int count = 0;

                            for (int w : array2) {
                                for (int i : array1) {
                                    if (w == i) {
                                        count--;
                                    }
                                }
                            }
                            System.out.println(tahmin + ": +" + counter + ", " + (count + counter));
                        } else {
                            System.out.println("*****Tebrikler! Kazandiniz*****");
                            break;
                        }
                        k++;
                    } while (k <= 10);

                }
            }
            System.out.println("....Malesef bu kez Kaybettiniz....\nUzulmeyin. Tekrar Deneyin.");
        }
    }

