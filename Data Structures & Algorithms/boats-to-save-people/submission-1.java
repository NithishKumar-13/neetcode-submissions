class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boatsNeeded = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                boatsNeeded++;
                i++;
                j--;
            } else if (people[j] <= limit) {
                boatsNeeded++;
                j--;
            } else {
                boatsNeeded++;
                i++;
            }
        }
        return boatsNeeded;
    }
}