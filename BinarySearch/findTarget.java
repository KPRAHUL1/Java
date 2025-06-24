package BinarySearch;

public class findTarget {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 18;
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int mid = start +(end-start)/2;
           if (target< arr[mid]) {
               end = mid-1;
           } else if (target>arr[mid]) {
               start=mid+1;
           }
           else{
               System.out.println(arr[mid]);
               return;
           }
        }
        System.out.println(arr[start]);
    }
}
