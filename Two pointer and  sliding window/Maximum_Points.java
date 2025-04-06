public class Maximum_Points {
    public static int maxpoint(int arr[], int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;

        // Take first k elements from left
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        maxsum = lsum;

        int idx = arr.length - 1;

        // Slide one by one: remove from left, add from right
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];
            rsum += arr[idx--];
            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(maxpoint(arr, k)); // Output: 12 (2 + 3 + 5 or 3 + 4 + 5)
    }
}
