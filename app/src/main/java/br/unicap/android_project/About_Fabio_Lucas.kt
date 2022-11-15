package br.unicap.android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.unicap.android_project.databinding.ActivityAboutFabioLucasBinding

class About_Fabio_Lucas : AppCompatActivity() {

    private lateinit var binding: ActivityAboutFabioLucasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_fabio_lucas)

        binding = ActivityAboutFabioLucasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButtonFLN.setOnClickListener { back() }

    }
    private fun back(){
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}