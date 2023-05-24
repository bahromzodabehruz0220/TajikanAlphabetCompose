package tj.behruz.tajikanalphabet.ui.alphabet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tj.behruz.tajikanalphabet.R

@Preview(showBackground = true)
@Composable
fun AlphabetItem() {
    Card(
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier

            .padding(4.dp)
    ) {
        Row() {
            Text(
                color = Color.Black,
                text = "Aa",
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                fontSize = 30.sp
            )
            Image(
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
                    .padding(top = 30.dp, end = 10.dp, bottom = 10.dp),
                painter = painterResource(id = R.drawable.tarvuz_small),
                contentDescription = "tarvus"
            )
        }

    }
}