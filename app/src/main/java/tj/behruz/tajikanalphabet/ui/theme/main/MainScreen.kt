package tj.behruz.tajikanalphabet.ui.theme.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import tj.behruz.tajikanalphabet.R
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    var visibleState by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(Unit) {
        delay(1.seconds)
        visibleState = true
    }

    Box(

        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.welcome_page),
                contentScale = ContentScale.FillBounds
            ),
        contentAlignment = Alignment.Center,

        ) {
        AnimatedVisibility(
            visible = visibleState,
            modifier = Modifier
                .fillMaxWidth(),
            enter = slideInVertically() + fadeIn()
        ) {
            Image(
                modifier = Modifier.padding(top = 60.dp).clickable {

                },
                painter = painterResource(id = R.drawable.play_button),
                contentDescription = "play_button"
            )
        }


    }
}