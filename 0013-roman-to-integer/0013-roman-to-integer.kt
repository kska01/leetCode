class Solution {
    fun romanToInt(s: String): Int {
        var result = 0
        val map = mapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        
        s.forEachIndexed { idx, char ->
            val value = map[char] ?: 0 
            
            if (idx == s.lastIndex) {
                result += map[char] ?: 0
                return result
            }

            if (value < (map[s[idx + 1]] ?: 0)) {
                result -= value
            } else {
                result += value
            }
        }

        return result
    }
}