class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int nextValidPos = 0;
        for (int num : arr2) {
            for (int i=nextValidPos; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    int temp = arr1[nextValidPos];
                    arr1[nextValidPos] = num;
                    arr1[i] = temp;
                    nextValidPos++;
                }
            }
        }
        Arrays.sort(arr1, nextValidPos, arr1.length);
        return arr1;   
    }
}