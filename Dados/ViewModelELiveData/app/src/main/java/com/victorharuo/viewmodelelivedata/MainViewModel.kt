package com.victorharuo.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

	var contador = MutableLiveData<Int>(0)

	fun adicionarNumero() {
		contador.value = contador.value?.plus(1)
	}
}