import java.util.Arrays;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,10,15,18,20,25,29,35,37,41,56,74,88,93,100};
        int target = 35 ;
        System.out.println(findRange(arr , target));
    }
   public static int findRange(int[] arr ,int target){
        int start = 0 ;
        int end = 1 ;

        while(arr[end] < target){
            int newStart = end + 1 ;
            end = end + (end - start + 1)*2;
            start = newStart ;
        }
        return binarySearch(arr , target , start ,end);
    }

    public static int binarySearch(int[] arr , int target , int start , int end){

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                return mid ;
            }
        }
        return -1;
    }
}
