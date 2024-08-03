package com.jabed.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jabed.navigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    binding.btn1.setOnClickListener{
        findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

    }

        binding.btn2.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)

        }
    }
}