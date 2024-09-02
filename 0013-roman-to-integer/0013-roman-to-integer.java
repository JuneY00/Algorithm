class Solution:
    def romanToInt(self, s: str) -> int:
            
        roMap = {}
        roMap['I'] = 1
        roMap['V'] = 5
        roMap['X'] = 10
        roMap['L'] = 50
        roMap['C'] = 100
        roMap['D'] = 500
        roMap['M'] = 1000
        ans = 0


        for i in range(len(s)):
            
            if i < len(s)-1 and roMap[s[i]] < roMap[s[i+1]]:
                ans -= roMap[s[i]]
            else:
                ans += roMap[s[i]]
        
        
        return ans
        