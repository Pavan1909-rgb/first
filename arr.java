// import java.util.Arrays;
public class arr {
    int count = 0;
    static int printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    public static int startat(int[] arr, int value){
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = value;
       for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]+" ");
       }
        return 0;
    }
    public static void main(String[] args) {
      int arr[] = {3,6,7,3,2,12};
    //   printarr(arr);
      
        startat(arr, 100);
    }
    
}


