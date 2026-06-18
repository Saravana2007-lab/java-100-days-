//largest of three
//author- Saravana 

import java.util.Arrays;
import java.util.Scanner;

public class Avarageofarray {
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
        double avg = (double) sum / a;
        System.out.println("Array: " + Arrays.toString(b));
        System.out.println("Sum: " + sum);
        System.out.println("Avarage: " + avg);
        sc.close();
    }
}
