package kg.geektech.counterapp46.presenter

import android.widget.Toast
import kg.geektech.counterapp46.Injector
import kg.geektech.counterapp46.R
import kg.geektech.counterapp46.model.CounterModel
import kg.geektech.counterapp46.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    private lateinit var view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateCount(model.getCount())
    }

    fun attachView(view:CounterView) {
        this.view = view
    }
    fun makeToastOnTen() {
        if (model.getCount() == 10) {
            view.makeToast("Поздравляем")
        }
    }
    fun changeColor () {
        view.changeColor(R.color.green)
    }
}