package com.example.laboratorio05.ui.movie

import android.media.audiofx.AudioEffect.Descriptor
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.databinding.FragmentNewMovieBindingImpl
import java.util.Locale.Category
import javax.crypto.spec.DESKeySpec
import javax.microedition.khronos.egl.EGLDisplay

class NewMovieFragment : Fragment() {
    private val movieViewModel : MovieViewModel by activityViewModels { MovieViewModel.Factory }
    private lateinit var binding: FragmentNewMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewMovieBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}