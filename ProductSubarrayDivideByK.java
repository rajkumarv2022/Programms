public class ProductSubarrayDivideByK {
    public static int fun(int arr[], int k) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        
        // If the total sum is already divisible by k
        if (totalsum % k == 0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        
        // Iterate over all possible subarrays
        for (int sp = 0; sp < arr.length; sp++) {
            int sum = totalsum;
            for (int ep = sp; ep < arr.length; ep++) {
                sum -= arr[ep];

                // Check if removing this subarray makes the remaining sum divisible by k
                if (sum % k == 0) {
                    int len = ep - sp + 1;
                    // Ensure we do not remove the entire array
                    if (arr.length - len > 0) {
                        ans = Math.min(ans, len);
                    }
                }
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3};
        int k = 8;
        System.out.println(fun(arr, k));  // Output should be 2 for the subarray [1, 3]
    }
}
