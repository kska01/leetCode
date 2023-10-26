class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)

        for ((i,v) in temperatures.withIndex()) {
            for (j in i + 1..temperatures.lastIndex) {
                if (v < temperatures[j]) {
                    answer[i] = j - i
                    break
                }
            }
        }

        return answer
    }
}