class Solution {

    public void rev(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] arr, int k) {

        k = k % arr.length;

        rev(arr, 0, arr.length - 1);

        rev(arr, 0, k - 1);

        rev(arr, k, arr.length - 1);
    }
}