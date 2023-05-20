import java.util.*

object Solution {
    fun maxFrequencyNumber(arr: IntArray): Int {
        val n = arr.size
        Arrays.sort(arr)

        // find the max frequency using linear traversal
        var max_count = 1
        var res = arr[0]
        var curr_count = 1
        for (i in 1 until n) {
            if (arr[i] == arr[i - 1]) curr_count++ else {
                if (curr_count > max_count) {
                    max_count = curr_count
                    res = arr[i - 1]
                }
                curr_count = 1
            }
        }

        // If last element is most frequent
        if (curr_count > max_count) {
            max_count = curr_count
            res = arr[n - 1]
        }
        return res
    }
}