class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        int max = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int currentnum = x;
                int currentl = 1;

                while (set.contains(currentnum + 1)) {
                    currentnum++;
                    currentl++;
                }

                max = Math.max(max, currentl);
            }
        }

        return max;
    }
}