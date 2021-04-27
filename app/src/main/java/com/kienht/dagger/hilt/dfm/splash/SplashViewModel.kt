package com.kienht.dagger.hilt.dfm.splash

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.kienht.dagger.hilt.core.UserModel
import com.kienht.dagger.hilt.core.di.UserModelSingletonQualifier
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author kienht
 * @since 13/09/2020
 */
@HiltViewModel
class SplashViewModel @Inject constructor(
    @UserModelSingletonQualifier val singletonUserModel: UserModel,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun get(key: String) = savedStateHandle.getLiveData<String>(key)

    fun put(key: String, value: String) = savedStateHandle.set(key, value)

}