import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            int value = sc.nextInt();
            array[i]= value;
        }
        int rotation = sc.nextInt();
        rotation = rotation%N;
        reverse(array);
        reverseLimit(array,0, rotation);
        reverseLimit(array,rotation,N);
        for(int i=0; i<N; i++){
            System.out.print(array[i]+" ");
        }
    }

        static void reverse(int[] array){
            int N = array.length;
            for(int j=0,k=N-1;k>j;j++,k--){
            int temp = array[j];
            array[j]= array[k];
            array[k]= temp;
        }
    }
    static void reverseLimit(int[] array, int start, int end){
            for(int i=start,j=end-1;j>i;i++,j--){
            int temp = array[i];
            array[i]= array[j];
            array[j]= temp;
        }
 }
}