class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            if (isVowel(arr[i])) {
                while(i < j){
                    if (isVowel(arr[j])){
                        char temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return new String(arr);
    }

    private boolean isVowel(char b) {
        return "aeiouAEIOU".indexOf(b) != -1;
    }
}