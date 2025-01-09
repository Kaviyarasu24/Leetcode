class Solution(object):
    def isPalindrome(self, x):
        if x<0:
            return False
        a=str(x)[::-1]
        if a==str(x):
            return True
        else:
            return False
solution=Solution()
n=int(input())
print(solution.isPalindrome(n))

        
        
        