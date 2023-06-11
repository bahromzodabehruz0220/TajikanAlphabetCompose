package tj.behruz.alphabet.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import tj.behruz.alphabet.R


private val robotoSlabBold = FontFamily(
    Font(R.font.robotoslab_semibold)
)

data class AppTypography(
    val h1: TextStyle = TextStyle(
        fontFamily = robotoSlabBold,
        fontWeight = FontWeight.Normal,
        fontSize = 48.sp,
        color = Color(0xFF2979FF)
    ),

    val letterDetailStyle: TextStyle = TextStyle(
        fontFamily = robotoSlabBold,
        fontSize = 80.sp,
        color = Color(0xFF03A9F4)
    )

)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }
