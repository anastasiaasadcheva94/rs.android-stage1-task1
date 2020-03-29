package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val input = inputString.toList()
        val inputString = inputString
        var i = 0
        var string = ""
        var string2 = ""
        var result: MutableList<String> = mutableListOf()
        var result1: MutableList<String> = mutableListOf()

        while (i < input.size) {
            if (input[i] == '<' || input[i] == '(' || input[i] == '[') {
                string = inputString.substringAfter(input[i])
                result.add(string)
            }

            if (input[i] == '>' || input[i] == ')' || input[i] == ']'){
                string2 = string.substringBefore(input[i])
                result1.add(string2)
                i++
            }

            else i++

        }

        return result1.toTypedArray()
    }
}
