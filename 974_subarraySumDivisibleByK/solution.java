class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix=0,result=0;
        for(int num : nums){
            prefix+=num;
            //if negetive , then normalise
            int mod = ((prefix%k)+k)%k;
            // If this mod has appeared before, add its frequency to result
            result+=map.getOrDefault(mod,0);
            // Update frequency of this mod
            map.put(mod,map.getOrDefault(mod,0)+1);



        }
        return result;
        
    }
}