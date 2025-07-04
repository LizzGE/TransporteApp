package com.cursosant.transporteapp.data.local

import com.cursosant.transporteapp.data.model.Horario

object FakeData {

    fun horarioPueblo(): List<Horario> {
        return listOf(
            Horario("06:00 AM", "Urvan #1"),
            Horario("07:00 AM", "Urvan #2"),
            Horario("09:00 AM", "Urvan #3"),
            Horario("10:00 AM", "Urvan #4"),
            Horario("11:20 AM", "Urvan #5"),
            Horario("12:30 PM", "Urvan #6"),
            Horario("14:00 PM", "Urvan #7"),
            Horario("15:00 PM", "Urvan #8"),
            Horario("16:00 PM", "Urvan #9")
        )
    }

    fun horarioCiudad(): List<Horario> {
       return listOf(
           Horario("08:10 AM", "Urvan #1"),
           Horario("09:20 AM", "Urvan #2"),
           Horario("11:00 AM", "Urvan #3"),
           Horario("12:30 AM", "Urvan #4"),
           Horario("14:00 AM", "Urvan #5"),
           Horario("15:10 PM", "Urvan #6"),
           Horario("16:20 PM", "Urvan #7"),
           Horario("17:30 PM", "Urvan #8"),
           Horario("18:30 PM", "Urvan #9")
       )
   }

}