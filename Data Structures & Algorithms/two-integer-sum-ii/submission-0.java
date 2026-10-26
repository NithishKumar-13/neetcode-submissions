class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < numbers.length; i++) {
            int remaining = target - numbers[i];
            if (map.containsKey(remaining)) {
                result[0] = map.get(remaining);
                result[1] = i+1;
                break;
            }
            map.put(numbers[i], i+1);
        }

        return result;
    }
}
