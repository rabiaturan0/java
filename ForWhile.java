import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class ForWhile {
    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        List<String> list = new ArrayList<>();
        int a = 0;


        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])&&!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }

        }
        System.out.println(list);




    }

}