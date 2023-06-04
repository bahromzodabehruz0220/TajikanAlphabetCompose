package tj.behruz.alphabet.ui.alphabet

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tj.behruz.alphabet.data.models.Letter
import tj.behruz.alphabet.ui.theme.AppTheme

@Preview(showBackground = true)
@Composable
fun AlphabetItem(letter: Letter,itemHandler:(Letter)->Unit) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .padding(4.dp)
            .clickable {
                itemHandler.invoke(letter)
            }
    ) {
        Row() {
            Text(
                style = AppTheme.typography.h1,
                text = letter.upperCaseLetter,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),

            )
            Image(
                contentScale =ContentScale.Inside,
                modifier = Modifier
                    .width(140.dp)
                    .height(120.dp)
                    .padding(top = 10.dp, end = 10.dp, bottom = 10.dp),
                painter = painterResource(id = letter.mainIcon),
                contentDescription = letter.upperCaseLetter
            )
        }

    }
}