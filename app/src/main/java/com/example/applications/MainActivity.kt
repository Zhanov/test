package com.example.applications

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            var editText1 = binding.editTextNumber1.text.toString()
            var editText2 = binding.editTextNumber2.text.toString()
            var editTextSymbol = binding.editTextSymbol.text.toString()
            var res = 0
            if (editText1 == null || editText2 == null || editTextSymbol == null) {
                binding.tvResult.text = "write number"
            }
            else {
                if (editTextSymbol == "1") {
                    res = editText1.toInt() + editText2.toInt()
                    binding.tvResult.text = res.toString()
                }
                else if (editTextSymbol == "2") {
                    res = editText1.toInt() - editText2.toInt()
                    binding.tvResult.text = res.toString()
                }
                else if (editTextSymbol == "3") {
                    res = editText1.toInt() * editText2.toInt()
                    binding.tvResult.text = res.toString()
                }
                else if (editTextSymbol == "4") {
                    res = editText1.toInt() / editText2.toInt()
                    binding.tvResult.text = res.toString()
                }
                else {
                    binding.tvResult.text = "Wrong symbol"
                }
            }
        }
    }
}