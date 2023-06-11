package tj.behruz.alphabet.ui.detail

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import tj.behruz.alphabet.R
import tj.behruz.alphabet.data.source.letters
import tj.behruz.alphabet.ui.theme.AppTheme

@Preview
@Composable
fun AlphabetDetailScreen(navController: NavController, letterArg: Int) {
    val currentLetter = letters.find { it.id == letterArg } ?: letters.first()
    val counterState = remember { mutableStateOf(currentLetter) }
    val letterId = remember { mutableStateOf(letterArg) }
    val mediaPlayer = MediaPlayer.create(LocalContext.current, counterState.value.letterSound)

    mediaPlayer.start()

    DisposableEffect(key1 = true) {
        onDispose {
            mediaPlayer.stop()
        }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        val (letter, nextLetter, previousLetter, image, ads, letterSound) = createRefs()

        Text(text = counterState.value.lowerCaseLetter,
            style = AppTheme.typography.letterDetailStyle,
            modifier = Modifier.constrainAs(letter) {
                start.linkTo(parent.start, 16.dp)
                top.linkTo(parent.top, 10.dp)
            })

        Image(painter = painterResource(id = counterState.value.detailIcon),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(image) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                })

        Image(painter = painterResource(id = R.drawable.previous_icon),
            contentDescription = "pre",
            modifier = Modifier
                .constrainAs(previousLetter) {
                    start.linkTo(parent.start, 20.dp)
                    bottom.linkTo(parent.bottom, 30.dp)
                }
                .clickable {
                    mediaPlayer.stop()
                    if (letterId.value == letters.first().id) {
                        letterId.value = 36
                    }
                    letterId.value--
                    counterState.value = letters.find { it.id == letterId.value }!!


                }

        )

        Image(painter = painterResource(id = R.drawable.next_icon),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(nextLetter) {
                    end.linkTo(parent.end, 20.dp)
                    bottom.linkTo(parent.bottom, 30.dp)
                }
                .clickable {
                    mediaPlayer.stop()
                    if (letterId.value >= letters.size) {
                        letterId.value = 0
                    }
                    letterId.value++
                    counterState.value = letters.find { it.id == letterId.value }!!
                })
        Image(painter = painterResource(id = R.drawable.noun_sound),
            contentDescription = "soundIcon",
            modifier = Modifier.constrainAs(letterSound) {
                end.linkTo(parent.end, 16.dp)
                top.linkTo(parent.top, 16.dp)
            })
    }

}