package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        var newArray = sadArray
        return if (newArray.size>2) {
            do {
                var sadCount = 0
                for (i in 1 until newArray.lastIndex) {
                    if (newArray[i - 1] + newArray[i + 1] < newArray[i]) {
                        sadCount++
                    }
                }
                if (sadCount > 0) {
                    newArray = cleaning(newArray, sadCount)
                }
            } while (sadCount > 0)

            (newArray)
        } else {
            (sadArray)
        }
    }
    private fun cleaning(sadArray: IntArray, sadCount: Int): IntArray{
        val sizeofSadArray = sadArray.size - 2
        val sizeOfHappyArray = sizeofSadArray + 2 - sadCount
        val happyArray1 = IntArray(sizeOfHappyArray)
        happyArray1[0] = sadArray[0]
        happyArray1[sizeOfHappyArray - 1] = sadArray[sizeofSadArray + 1]
        var p = 0
        for (i in 1..sizeofSadArray) {
            if (sadArray[i - 1] + sadArray[i + 1] < sadArray[i]) {
                p++
            } else {
                happyArray1[i - p] = sadArray[i]
            }
        }
        return (happyArray1)
    }
}
