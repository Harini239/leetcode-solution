// Last updated: 8/12/2026, 11:17:34 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();  //creating arraylist
        for(int i=0;i<words.length;i++){         //traverse the array
            if(words[i].contains(String.valueOf(x))){ //contains x
             list.add(i);                       // add the index to the arraylist
            }
        }
        return list;  //return the list
    }
}