class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}

// My Way

class Solution {
    public int numberOfSubstrings(String s) {
        int low = 0;
        int high = 0;
        int n = s.length();
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (low = 0; low < n; low++) {
            hm.clear();
            for (high = low; high < n; high++) {
                hm.put(s.charAt(high), hm.getOrDefault(s.charAt(high), 0) + 1);
                if (hm.size() == 3) {
                    count++;
                }
            }
        }
        return count;
    }
}
