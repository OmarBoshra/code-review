package com.snappymob.coderead.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.snappymob.coderead.android.databinding.ActivityBookDetailsActivtyBinding

class BookDetailsActivty : AppCompatActivity() {

    private lateinit var binding: ActivityBookDetailsActivtyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookDetailsActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}