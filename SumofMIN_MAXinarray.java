public class SumofMIN_MAXinarray {
    public static void main(String[] args){
        int[] a ={3,4,5,5,1};
        int min = a[0];
        int max = a[0];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        sum = min + max;
        System.err.println("the sum is " + sum);
    }
}
