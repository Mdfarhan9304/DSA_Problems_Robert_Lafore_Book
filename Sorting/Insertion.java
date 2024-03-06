package Sorting;

public class Insertion {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
         int current=arr[i];
         int j= i-1;
         while(j>=0 &&  arr[j]>current){
             arr[j+1]= arr[j];
             j--;
         }
         arr[j+1]= current;
        }
     }

     public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

     public static void main(String[] args) {
        int arr[]= {7, 3, 9, 6, 1, 5};
        insertion(arr);
        printArr(arr);
     }
}
