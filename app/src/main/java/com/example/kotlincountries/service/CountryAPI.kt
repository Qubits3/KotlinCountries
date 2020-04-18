package com.example.kotlincountries.service

import com.example.kotlincountries.model.Country
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface CountryAPI {

    //https://raw.githubusercontent.com/Qubits3/KotlinCountries/master/countrydataset.json
    //Base URL -> https://raw.githubusercontent.com/
    //Extension -> Qubits3/KotlinCountries/master/countrydataset.json

    @GET("Qubits3/KotlinCountries/master/countrydataset.json")
    fun getCountries():Single<List<Country>>


}