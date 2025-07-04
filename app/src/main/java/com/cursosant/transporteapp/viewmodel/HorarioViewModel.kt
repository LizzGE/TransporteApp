package com.cursosant.transporteapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cursosant.transporteapp.data.local.FakeData
import com.cursosant.transporteapp.data.model.Horario

class HorarioViewModel : ViewModel() {

    private val _horarios = MutableLiveData<List<Horario>>()
    val horarios: LiveData<List<Horario>> get() = _horarios

    fun cargarHorarios(origen: String){
        _horarios.value = when (origen) {
            "Pueblo" -> FakeData.horarioPueblo()
            "Ciudad" -> FakeData.horarioCiudad()
            else -> emptyList()
        }

    }

}