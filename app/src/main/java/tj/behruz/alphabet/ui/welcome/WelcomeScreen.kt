package tj.behruz.alphabet.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import tj.behruz.alphabet.R
import tj.behruz.alphabet.ui.navigation.Screens

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.welcome_page),
                contentScale = ContentScale.FillBounds
            ),
        contentAlignment = Alignment.Center,

        ) {
        Image(
            modifier = Modifier
                .padding(top = 60.dp)
                .clickable {
                    navController.navigate(Screens.MainScreen.route)
                },
            painter = painterResource(id = R.drawable.play_button),
            contentDescription = "play_button"
        )

    }
}