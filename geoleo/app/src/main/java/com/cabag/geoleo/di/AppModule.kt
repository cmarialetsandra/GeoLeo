package com.cabag.geoleo.di

import com.cabag.geoleo.data.network.remoteDataSourceModule
import com.cabag.geoleo.repository.*
import com.cabag.geoleo.ui.viewModels.MuseoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MuseoViewModel(get()) }

    single<MuseoRepository> {
        MuseoRepositoryImpl(get())
    }
}
val allAppModules = listOf(appModule, remoteDataSourceModule)