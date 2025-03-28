package Arrays;

public class SubArrayWithOddSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(odd(arr));
    }

    public static int odd(int arr[]) {
        int mod = 1000000007;
        int odd_count = 0, even_count = 1;
        int prefix_sum = 0, ans = 0;

        for (int num : arr) {
            prefix_sum += num;

            if (prefix_sum % 2 == 0) {
                ans = (ans + odd_count) % mod;
                even_count++;
            } else {
                ans = (ans + even_count) % mod;
                odd_count++;
            }
        }

        return ans;
    }
}
