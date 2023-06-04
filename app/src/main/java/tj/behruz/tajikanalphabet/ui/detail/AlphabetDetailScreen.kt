package tj.behruz.tajikanalphabet.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import tj.behruz.tajikanalphabet.R
import tj.behruz.tajikanalphabet.ui.theme.AppTheme

@Preview
@Composable
fun AlphabetDetailScreen(navController: NavController) {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        val (letter, nextLetter, previousLetter, image, ads) = createRefs()

        Text(
            text = "Aa",
            style = AppTheme.typography.letterDetailStyle,
            modifier = Modifier.constrainAs(letter) {
                start.linkTo(parent.start, 10.dp)
                top.linkTo(parent.top, 10.dp)
            })

        Image(painter = painterResource(id = R.drawable.tarvuz_small),
            contentDescription = "",
            modifier = Modifier.constrainAs(image) {
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            })

        Image(painter = painterResource(id = R.drawable.previos_item),
            contentDescription = "pre",
            modifier = Modifier.constrainAs(previousLetter) {
                start.linkTo(parent.start, 20.dp)
                bottom.linkTo(parent.bottom, 30.dp)
            })

        Image(painter = painterResource(id = R.drawable.next_svgrepo_com),
            contentDescription = "",
            modifier = Modifier.constrainAs(nextLetter) {
                end.linkTo(parent.end, 20.dp)
                bottom.linkTo(parent.bottom, 30.dp)
            })
    }

}