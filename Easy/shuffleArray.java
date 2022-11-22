import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2*n];
        int i=0;
        int j=n;

        for (int k = 0; k < 2*n; k = k+2) {
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            i++;
            j++;
        }
  return arr;
    }

}
