package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "bon appetit"
        val input: IntArray = bill
        val check = input.sum() // сумма всего
        //val b: Int

        val actual: Int = (check - input [k])/2 // сумма без еды Анны
        val anna:Int
        //val h: Int = actual/2
        if (actual == b)
            return  fairlySplit
        else
            anna = b - actual
        return anna.toString()
    }
}
