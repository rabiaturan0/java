package day01_bireysel;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

         /*
           Kullanicidan gun ismi aliniz ve gun ismini ekrana yazdiriniz
            1 ==> Pazar    2 ==> pazartesi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi gir");
        byte gunNo = input.nextByte();

        //if
        if (gunNo==1){
            System.out.println("pazar");
        }else if (gunNo==2){
            System.out.println("pazartesi");
        }else if (gunNo==3){
            System.out.println("sali");
        }else if (gunNo==4){
            System.out.println("carsamba");
        }else if (gunNo==5){
            System.out.println("persembe");
        }else if (gunNo==6){
            System.out.println("cuma");
        }else if (gunNo==7){
            System.out.println("cumartesi");
        }else{
            System.out.println("gecerli bir gun giriniz ");
        }

        //switch
        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecerli bir gun gir");
        }
    }
}
