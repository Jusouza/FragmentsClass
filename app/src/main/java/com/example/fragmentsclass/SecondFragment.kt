package com.example.fragmentsclass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentsclass.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        binding.content.text = "${args.name} has ${args.age}"

        return binding.root
    }

}