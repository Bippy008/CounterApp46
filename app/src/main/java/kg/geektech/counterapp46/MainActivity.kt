package kg.geektech.counterapp46

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kg.geektech.counterapp46.databinding.ActivityMainBinding
import kg.geektech.counterapp46.presenter.Presenter
import kg.geektech.counterapp46.view.CounterView

class MainActivity : AppCompatActivity(),  CounterView{

    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        binding.incrementBtn.setOnClickListener {
            presenter.incrementCount()
        }
    }

    override fun updateCount(count: Int) {
        binding.coutnerTv.text = count.toString()
        if (count == 10) {
            Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
        } else if (count == 15) {
            binding.coutnerTv.setTextColor(getColor(R.color.green))
        }
    }
}