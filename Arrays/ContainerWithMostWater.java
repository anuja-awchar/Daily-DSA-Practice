public class ContainerWithMostWater {
    public int maxArea(int[] height) {
      // initialize 2 pointers
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxWater = Math.max(maxWater, area);

            // move smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
