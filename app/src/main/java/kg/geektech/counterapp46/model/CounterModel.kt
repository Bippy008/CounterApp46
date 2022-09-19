package kg.geektech.counterapp46.model

class CounterModel {

    private var count = 0

    fun increment() {
        count++
    }

    fun getCount() : Int {
        return count
    }
}