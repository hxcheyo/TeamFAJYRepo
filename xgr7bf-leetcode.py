#Faris Vadakoot
#xgr7bf
#Week 3
class Solution(object):
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        else:
            return True
        b = 0
        
        while x > b:
            b = b*10+x%10
            x /= 10
        return x == b or x == b/10