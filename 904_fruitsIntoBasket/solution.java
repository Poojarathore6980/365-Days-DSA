class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int i = 0, maxLen = 0;

        for (int j = 0; j < fruits.length; j++) {
            basket.put(fruits[j], basket.getOrDefault(fruits[j], 0) + 1);

            // Shrink window if more than 2 distinct fruits
            while (basket.size() > 2) {
                basket.put(fruits[i], basket.get(fruits[i]) - 1);
                if (basket.get(fruits[i]) == 0) {
                    basket.remove(fruits[i]);
                }
                i++;
            }

            // Update max length
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}