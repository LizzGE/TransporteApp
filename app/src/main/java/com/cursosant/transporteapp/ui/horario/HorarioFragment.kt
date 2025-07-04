package com.cursosant.transporteapp.ui.horario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.cursosant.transporteapp.R
import com.cursosant.transporteapp.databinding.FragmentHomeBinding
import com.cursosant.transporteapp.databinding.FragmentHorarioBinding
import com.cursosant.transporteapp.viewmodel.HorarioViewModel

class HorarioFragment : Fragment() {
    private var _binding: FragmentHorarioBinding? = null
    private val binding get() = _binding!!
    private val viewModel: HorarioViewModel by viewModels()
    private lateinit var adapter: HorarioAdapter

    private val args: HorarioFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHorarioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = HorarioAdapter()
        binding.recyclerHorarios.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerHorarios.adapter = adapter

        viewModel.cargarHorarios(args.origen)

        viewModel.horarios.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}