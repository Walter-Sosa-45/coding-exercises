# 1_ Fusionar cadenas alternativamente

class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        result =""

        i = 0

        while i < len(word1) and i < len(word2):
            result += word1[i]
            result += word1[i]

            i += 1

        result += word1[i:]
        result += word2[i:]

        return result