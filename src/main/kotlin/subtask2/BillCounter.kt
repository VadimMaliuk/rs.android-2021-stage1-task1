package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (bill.sum() - bill[k]) / 2
        if (sum < b) {
            return ((b - sum).toString())
        } else {
            return ("Bon Appetit")
        }
    }
}

