package com.victor.todolistandroid.api

import com.victor.todolistandroid.model.Categoria
import retrofit2.Response

class Repository {

	suspend fun listCategoria(): Response<List<Categoria>> {
		return RetrofitInstance.api.listCategoria()
	}
}