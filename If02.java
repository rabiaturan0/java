package ifDersleri;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = input.nextInt();
        if (yas>65){
            System.out.println("emekli olabilirsiniz");

        }else {
            System.out.println("emekli olamazsiniz");
            System.out.println(65-yas+ "yil daha calismalisin");
        }
    }
}
