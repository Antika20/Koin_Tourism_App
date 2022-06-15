package com.dicoding.tourismapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
//import com.dicoding.tourismapp.core.di.databaseModule
//import com.dicoding.tourismapp.core.di.networkModule
//import com.dicoding.tourismapp.core.di.repositoryModule
//import com.dicoding.tourismapp.di.useCaseModule
//import com.dicoding.tourismapp.di.viewModelModule

//class MyApplication : Application() {
//    override fun onCreate() {
//        super.onCreate()
//        startKoin {
//            androidLogger(Level.NONE)
//            androidContext(this@MyApplication)
//            modules(
//                listOf(
//                    databaseModule,
//                    networkModule,
//                    repositoryModule,
//                    useCaseModule,
//                    viewModelModule
//                )
//            )
//        }
//    }
//}

@HiltAndroidApp
open class MyApplication : Application() {
// Hapus karena ada Hilt
//    private val coreComponent: CoreComponent by lazy {
//        DaggerCoreComponent.factory().create(applicationContext)
//    }
//
//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create(coreComponent)
//    }
}