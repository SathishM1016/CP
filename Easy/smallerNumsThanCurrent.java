import java.util.Arrays;

public class smallerNumsThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,1,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent( nums)));
    }
    public static int[] smallerNumbersThanCurrent( int[] nums){
        int[] arr = new int[nums.length];
        int count= 0 ;

        for (int i=0 ; i<nums.length ; i++) {
            for (int j=0 ; j<nums.length ; j++) {
                if(nums[j]!=nums[i] && nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
            count=0;
        }
        return arr;
    }
}
