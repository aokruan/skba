package ru.aokruan.skba.ui.likes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.aokruan.skba.R
import ru.aokruan.skba.databinding.FragmentLikesBinding

class LikesFragment : Fragment(R.layout.fragment_likes) {

    private lateinit var likesViewModel: LikesViewModel
    private var _binding: FragmentLikesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        likesViewModel =
            ViewModelProvider(this).get(LikesViewModel::class.java)

        _binding = FragmentLikesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
}