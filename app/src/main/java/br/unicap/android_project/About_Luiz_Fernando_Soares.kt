package br.unicap.android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.unicap.android_project.databinding.ActivityAboutLuizFernandoSoaresBinding

    private lateinit var binding: ActivityAboutLuizFernandoSoaresBinding
        setContentView(R.layout.activity_about_luiz_fernando_soares)

        binding = ActivityAboutLuizFernandoSoaresBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButtonLFS.setOnClickListener { back() }
    private fun back(){
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)

        
    }
