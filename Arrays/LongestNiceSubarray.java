package Arrays;

public class LongestNiceSubarray {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 11, 13};
        int ans = solution(arr);
        System.out.println(ans);
    }

    public static int solution(int arr[]) {
        int left = 0, bitMask = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            while ((bitMask & arr[right]) != 0) {
                bitMask ^= arr[left];
                left++;
            }
            bitMask |= arr[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
