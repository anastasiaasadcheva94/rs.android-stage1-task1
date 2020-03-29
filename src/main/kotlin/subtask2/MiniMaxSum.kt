package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val input: IntArray = input
        val sum: IntArray = input
        val answer = input.sum()

        var a = 0
        while (a<input.size) {
            sum [a] = answer - input [a]
            a++
        }

        a = 0
        var min = sum [0]
        while (a<sum.size) {
            if (sum[a]<min)
                min = sum [a]
            a++
        }

        a = 0
        var max = sum [0]
        while (a<sum.size) {
            if (sum[a]>max)
                max = sum [a]
            a++
        }

        val result: IntArray = intArrayOf(min, max)
        return result
    }
}
