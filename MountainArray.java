public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,4,2,1};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;

        while(start < end){
            int mid = (start + end)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid ;
            }
            else {
                start = mid + 1;
            }
        }
        return start ;
    }
}
