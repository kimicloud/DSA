public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {67, 3, 2, 4, 5, 6, 9, 20, 23};

        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
