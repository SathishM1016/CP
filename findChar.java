//ceiling

public class findChar {

    public static void main(String[] args) {

        char[] arr = {'a','b','c','e','h'};
        char target = 'i' ;
        System.out.println(letter(arr ,target));
    }
    static char letter(char[] arr , char target){

         int start = 0 ;
         int end = arr.length -1 ;
         int n = arr.length ;

         while(start <= end){

             int mid = (start + end)/2;

             if(arr[mid] < target){
                 start = mid + 1 ;
             }
             else {
                 end = mid - 1;
             }
         }
         return arr[start % n]  ;
    }
}
