package kg.geektech.counterapp46.view

interface CounterView {
    fun updateCount(count: Int)
    fun makeToast(message: String)
    fun changeColor(id : Int)
}