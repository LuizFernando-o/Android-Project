package br.unicap.android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.unicap.android_project.databinding.ActivityAboutBinding


class About : AppCompatActivity() {


    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.aboutImgLfl.setOnClickListener{(aboutLfl())}
        binding.aboutImgLfs.setOnClickListener{(aboutLfs())}
        binding.aboutImgFln.setOnClickListener{(aboutFln())}
        binding.backButton.setOnClickListener{(back())}
    }
    private fun aboutLfl(){
        val aboutLuizFernandoLeite = Intent(this, About_Luiz_Fernando_Leite::class.java)
        startActivity(aboutLuizFernandoLeite)
    }
    private fun aboutLfs(){
        val aboutLuizFernandoSoares = Intent(this, About_Luiz_Fernando_Soares::class.java)
        startActivity(aboutLuizFernandoSoares)
    }
    private fun aboutFln(){
        val aboutFabioLucas = Intent(this, About_Fabio_Lucas::class.java)
        startActivity(aboutFabioLucas)
    }

    private fun back(){
        val back = Intent(this, MainActivity::class.java)
        startActivity(back)
    }
}