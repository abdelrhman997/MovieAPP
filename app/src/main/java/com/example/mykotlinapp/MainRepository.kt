package com.example.mykotlinapp

import com.example.mykotlinapp.Utils.RetrofitService

class MainRepository  constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}