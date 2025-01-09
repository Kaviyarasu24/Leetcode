class Solution:
    def prefixCount(self, words: list[str], pref):
        count = 0
        for word in words:
            if word.startswith(pref):
                count += 1
        return count
    
solution = Solution()
words = ["pay","attention","practice","attend"]
pref = "at"
print(solution.prefixCount(words, pref)) 