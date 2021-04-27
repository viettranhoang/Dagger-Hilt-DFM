package com.kienht.dagger.hilt.feature

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.kienht.dagger.hilt.core.UserModel
import com.kienht.dagger.hilt.core.di.UserModelSingletonQualifier
import timber.log.Timber
import javax.inject.Inject

/**
 * @author kienht
 * @since 15/09/2020
 */
class FeatureActivity : AppCompatActivity(R.layout.feature_activity) {

    @Inject
    @UserModelSingletonQualifier
    lateinit var singletonUserModel: UserModel

//    @Inject
//    lateinit var savedStateViewModelFactory: DFMSavedStateViewModelFactory

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val featureActivityViewModel by viewModels<FeatureActivityViewModel>{ viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)

        Timber.e("singleton userModel = $singletonUserModel")
        singletonUserModel.value += " => FeatureActivity"
        Timber.e("userModel = ${featureActivityViewModel.userModel}")
    }
}