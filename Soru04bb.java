package teamsoru;

import java.util.Arrays;

public class Soru04bb {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = new int[arr.length];
        int idx = 0;

        for (int w : arr){
            brr[idx] = w;
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }
}
