//Created by Naomi Johnson 
//For CTE software development 1
//Instructor: Mr Gross

/*
This project will sort out the numbers in order using a bubble sort program
*/
public class BubbleSort {
    static void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
         for(int i=0; i < n; i++){
                 for(int x=1; x < (n-i); x++){
                          if(arr[x-1] > arr[x]){
                                 temp = arr[x-1];
                                 arr[x-1] = arr[x];
                                 arr[x] = temp;
                         }

                 }
         }

    }
        public static void main(String[] args) {

                int[] arrayToSort = {1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};

                System.out.println("array before sorting\n");
                for(int i=0; i < arrayToSort.length; i++){
                        System.out.print(arrayToSort[i] + " ");
                }
                
                sort(arrayToSort);

                System.out.println("\n array after sorting\n");
                for(int i=0; i < arrayToSort.length; i++){
                        System.out.print(arrayToSort[i] + " ");
                }

        }
}