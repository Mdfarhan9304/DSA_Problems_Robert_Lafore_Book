package Sorting;
public class Bsort {
    public static  void bsort(int arr[]){
        for(int i=arr.length-1; i>=1;  i-- ){
            for(int j=0; j<i; j++ ){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
             
            }
        }
    
    }

    public static void ssort(int arr[]){
        int min, i, j;
        for( i=0; i<arr.length-1; i++){
             min=i;
            for( j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]= temp;

        }
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
  
    public static void main(String[] args) {
        int arr[]= {3, 6, 2, 9, 1};
        ssort(arr);
        printArr(arr);
    }
}
