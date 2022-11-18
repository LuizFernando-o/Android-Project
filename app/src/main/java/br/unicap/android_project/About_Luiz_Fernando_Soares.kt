package br.unicap.android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.unicap.android_project.databinding.ActivityAboutLuizFernandoSoaresBinding

class About_Luiz_Fernando_Soares : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_fernando)
        github_fernando.setOnClickListener{
            openGithub()
        }
    }
    private fun openGithub(){
        startActivity( Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Nandincci")))
    }


}

