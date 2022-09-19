package kg.geektech.counterapp46

import kg.geektech.counterapp46.model.CounterModel
import kg.geektech.counterapp46.presenter.Presenter
import kg.geektech.counterapp46.view.CounterView

class Injector {

    companion object {
        fun getPresenter() : Presenter {
            return Presenter()
        }
        fun getModel() : CounterModel {
            return CounterModel()
        }
    }
}