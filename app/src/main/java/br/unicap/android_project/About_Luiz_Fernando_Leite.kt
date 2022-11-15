package br.unicap.android_project

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import br.unicap.android_project.databinding.ActivityAboutLuizFernandoLeiteBinding

class About_Luiz_Fernando_Leite : AppCompatActivity() {

    private lateinit var binding: ActivityAboutLuizFernandoLeiteBinding
    var song1Player: MediaPlayer? = null;
    var song2Player: MediaPlayer? = null;
    var song3Player: MediaPlayer? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_luiz_fernando_leite)
        song1Player = MediaPlayer.create(this, R.raw.song1)
        song2Player = MediaPlayer.create(this, R.raw.song2)
        song3Player = MediaPlayer.create(this, R.raw.song3)

        song1Player?.start()
        song2Player?.start()
        song3Player?.start()
        song1Player?.pause()
        song2Player?.pause()
        song3Player?.pause()

        binding = ActivityAboutLuizFernandoLeiteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButtonLFL.setOnClickListener { back() }
        binding.song1Button.setOnClickListener { playSong1() }
        binding.song2Button.setOnClickListener { playSong2() }
        binding.song3Button.setOnClickListener { playSong3() }

    }

    private fun back() {
        val back = Intent(this, About::class.java)
        startActivity(back)
    }

    private fun playSong1() {
        var playPause1 : ImageButton = findViewById(R.id.song1Button)
        var playPause2 : ImageButton = findViewById(R.id.song2Button)
        var playPause3 : ImageButton = findViewById(R.id.song3Button)
        if (song1Player?.isPlaying == false) {

            playPause1.setImageResource(R.drawable.ic_baseline_pause_circle_24)
            playPause2.setImageResource(R.drawable.ic_baseline_play_circle_24)
            playPause3.setImageResource(R.drawable.ic_baseline_play_circle_24)
            song1Player?.start()
            song2Player?.pause()
            song3Player?.pause()
        } else {
            playPause1.setImageResource(R.drawable.ic_baseline_play_circle_24)
            song1Player?.pause()
        }
    }

    private fun playSong2() {
        var playPause1 : ImageButton = findViewById(R.id.song1Button)
        var playPause2 : ImageButton = findViewById(R.id.song2Button)
        var playPause3 : ImageButton = findViewById(R.id.song3Button)
        if (song2Player?.isPlaying == false) {
            playPause1.setImageResource(R.drawable.ic_baseline_play_circle_24)
            playPause2.setImageResource(R.drawable.ic_baseline_pause_circle_24)
            playPause3.setImageResource(R.drawable.ic_baseline_play_circle_24)
            song1Player?.pause()
            song2Player?.start()
            song3Player?.pause()
        } else {

            playPause2.setImageResource(R.drawable.ic_baseline_play_circle_24)

            song2Player?.pause()
        }
    }

    private fun playSong3() {
        var playPause1 : ImageButton = findViewById(R.id.song1Button)
        var playPause2 : ImageButton = findViewById(R.id.song2Button)
        var playPause3 : ImageButton = findViewById(R.id.song3Button)
        if (song3Player?.isPlaying == false) {
            playPause1.setImageResource(R.drawable.ic_baseline_play_circle_24)
            playPause2.setImageResource(R.drawable.ic_baseline_play_circle_24)
            playPause3.setImageResource(R.drawable.ic_baseline_pause_circle_24)
            song1Player?.pause()
            song2Player?.pause()
            song3Player?.start()
        } else {
            playPause3.setImageResource(R.drawable.ic_baseline_play_circle_24)
            song3Player?.pause()
        }
    }
}