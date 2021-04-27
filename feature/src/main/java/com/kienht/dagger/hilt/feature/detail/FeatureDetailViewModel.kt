package com.kienht.dagger.hilt.feature.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.kienht.dagger.hilt.core.UserModel
import com.kienht.dagger.hilt.core.di.UserModelFeatureQualifier
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author kienht
 * @since 15/09/2020
 */
class FeatureDetailViewModel @Inject constructor(
    @UserModelFeatureQualifier val userModel: UserModel,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
}