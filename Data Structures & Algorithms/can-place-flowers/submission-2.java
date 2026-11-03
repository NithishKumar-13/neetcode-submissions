class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = n;
        for (int i=0; i < flowerbed.length; i++) {
            boolean isLeftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean isRightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
            if (flowerbed[i] == 0 && isLeftEmpty && isRightEmpty) {
                flowerbed[i] = 1;
                k--;
            }

            if (k <= 0) return true;
        }
        return k <= 0;
    }
}

