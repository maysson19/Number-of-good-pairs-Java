public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 2, 3, 1, 1, 3};
    int goodPairs = solution.numIdenticalPairs(nums);
    System.out.println("Number of good pairs: " + goodPairs);
}