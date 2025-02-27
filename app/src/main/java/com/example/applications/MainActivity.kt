package com.example.applications

import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
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

        val mediaDo = MediaPlayer.create(this, R.raw.do_1)
        val mediaRe = MediaPlayer.create(this, R.raw.re)
        val mediaMi = MediaPlayer.create(this, R.raw.mi)
        val mediaFa = MediaPlayer.create(this, R.raw.fa)
        val mediaSol = MediaPlayer.create(this, R.raw.sol)
        val mediaLya = MediaPlayer.create(this, R.raw.lya)
        val mediaSi = MediaPlayer.create(this, R.raw.si)
        val mediaDo2 = MediaPlayer.create(this, R.raw.do_2)


        binding.bntDo.setOnClickListener {
            mediaDo.start()
        }
        binding.bntRe.setOnClickListener {
            mediaRe.start()
        }
        binding.bntMi.setOnClickListener {
            mediaMi.start()
        }
        binding.bntFa.setOnClickListener {
            mediaFa.start()
        }
        binding.bntSol.setOnClickListener {
            mediaSol.start()
        }
        binding.bntLya.setOnClickListener {
            mediaLya.start()
        }
        binding.bntSi.setOnClickListener {
            mediaSi.start()
        }
        binding.bntDo2.setOnClickListener {
            mediaDo2.start()
        }

    }
}