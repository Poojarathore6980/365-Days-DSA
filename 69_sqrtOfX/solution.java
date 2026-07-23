package 69_sqrtOfX;

public class solution {
    
}
class Solution {
    public int mySqrt(int x) {
       int right=x;
       int left=0;
       
       while(left<=right){
         int mid=(left+right)/2;
         long sqr=(long)mid*mid;
         if(sqr==x){
            return mid;
         }
         else if(sqr<x){
            left=mid+1;
         }
         else{
         right=mid-1;
       }
       }
       return right;
    }
}