package com.example.navigationlogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationlogin.databinding.FragmentInitBinding

class InitFragment : Fragment() {
    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSend.setOnClickListener{
            val bundle = bundleOf("Mail" to binding.etMail.text.toString(),
                "Telefono" to binding.etTelf.text.toString(),
                "Name" to binding.etNombre.text.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment,bundle)
        }
//        binding.btnSend.setOnClickListener {
//            val action = InitFragmentDirections.actionInitFragmentToFirstFragment()
//            view.findNavController().navigate(action)
//        }
    }
    }