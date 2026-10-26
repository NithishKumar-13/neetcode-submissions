class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = arr[n - 1];
        arr[n-1] = -1;
        for (int i=n-2; i >= 0; i--) {
            int currEl = arr[i];
            arr[i] = maxSoFar;
            if (currEl > maxSoFar) {
                maxSoFar = currEl;
            } 
        }
        return arr;
    }
}