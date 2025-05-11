import java.util.HashSet;

public class PrefixCommonArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 2, 4};
        int arr2[] = {3, 1, 2, 4};
        int ans[] = solution(arr1, arr2);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int arr1[], int arr2[]) {
        int n = arr1.length;
        int[] ans = new int[n];
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(arr1[i]);
            setB.add(arr2[i]);
            int commonCount = 0;
            for (int num : setA) {
                if (setB.contains(num)) {
                    commonCount++;
                }
            }
            ans[i] = commonCount;
        }
        return ans;
    }
}
