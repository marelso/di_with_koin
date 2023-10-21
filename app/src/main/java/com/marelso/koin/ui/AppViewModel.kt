package com.marelso.koin.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _name = mutableStateOf("Marelso")
    val name: State<String> = _name

    fun getImage() = "https://cdn.openai.com/dall-e-api-now-available-in-public-beta/draft-20221102a/1-original.jpg"

    fun updateName(name: String) { _name.value = name }
}