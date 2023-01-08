package iff;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
     //* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
        //
        //
        //(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
        //
        //Input :
        //
        //John White 1234234534561478
        //
        //Output :
        //
        //Name : J*** W****
        //
        //CCN  : **** **** **** 1478
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kullanici adinizi soyadinizi ve  kredi karti numaranizi  giriniz" );
        String isim = input.next();
        String soyIsim= input.next();
        String kartNo = input.next();

        int isimBoyut = isim.length();
        int soyIsimBoyut = soyIsim.length();
        int kartNoBoyut = kartNo.length();

        System.out.print(isim.substring(0,1).toUpperCase()+isim.substring(1,isimBoyut).replaceAll("[A-Za-z]","*") + " ");
        System.out.print(soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1,soyIsimBoyut).replaceAll("[A_Za-z]","*") + " ");

         if (kartNo.replaceAll("[0-9]","*").length()>0) {
             System.out.println("kart numaraniz sadece rakamlardan olusmalidir");

             if (kartNo.length() != 16) {
                 System.out.println("kart numarasi 16 haneden olusmalidir");

             } else {
                 String newKart = (kartNo.substring(0, 12).replaceAll("[0-9]", "*") + kartNo.substring(12));
                 System.out.println(newKart.substring(0, 4) + " " + newKart.substring(4, 8) + " " + newKart.substring(8, 12) + " " + newKart.substring(12));

             }
         }



    }
}
