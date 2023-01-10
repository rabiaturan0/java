package ifDersleri;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen meil adresinizi giriniz");
        String mail = input.next();

        if (mail.indexOf("0")==(-1)){
            System.out.println("cecersiz");
        }else {
            System.out.println("gecerli'");
        }

    }

}
