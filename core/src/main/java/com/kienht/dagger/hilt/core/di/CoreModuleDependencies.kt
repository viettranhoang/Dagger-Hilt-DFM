package com.kienht.dagger.hilt.core.di

import android.app.Application
import com.kienht.dagger.hilt.core.UserModel
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author kienht
 * @since 15/09/2020
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface CoreModuleDependencies {

    fun exposeApplication(): Application

    @UserModelSingletonQualifier
    fun exposeUserManager(): UserModel
}