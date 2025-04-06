class Maximum_Points {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        int max = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int curr = 2;
                for (int k = j + 1; k < n; k++) {
                    if (isSame(points[i], points[j], points[k])) curr++;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }

    private boolean isSame(int[] a, int[] b, int[] c) {
        return (a[0] - b[0]) * (b[1] - c[1]) == (b[0] - c[0]) * (a[1] - b[1]);
    }
}