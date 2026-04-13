import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        //backtrack(nums, visited, new ArrayList<>(), result);
        backTrack(nums, visited, new ArrayList<>(), result);
        return result;
    }
      private void  backTrack(int[] nums,boolean[] visited, List<Integer> current, List<List<Integer>> result){
            //base case 
            if(current.size()==nums.length){
                result.add(new ArrayList<>(current));
                return;

            }
            for(int i=0;i<nums.length;i++){
                if(visited[i]) continue;
                //choose
                visited[i]=true;
                current.add(nums[i]);
                //explore
                backTrack(nums,visited,current,result);
                //remove
                current.remove(current.size()-1);
                visited[i]=false;
            }
            
        }
    }
