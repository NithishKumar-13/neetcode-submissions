class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int k = result.length - 2;
        int maxSoFar = arr[arr.length - 1];
        result[result.length - 1] = -1;
        for (int i=arr.length-2; i >=0; i--) {
            int num = arr[i];
            result[k--] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, num);
        }
        return result;
    }
}