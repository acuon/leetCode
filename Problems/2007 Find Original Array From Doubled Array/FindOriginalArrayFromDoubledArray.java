//https://leetcode.com/problems/find-original-array-from-doubled-array/

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        int[] ans =  new int[n/2];
        
        // return false if odd elements 
        if((n & 1) > 0){
            return new int[]{};
        }
        
        int index = 0;
        
        // sort array
        Arrays.sort(changed);
        
        // keep 2 pointers to check if double element is present
        for(int i=0, j=1; i< n && j < n && i < j;){
            if(2 *changed[i] == changed[j]){
                
                // if double is found then add in ans & mark those field as -1
                ans[index++] = changed[i];
                changed[i] = -1;
                changed[j] = -1;
                
                // update pointers
                while( i < n && changed[i] == -1){
                    i++;
                }
                
                // make sure j pointer is ahead i pointer
                while(j < n && (changed[j] == -1 || j <= i)){
                    j++;
                }
               
            }else{
                
                // if not found then update j pointer to look ahead
                j++;
            }
        }
        
        // if index is 0 or less than n/2 then all double element is not added in ans
        if(index == 0 || index < n/2){
            return new int[]{};
        }
        
        return ans;
    }
}
