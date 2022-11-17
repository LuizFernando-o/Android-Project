package br.unicap.android_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.unicap.android_project.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_about, container, false)

        view.findViewById<ImageView>(R.id.about_img_lfl).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_to_about_Luiz_Fernando_Leite)
        }

        view.findViewById<ImageView>(R.id.about_img_lfs).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_to_about_Luiz_Fernando_Soares)
        }

        view.findViewById<ImageView>(R.id.about_img_fln).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_navigation_about_to_about_Fabio_Lucas)
        }

        return view


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}