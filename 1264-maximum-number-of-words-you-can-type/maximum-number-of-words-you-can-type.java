class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        if (brokenLetters.length() == 0) {
            return arr.length;
        }

        int cnt = 0;

        for (String word : arr) {
            boolean broken = false;

            for (int j = 0; j < word.length(); j++) {
                if (brokenLetters.indexOf(word.charAt(j)) != -1) {
                    broken = true;
                    break;
                }
            }

            if (!broken) {
                cnt++;
            }
        }

        return cnt;
    }
}