package tj.behruz.alphabet.data.models

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

data class Letter(
    val id: Int,
    val upperCaseLetter: String,
    val lowerCaseLetter: String,
    @DrawableRes val mainIcon: Int,
    @DrawableRes val detailIcon: Int,
    val exampleWord: String,
    @RawRes val letterSound: Int
)