package com.cursosant.transporteapp.ui.horario

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.transporteapp.data.model.Horario
import com.cursosant.transporteapp.databinding.ItemHorarioBinding

class HorarioAdapter : RecyclerView.Adapter<HorarioAdapter.HorarioViewHolder>() {

    private var listaHorarios: List<Horario> = emptyList()

    fun submitList(nuevaLista: List<Horario>){
        listaHorarios = nuevaLista
        notifyDataSetChanged()
    }

    inner class HorarioViewHolder(private val binding: ItemHorarioBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(horario: Horario) {
            binding.txtHora.text = horario.time
            binding.txtUnidad.text = horario.unidad
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorarioViewHolder {
        val binding = ItemHorarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HorarioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HorarioViewHolder, position: Int) {
        holder.bind(listaHorarios[position])
    }

    override fun getItemCount(): Int = listaHorarios.size

}