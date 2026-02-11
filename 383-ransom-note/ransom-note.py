from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        rn = Counter(ransomNote)
        mg = Counter(magazine)
        
        for ch in rn:
            if rn[ch] > mg[ch]:
                return False
        return True
