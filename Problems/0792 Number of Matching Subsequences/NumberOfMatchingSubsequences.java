//https://leetcode.com/problems/number-of-matching-subsequences/

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character,Queue<String>> map = new HashMap<Character,Queue<String>>();
        int i,j,res=0,len=s.length(),n=words.length,size;
        for(i=0;i<n;i++)
            add(map,words[i]);
        for(i=0;i<len;i++){
            Queue<String> q = map.getOrDefault(s.charAt(i),new LinkedList<String>());
            size=q.size();
            while(size-->0){
                String word=q.remove().substring(1);
                res+=word.length()==0?1:0;
                add(map,word);
            }
        }
        return res;
    }
    
    public void add(HashMap<Character,Queue<String>> map, String word){
        if(word.length()==0) return;
        Queue<String> q; char ch = word.charAt(0);
        q = map.getOrDefault(ch,new LinkedList<String>());
        q.add(word);
        map.put(ch,q);
    }
}
