class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String num = "123456789";
        List<Integer> res = new ArrayList<>();

        for (int len = 2; len <= 9; len++) {
            for (int start = 0; start + len <= 9; start++) {
                int value = Integer.parseInt(num.substring(start, start + len));

                if (value >= low && value <= high) {
                    res.add(value);
                }
            }
        }

        return res;
    }
}