class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] max_x = new int[n + 1];
        int[] max_y = new int[n + 1];
        int[] min_x = new int[n + 1];
        int[] min_y = new int[n + 1];

        Arrays.fill(min_x, n + 1);
        Arrays.fill(min_y, n + 1);

        for (int[] building : buildings) {
            int x = building[0], y = building[1];
            max_y[y] = Math.max(x, max_y[y]);
            min_y[y] = Math.min(x, min_y[y]);
            max_x[x] = Math.max(y, max_x[x]);
            min_x[x] = Math.min(y, min_x[x]);
        }

        int count = 0;

        for (int[] building : buildings) {
            int x = building[0], y = building[1];
            if (y > min_x[x] && y < max_x[x] && x > min_y[y] && x < max_y[y])
                count++;
        }

        return count;
    }
}