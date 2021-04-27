package com.kienht.dagger.hilt.feature

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

/**
 * @author kienht
 * @since 16/09/2020
 */
class FeatureSharedNavViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
}