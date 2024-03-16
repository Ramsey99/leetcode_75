class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String str = "";
        
        for (String i : words){

            if(str == "")
                str = i;
            else
                str = i+ " " + str;
        }
        return str;
    }
}