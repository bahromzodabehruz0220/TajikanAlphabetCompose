package tj.behruz.tajikanalphabet.data.models

import androidx.annotation.DrawableRes

data class AlphabetModel(
    val id: Int,
    val title: String,
    val subTitle: String,
    @DrawableRes val mainIcon: Int,
    @DrawableRes val desIcon: Int
)