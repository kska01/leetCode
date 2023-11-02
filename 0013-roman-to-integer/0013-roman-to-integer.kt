class Solution {
    fun romanToInt(s: String): Int {
        val numList = mutableListOf<Int>()
        var result = 0
        
        s.forEach() {
            numList.add(
                when (it) {
                    'I' -> 1
                    'V' -> 5
                    'X' -> 10
                    'L' -> 50
                    'C' -> 100
                    'D' -> 500
                    else -> 1000
                }
            )
        }
        
        numList.forEachIndexed { idx, value ->
            if (idx == numList.lastIndex) {
                result += numList[idx]
                return result
            }

            if (numList[idx] < numList[idx + 1]) {
                result -= value
            } else {
                result += value
            }
        }

        return result
    }
}