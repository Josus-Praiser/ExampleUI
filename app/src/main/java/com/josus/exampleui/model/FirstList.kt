package com.josus.exampleui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FirstList(@DrawableRes val imageRs:Int, @DrawableRes val imageBg:Int, @StringRes val titleRes:Int, @StringRes val subtitleRes:Int)