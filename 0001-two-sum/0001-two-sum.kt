class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)

        for ((i, v) in nums.withIndex()) {
            for (j in i + 1..nums.lastIndex) {
                if (v + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    break
                }
            }
            if (result[1] != 0) break
        }
        return result
    }
}