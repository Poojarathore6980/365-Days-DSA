class Solution {
    public int maxArea(int[] height) {
        int left_pointer=0;
        int right_pointer=height.length-1;
        int max_water=0;
        while(left_pointer < right_pointer){
            int width = right_pointer-left_pointer;
            int min_height = Math.min(height[left_pointer],height[right_pointer]);
            int current_water= width * min_height;
            max_water = Math.max(max_water,current_water);
            if(height[left_pointer]<height[right_pointer]){
                left_pointer++;
            }
            else{
                right_pointer--;
            }

        }
        return max_water;
    }
}
