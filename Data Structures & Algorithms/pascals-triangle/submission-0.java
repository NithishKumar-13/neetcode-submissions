class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));
        if (numRows == 1) return triangle;
        triangle.add(Arrays.asList(1,1));
        if (numRows == 2) return triangle;
        for (int i=2; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j=0; j<previousRow.size()-1; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j+1));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}