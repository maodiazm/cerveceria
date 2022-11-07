package com.example.lahermandad.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.lahermandad.R
import com.example.lahermandad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.setAnimation(R.raw.bookanimation)
        binding.animationView.playAnimation()

        handler=Handler(Looper.myLooper()!!)
        handler.postDelayed(
            {
                val intent= Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            }, 4000)
    }
}