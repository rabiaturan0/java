package teamsoru;

public class Soru01bb {
    public static void main(String[] args) {

      /*
       Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
       toplamını yazdıran bir program yazın.
       int[][] arr = {{1, 2}, {3, 4, 5}, {6}};
       int[][] brr = {{7, 8, 9}, {10, 11}, {12}};
      */

        int[][] arr = {{3,5,14,8}, {3,4,5}, {6}};
        int[][] brr = {{7,8,9}, {10,11}, {12},{6,12,9}};

     int toplam = 0;
     int iclength = 0;
     int dislength = Math.min(arr.length,brr.length);

        for (int i = 0; i < dislength; i++) {
            iclength =Math.min(arr[i].length,brr[i].length);
            for (int j = 0; j < iclength; j++) {
                toplam = arr[i][j]+brr[i][j];
                System.out.println("arr[" + i + "][" + j + "] + brr [" + i + "]["+ j + "] : " +  toplam );
            }
        }
    }
}
