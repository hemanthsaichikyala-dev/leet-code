class Solution:
    def reverse(self, x: int) -> int:
        if x >= 0:
            reversed_x = int(str(x)[::-1])
        else:
            x = abs(x)
            reversed_x = int(str(x)[::-1]) * -1

        
        if reversed_x >= 2**31 - 1 or reversed_x <= -2**31:
            return 0
        else:
            return reversed_x


s = Solution()
print(s.reverse(123))
