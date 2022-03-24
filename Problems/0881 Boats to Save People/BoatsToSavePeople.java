//https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count = 0;
        while(i<=j) {
            if(i==j) {
                i++;
                j--;
            } else if(people[i]+people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            count++;
        }
        return count;
    }
}

//Simpliefied Version
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count = 0;
        while(i<=j) {
            if(people[i]+people[j] <= limit) {
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}
