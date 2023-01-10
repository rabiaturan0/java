package day01_bireysel;

public class NestedIf {
    public static void main(String[] args) {
         /*
            Password'un ilk harfi buyuk harf ise
                'A' olursa gecerli password aksi halde gecersiz password
            Password'un ilk harfi kucuk harf ise
                'z' olursa gecerli password aksi halde gecersiz password

            Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
                  Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.
        */

        String pwd = "mShf98!";
        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z') {
            if (ilkHarf == 'A') {

                System.out.println("gecerli password");
            }else{
                System.out.println("gecersiz password");
            }
        } else if (ilkHarf>='a' && ilkHarf<='z') {
            if (ilkHarf == 'z') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }

        }else{
            System.out.println("ilk harf karakter olmalidir");
        }

    }
}
