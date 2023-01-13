package teamsoru;

import java.util.Arrays;

public class Soru04 {
    public static void main(String[] args) {
      /*Asagıdaki multi dimensional array'lerin ic array'lerinde tum elemanlarin toplamini
    birer birer bulan ve her bir sonucu yeni bir array' in elemani yapan ve yeni array' i
    ekrana yazdiran bir program yapiniz.
        int arr[][]={{1,2,3},{4,5},{6,7}};
     */

        int arr[][]={{1,2,3},{4,5},{6,7}};

        int brr[] = new  int[arr.length];
         int idx = 0;

         for (int []w : arr){
             int sum = 0;
             for (int k:w){
                sum+=k;
             }brr[idx]=sum;
             idx++;
         }
        System.out.println(Arrays.toString(brr));
    }
}
