class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;

        while (j < chars.length) {
            int count = 1;
            while (j +1 < chars.length && chars[j] == chars[j +1]) {
                j++;
                count++;
            }

            chars[i++] = chars[j];
            if (count >= 10) {
                for(char c : Integer.toString(count).toCharArray())
                    chars[i++] = c;
                }
                else if (count > 1) {
                    chars[i++] = (char) ('0' + count);
                }
                j++;
        }            
        return i;
    }
}