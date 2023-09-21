package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            plusBtn.setOnClickListener{
                presenter.increment()
                presenter.showToast()
                presenter.changeColor()
            }
            minusBtn.setOnClickListener {
                presenter.decrement()
                presenter.showToast()
                presenter.changeColor()
            }
        }
    }

    override fun showCounter(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.counterTv.setTextColor(color)
    }
}