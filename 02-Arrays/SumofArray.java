// Sum of the array
// author - Saravana
import java.util.Scanner;
import java.util.Arrays;

class SumofArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of your array");
        int a = sc.nextInt();
        int[] b = new int[a];       
         int sum = 0;
        for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
            sum += b[i];
        }
        System.out.println("Array: " + Arrays.toString(b));
        System.out.println("Sum: " + sum);
        sc.close();
    }
}