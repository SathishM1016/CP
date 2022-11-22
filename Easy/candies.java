import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class candies {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(nums(candies, extraCandies));

    }

    static List<Boolean> nums(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];

        for (int i : candies) {
            if (max < i) {
                max = i;
            }
        }

        for (int i : candies) {
            list.add(i + extraCandies >= max);
        }
        return list;
    }
}