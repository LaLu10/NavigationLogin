package com.example.navigationlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationlogin.databinding.FragmentFirstBinding
import com.example.navigationlogin.databinding.FragmentInitBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnVolver.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstFragment_to_initFragment, null)
        }
        val datos = "Mail: " + arguments?.getString("Mail") +
                "\nTeléfono: " + arguments?.getString("Telefono") +
                "\nNombre: " + arguments?.getString("Name")

        binding.tvDatosRecogidos.text = datos
    }

}