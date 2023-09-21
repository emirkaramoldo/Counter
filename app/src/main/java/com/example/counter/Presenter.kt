package com.example.counter

class Presenter(private val view: CounterView) {

    private val model = Injector.getModel()

    fun increment() {
        model.increment()
        view.showCounter(model.count)
        }

    fun decrement() {
        model.decrement()
        view.showCounter(model.count)
    }

    fun showToast() {
        when (model.count) {

            10 -> {
                view.showToast("Поздравляем")
            }
        }
    }

    fun changeColor(){
        when (model.count) {

            15 -> {
                view.changeColor(R.color.green)
            }

            else -> {
                view.changeColor(R.color.black)
            }
        }
    }
}