package SearchingSortingalgorithm;

public class insertionsort {
        public void InsertionSort(int[] arr){
        if (arr == null) {
            System.out.println("array is null");
            return;
        }
        if (arr.length == 0) {
            System.out.println("elements not found");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
     public static void main(String[] args) {
    int[] arr = {1,3,2,43,5};
    new insertionsort().InsertionSort(arr);
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }
}
