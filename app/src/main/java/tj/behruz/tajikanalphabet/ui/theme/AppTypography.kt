package tj.behruz.tajikanalphabet.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import tj.behruz.tajikanalphabet.R

private val rubik = FontFamily(
    Font(R.font.robotoslab_bold, FontWeight.Bold)
)

private val openSans = FontFamily(
    Font(R.font.robotoslab_bold, FontWeight.Normal)
)
private val robotoSlabBold = FontFamily(
    Font(R.font.robotoslab_semibold)
)

data class AppTypography(
    val h1: TextStyle = TextStyle(
        fontFamily = rubik,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),

    val letterDetailStyle: TextStyle = TextStyle(
        fontFamily = robotoSlabBold,
        fontSize = 48.sp
    )

)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }
