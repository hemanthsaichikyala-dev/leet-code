import math

class Solution:
    def getRow(self, n: int):
        row = []
        for r in range(n + 1):
            row.append(math.comb(n, r))
        return row