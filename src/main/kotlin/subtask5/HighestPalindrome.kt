package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var n = n
        var k = k
        var stroka = digitString.replace('0','9')
        var nums = stroka.toMutableList()

        var i = 0

        while ( i <= n) {
            if (k>=0){
                if (nums [i] != nums [n-1]) {
                    if (nums[n - 1] > nums[i]) {
                        nums[i] = nums[n - 1]
                    } else {
                        nums[n - 1] = nums[i]
                    }
                    k--
                }
                n--
                i++
            } else {
                val result = -1
                return result.toString()
            }
        }

        val result = nums.toString()
        val result1 = result.filter {it. isDigit()}
        return result1
    }
}
