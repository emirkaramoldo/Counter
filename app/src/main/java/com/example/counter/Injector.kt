package com.example.counter

class Injector {

    companion object {
        fun getModel(): Model {
            return Model()
        }
        fun getPresenter(view: CounterView):Presenter{
            return Presenter(view)
        }
    }
}