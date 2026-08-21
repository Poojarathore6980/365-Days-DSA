class Solution {
    public int minPlatform(int arr[], int dep[]) {
       int platform = 0;
       int max=0;
       Arrays.sort(arr);
       Arrays.sort(dep);
       int i =0;
       int j =0;
       while(i<arr.length && j<dep.length){
           if(arr[i]<=dep[j]){
               platform++;
               i++;
               max=Math.max(platform,max);
           }
           else{
               platform--;
               j++;
           }
       }
       return max;
         
        
    }
}
