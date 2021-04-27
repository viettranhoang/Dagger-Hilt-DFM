package com.kienht.dagger.hilt.feature

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.kienht.dagger.hilt.core.UserModel
import com.kienht.dagger.hilt.core.di.UserModelFeatureQualifier
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author kienht
 * @since 15/09/2020
 */
class FeatureActivityViewModel @AssistedInject constructor(
    @UserModelFeatureQualifier val userModel: UserModel,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
}