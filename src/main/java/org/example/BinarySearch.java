package org.example;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class BinarySearch
{

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = Math.floorDiv(left + right, 2); // index number
            int midValue = arr[mid];

            if (midValue == target) {
                return mid; // returns index number
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }

    public static void main( String[] args )
    {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 58;
        System.out.println(binarySearch(searchable, target));
    }
}

// Binary search explanation
/* arr = [1, 3, 5, 7, 9, 11, 13]

search for 9.


Initial state:

left = 0, right = 7 (length of array)
mid = (0 + 7) // 2 = 3 (index)
arr[mid] = 7 (index 3)
Since 7 < 9, the target must be in the right half.
update left = mid (index 3) + 1 = 4
ignore the left half of the array ([1, 3, 5, 7]).

Next iteration:

left = 4, right = 7
mid = (4 + 7) // 2 = 5 (index)
arr[mid] = 11
Since 11 > 9, the target must be in the left half.
update right = mid = 5.

Next iteration:

left = 4, right = 5
mid = (4 + 5) // 2 = 4
arr[mid] = 9
Now arr[mid] == 9, so the target is found at index 4.

*/
