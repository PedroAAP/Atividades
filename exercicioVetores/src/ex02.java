import java.util.Arrays;

public class ex02 {
    public static void main(String[] args){
        double [] v = {3.75,2.74,4.2,-3.4};
        int pos = Arrays.binarySearch(v , 1);
        Arrays.sort(v);
        for (double valor: v){
            System.out.print(valor + " ");
        }
    }
}
