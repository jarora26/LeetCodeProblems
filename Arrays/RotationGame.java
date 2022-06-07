/*Problem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109


Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.


Output Format
Print array A after rotating it B times towards the right.


Example Input
Input 1 :
4 1 2 3 4
2


Example Output
Output 1 :
3 4 1 2


Example Explanation
Example 1 :

N = 4, A = [1, 2, 3, 4] and B = 2.

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

Final array = [3, 4, 1, 2] */




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





